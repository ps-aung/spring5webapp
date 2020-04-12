package zeekwet.springframework.spring5webapp.repositories;

import org.springframework.data.repository.CrudRepository;

import zeekwet.springframework.spring5webapp.domain.Author;

/**
 * Created by pyaesoneaung on 12/04/2020
 *
 */
public interface AuthorRepository extends CrudRepository<Author, Long> {

}
