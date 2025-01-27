package learn.library.data;

public class BookFileRepository implements BookRepository{
    private static final String DELIMITER = "~";
    private final String filePath;

    public BookFileRepository(String filePath) {this.filePath = filePath;}


}
