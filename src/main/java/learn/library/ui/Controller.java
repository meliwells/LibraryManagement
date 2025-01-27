package learn.library.ui;

import learn.library.data.DataAccessException;
import learn.library.data.model.Book;
import learn.library.domain.BookService;

import java.util.List;

public class Controller {

    private final BookService service;
    private final View view;

    public Controller(BookService service, View view) {
        this.service = service;
        this.view = view;
    }

    public void run() {
        view.printHeader("Welcome to the Library Management System!");
        System.out.println("===========================================");

        try {
            runMenuLoop();
        } catch (DataAccessException ex) {
            view.printHeader("CRITICAL ERROR:" + ex.getMessage());
        }

        view.printHeader("Goodbye");
    }

    private void runMenuLoop() throws DataAccessException {
        MenuOption option;
        do {
            option = view.displayMenuOption();
            switch (option) {
                case FIND_BOOKS_BY_CATEGORY:
                    displayAllBooks();
                    break;
                case ADD_A_BOOK:
                    addABook();
                    break;
            }
        } while (option != MenuOption.EXIT);
    }

    public void displayAllBooks() throws DataAccessException {
        List<Book> books = service.findAll();
        view.printAllBooks(books);
    }

    public void addABook() throws DataAccessException {
        List<Book> books = service.findAll();
    }
}


//FIND_BOOKS_BY_CATEGORY
//    ADD_A_BOOK
//    UPDATE_A_BOOK
//    REMOVE_A_BOOK