package repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.Locale;

public interface CategoryRepository extends PagingAndSortingRepository<Integer, Locale.Category> {
}
