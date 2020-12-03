package service;

import model.Book;

public interface BookService {
    Iterable<Book> findAll();

    Book findById(Integer id);

    void save(Book province);

    void remove(Integer id);
}
