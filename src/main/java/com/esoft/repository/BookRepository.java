package com.esoft.repository;

import com.esoft.entity.Book;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


/**
 * @author admin
 */
public interface BookRepository extends CrudRepository<Book, Long> {
    /**
     * Find books by title
     * @param title
     * @return
     */
    List<Book> findByTitle(String title);
}
