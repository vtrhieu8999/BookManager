package service;

import model.Book;
import model.Category;

public interface CategoryService {
    public Iterable<Category> findAll();
}
