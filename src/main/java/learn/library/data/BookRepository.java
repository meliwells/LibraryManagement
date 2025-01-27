package learn.library.data;

import learn.library.data.model.Book;

import java.util.List;

public interface BookRepository {
    List<Book> findAll() throws DataAccessException;
}
