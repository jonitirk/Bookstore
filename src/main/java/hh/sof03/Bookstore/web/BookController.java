package hh.sof03.Bookstore.web;

import java.util.ArrayList;
import java.util.List;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import hh.sof03.Bookstore.domain.Book;

public class BookController {

	@GetMapping("/index")
	public String getBook(Model model) {
		
		List<Book> books = new ArrayList<Book>();
		model.addAttribute("books", books);
		
		return "booklist";
		
	}
}
