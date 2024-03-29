package ru.novikov.library.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.novikov.library.models.Book;

import java.util.List;
import java.util.Optional;

@Repository
public interface BookRepository extends JpaRepository<Book, Integer> {
    List<Book> findBooksByTitleStartingWith(String title);

    Optional<Book> findBooksByTitle(String title);
}
