package mmshulga.my.spring5webapp.repositories;

import mmshulga.my.spring5webapp.model.Publisher;
import org.springframework.data.repository.CrudRepository;

public interface PublisherRepository extends CrudRepository<Publisher, Long> {
}
