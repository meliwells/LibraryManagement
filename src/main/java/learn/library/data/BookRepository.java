package learn.library.data;

import java.util.List;

public interface BookRepository {
    List<Book> findAll() throws DataAccessException;
}
