package learn.library.data;

import learn.library.data.model.Book;

import java.util.List;

public interface BookRepository {
    List<Book> findAll() throws DataAccessException;

    //Book add(Book book) throws DataAccessException;

    //boolean update(Book book) throws DataAccessException;

    //List<Book> findByCategory() throws DataAccessException;

    //Book remove(Book book) throws DataAccessException;


    //find by category
    //update book
    //remove book

    //*BookRepository.java  -interface defining CRUD operations for a book
    //Book add(Book) method
    //List<Book> findAll() method
}
