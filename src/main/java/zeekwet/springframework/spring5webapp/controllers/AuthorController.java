/**
 * 
 */
package zeekwet.springframework.spring5webapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import zeekwet.springframework.spring5webapp.repositories.AuthorRepository;

/**
 * Created by pyaesoneaung on 12/04/2020
 *
 */
@Controller
public class AuthorController {
	
	private final AuthorRepository authorRepository;

	/**
	 * @param authorRepository
	 */
	public AuthorController(AuthorRepository authorRepository) {
		super();
		this.authorRepository = authorRepository;
	}
	
	@RequestMapping("/authors")
	public String getAuthors(Model model) {
		
		model.addAttribute("authors", authorRepository.findAll());
		
		return "authors/list";
	}

}
