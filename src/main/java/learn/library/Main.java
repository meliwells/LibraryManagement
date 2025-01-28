package learn.library;

//import learn.library.data.BookFileRepository;
import learn.library.ui.Controller;
import learn.library.ui.View;

public class Main {
    public static void main(String[] args) {
        Controller controller = new Controller();
        View view = new View();

        view.printMainMenu();

        //get int from user
        int choice = view.getInteger("Enter a number: ");
        //confirm
        System.out.println("You pressed number " + choice);



        //switch to print selection and add commented out method name

        //when this works, move to a while loop in the run method

//
//
//
//        switch(choice) {
//            view.displayMessage()
//        }

        //BookFileRepository repository = new BookFileRepository("");

        /*
        /library
            /data
                /model
                    *Book.java  -pojo (plain old java object) storing all info for a book
                    Category.java  -enum for storing types of books (fantasy, mystery, Sci-fi, etc.)
                (outside of model, but in data)
                DataAccessException.java  -custom exception thrown by repositories -same as in memories
                *BookRepository.java  -interface defining CRUD operations for a book
                    Book add(Book) method
                    List<Book> findAll() method
                *BookFileRepository.java  -implementing the methods fromBookRepository, interacts with file system to save/load from a text files

            /domain
                *BookService.java  -validate user input before saving
                    validate(Book)

            /ui
                *View.java  -handles all input and output operations
                *Controller.java  -runs application, manages operations
                //print starting menu


            Main.java initialize ui     

         */
    }
}