package learn.library.ui;

public enum MenuOption {
    EXIT("0. Exit"),
    FIND_BOOKS_BY_CATEGORY("1. Find Books by Category"),
    ADD_A_BOOK("2. Add a Book"),
    UPDATE_A_BOOK("3. Update a Book"),
    REMOVE_A_BOOK("4. Remove a Book");

    private String message;

    MenuOption(String message) {this.message = message;}

    public String getMessage() {return message;}
}


//Main Menu
// =========
// 0. Exit
// 1. Find Books by Category
// 2. Add a Book
// 3. Update a Book
// 4. Remove a Book
// Select [0-4]: