/**
 * 
 */
package zeekwet.springframework.spring5webapp.bootstrap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import zeekwet.springframework.spring5webapp.domain.Author;
import zeekwet.springframework.spring5webapp.domain.Book;
import zeekwet.springframework.spring5webapp.domain.Publisher;
import zeekwet.springframework.spring5webapp.repositories.AuthorRepository;
import zeekwet.springframework.spring5webapp.repositories.BookRepository;
import zeekwet.springframework.spring5webapp.repositories.PublisherRepository;

/**
 * Created by pyaesoneaung on 12/04/2020
 *
 */

@Component
public class BootStrapData implements CommandLineRunner {

	private final BookRepository bookRepository;
	private final AuthorRepository authorRepository;
	private final PublisherRepository publisherRepository;
	
	
	/**
	 * @param bookRepository
	 * @param authorRepository
	 */
	public BootStrapData(BookRepository bookRepository, AuthorRepository authorRepository, PublisherRepository publisherRepository) {
		super();
		this.bookRepository = bookRepository;
		this.authorRepository = authorRepository;
		this.publisherRepository = publisherRepository;
	}


	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		Publisher pyaesone = new Publisher();
		pyaesone.setName("pyae sone aung");
		pyaesone.setCity("Yangon");
		pyaesone.setState("Yangon");
		publisherRepository.save(pyaesone);
		
		Author psa = new Author("pyae sone","aung");
		Book psabook = new Book("To become a Software Engineer","1500");
		psa.getBooks().add(psabook);
		psabook.getAuthors().add(psa);
		
		psabook.setPublishers(pyaesone);
		pyaesone.getBooks().add(psabook);
		
		authorRepository.save(psa);
		bookRepository.save(psabook);
		publisherRepository.save(pyaesone);
		
		Author ths = new Author("Thet Hnin","Swe");
		Book thsbook = new Book("To become a Makeup Artist","1500");
		ths.getBooks().add(thsbook);
		thsbook.getAuthors().add(ths);
		
		thsbook.setPublishers(pyaesone);
		pyaesone.getBooks().add(thsbook);
		
		authorRepository.save(ths);
		bookRepository.save(thsbook);
		publisherRepository.save(pyaesone);
		
		System.out.println("Started in Bootstrap");
		System.out.println("Number of books "+bookRepository.count());
		System.out.println("Publisher Number of books "+ pyaesone.getBooks().size());
	}
	
	

}
