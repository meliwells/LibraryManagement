package learn.library.ui;

import learn.library.data.DataAccessException;
import learn.library.data.model.Book;
import learn.library.domain.BookService;

import java.util.List;
import java.util.Scanner;

public class Controller {

    //private final BookService service;
    //private final View view;

    /*public Controller(BookService service, View view) {
        this.service = service;
        this.view = view;
    }*/

    public Controller() {
    }

//run() - pull over from main.java when working


    /*public void printMainMenu() throws DataAccessException {
        view.displayMessage("------Main Menu------");
        System.out.println("0. Exit");
        System.out.println("1. Find By Category");
    }*/



    /*private void selectChoice() throws DataAccessException {
        int choice = scanner.nextInt();
            switch (choice) {
                case FIND_BOOKS_BY_CATEGORY:
                    displayBooksByCategory();
                    break;
                case ADD_A_BOOK:
                    addABook();
                    break;
                case UPDATE_A_BOOK:
                    updateABook();
                    break;
                case REMOVE_A_BOOK:
                    removeABook();
                    break;
            }
        } while (option != MenuOption.EXIT);
    }*/




    /*
    public void displayBooksByCategory() throws DataAccessException {
        List<Book> books = service.findAll();
        view.displayAllCategories(books);

    }

    public void addABook() throws DataAccessException {
        Book book = view.addNewBook();
        BookResult result = service,add(book);
        view.printResult(result);
    }

    public void updateABook() throws DataAccessException {

    }

    public void removeABook() throws DataAccessException {

    } */
}


//FIND_BOOKS_BY_CATEGORY
//    ADD_A_BOOK
//    UPDATE_A_BOOK
//    REMOVE_A_BOOK