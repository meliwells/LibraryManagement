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
    public List<Book> findAll() throws DataAccessException {
        ArrayList<Book> result = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            reader.readLine();
            for (String line = reader.readLine(); line != null; line = reader.readLine()) {
                Book book = lineToBook(line);
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

    @Override
    public List<Book> findByCategory(String category) throws DataAccessException {
        ArrayList<Book> result = new ArrayList<>();
        for (Book book : findAll()) {
            if (book.getCategory() == category) {
                result.add(book);
            }
        }
        return result;
    }

    @Override
    public

    private Book lineToBook(String line) {
        String[] fields = line.split(DELIMITER, -1);
        if (fields.length != 6) {
            return null;
        }
        return new Book(
            fields[0],
            Integer.parseInt(fields[1]),
            Integer.parseInt(fields[2]),
            Integer.parseInt(fields[3]),
            fields[4],
            fields[5]);
    }


    //        this.shelfNumber = shelfNumber;
    //        this.shelfPosition = shelfPosition;
    //        this.yearPublished = yearPublished;
    //        this.author = author;
    //        this.isbn = isbn;

}


// Find Books by Category
// 2. Add a Book
// 3. Update a Book
// 4. Remove a Book