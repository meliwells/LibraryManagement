package learn.library.data;

import learn.library.data.model.Book;
import learn.library.data.model.Category;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class BookFileRepository implements BookRepository{
    private static final String DELIMITER = "~";
    private final String filePath;

    public BookFileRepository(String filePath) {this.filePath = filePath;}

    @Override
    public List<Book> findByCategory(Category category) throws DataAccessException {
        ArrayList<Book> result = new ArrayList<>();
        for (Book book : findAll()) {
            if (book.getCategory() == book.category) {
                result.add(book);
            }
        }
        return result;
    }

    @Override
    public List<Book> findAll() throws DataAccessException {
        ArrayList<Book> result = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            reader.readLine();
            for (String line = reader.readLine(); line != null; line = reader.readLine()) {
                Book book = deserialize(line);
                if (book != null) {
                    result.add(book);
                }
            }
        } catch (FileNotFoundException e) {

        } catch (IOException e) {
            throw new DataAccessException("Could not open the file path: " + filePath, e);
        }

        return result;
    }

    private Book lineToBook(String line) {
        String[] fields = line.split(DELIMITER);
        if (fields.length != 6) {
            return null;
        }
        return new Book(
                Integer.parseInt(fields[0]),
                fields[1],
                fields[2],
                fields[3],
                fields[4],
                "true".equals(fields[5])
        );
    }


}


// Find Books by Category
// 2. Add a Book
// 3. Update a Book
// 4. Remove a Book