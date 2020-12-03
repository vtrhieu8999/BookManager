package service;

import model.Book;
import model.Category;
import org.springframework.beans.factory.annotation.Autowired;
import repository.BookRepository;

public class CategoryServiceImpl implements CategoryService {
    @Autowired
    private BookRepository bookRepository;

    @Override
    public Iterable<Category> findAll() {
        return bookRepository.findAll();
    }
}
