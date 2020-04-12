package zeekwet.springframework.spring5webapp.repositories;

import org.springframework.data.repository.CrudRepository;

import zeekwet.springframework.spring5webapp.domain.Book;

/**
 * Created by pyaesoneaung on 12/04/2020
 *
 */
public interface BookRepository extends CrudRepository<Book, Long>  {

}
