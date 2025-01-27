package learn.library.domain;

import learn.library.data.BookRepository;

public class BookService {

    private final BookRepository repository;

    public BookService(BookRepository repository) {this.repository = repository;}
}
