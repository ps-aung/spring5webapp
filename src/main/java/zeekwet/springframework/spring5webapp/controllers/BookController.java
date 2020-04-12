package zeekwet.springframework.spring5webapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import zeekwet.springframework.spring5webapp.repositories.BookRepository;

/**
 * Created by pyaesoneaung on 12/04/2020
 *
 */

@Controller
public class BookController {
	
	private final BookRepository bookRepository;
	
	
	
	/**
	 * @param bookRepository
	 */
	public BookController(BookRepository bookRepository) {
		super();
		this.bookRepository = bookRepository;
	}



	@RequestMapping("/books")
	public String getBooks(Model model) {
		
		model.addAttribute("books",bookRepository.findAll());
		return "books/list";
	}

}
