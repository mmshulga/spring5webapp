package mmshulga.my.spring5webapp.bootstrap;

import mmshulga.my.spring5webapp.model.Author;
import mmshulga.my.spring5webapp.model.Book;
import mmshulga.my.spring5webapp.repositories.AuthorRepository;
import mmshulga.my.spring5webapp.repositories.BookRepository;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

@Component
public class DevBootstrap implements ApplicationListener<ContextRefreshedEvent> {

    private AuthorRepository authorRepository;
    private BookRepository bookRepository;

    public DevBootstrap(AuthorRepository authorRepository, BookRepository bookRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
    }

    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
        initData();
    }

    private void initData() {
        Author author1 = new Author("Doug", "Lea");
        Book book1 = new Book("Java Concurrency In Practice", "isbn1", "publisher1");
        book1.getAuthors().add(author1);
        author1.getBooks().add(book1);

        authorRepository.save(author1);
        bookRepository.save(book1);

        Author author2 = new Author("Some", "Author");
        Book book2 = new Book("Some book", "isbn2", "publisher2");
        book2.getAuthors().add(author2);
        author2.getBooks().add(book2);

        authorRepository.save(author2);
        bookRepository.save(book2);

    }
}
