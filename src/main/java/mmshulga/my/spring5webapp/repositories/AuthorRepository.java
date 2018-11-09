package mmshulga.my.spring5webapp.repositories;

import mmshulga.my.spring5webapp.model.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author, Long> {
}
