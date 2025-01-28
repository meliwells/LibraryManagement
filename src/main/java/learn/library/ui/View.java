package learn.library.ui;

import learn.library.data.model.Book;

import java.util.List;
import java.util.Scanner;

public class View {

    Scanner console = new Scanner(System.in);

//    private static final int CHOICE_EXIT = 0;
//    private static final int CHOICE_FIND_BOOKS_BY_CATEGORY = 1;
//    private static final int CHOICE_ADD_A_BOOK = 2;
//    private static final int CHOICE_UPDATE_A_BOOK = 3;
//    private static final int CHOICE_REMOVE_A_BOOK = 4;
//
//    public void selectChoice() {
//       int choice = scanner.nextInt();
//       switch (choice) {
//           case CHOICE_EXIT:
//               System.out.println("0. Exit");
//               break;
//           case CHOICE_FIND_BOOKS_BY_CATEGORY:
//               System.out.println(" 1. Find Books by Category");
//               break;
//       }
//
//
//
//            System.out.println(" 2. Add a Book");
//            System.out.println(" 3. Update a Book");
//            System.out.println("4. Remove a Book");
//            System.out.println("Select [0-4]:");
//            selectChoice();
//
//    }

    public int getInteger(String prompt) {
        System.out.println(prompt);
        return console.nextInt();
    }

    public void printMainMenu() {
            System.out.println("Welcome to the Library Management System\n");
            System.out.println("============================================\n");
            System.out.println("Main Menu");
            System.out.println("=======\n");
            System.out.println("0. Exit");
            System.out.println("1. Find Books by Category");
            System.out.println("2. Add a Book");
            System.out.println("3. Update a Book");
            System.out.println("4. Remove a Book");
        System.out.println("Select [0-4]:");
    }


}
