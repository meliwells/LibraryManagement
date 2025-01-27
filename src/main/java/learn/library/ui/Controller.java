package learn.library.ui;

import learn.library.domain.BookService;

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
    }
}
