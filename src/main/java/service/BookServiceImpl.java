package service;

import model.Book;
import org.springframework.beans.factory.annotation.Autowired;
import repository.BookRepository;

public class BookServiceImpl implements BookService {

        @Autowired
        private BookRepository bookRepository;

        @Override
        public Iterable<Book> findAll() {
            return bookRepository.findAll();
        }

        @Override
        public Book findById(Integer id) {
            return bookRepository.findOne(id);
        }

        @Override
        public void save(Book province) {
            bookRepository.save(province);
        }

        @Override
        public void remove(Integer id) {
            bookRepository.delete(id);
        }

}
