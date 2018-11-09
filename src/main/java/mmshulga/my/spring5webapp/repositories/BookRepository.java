package mmshulga.my.spring5webapp.repositories;

import mmshulga.my.spring5webapp.model.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Long> {
}
