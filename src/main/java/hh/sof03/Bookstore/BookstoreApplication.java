package hh.sof03.Bookstore;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import hh.sof03.Bookstore.domain.Book;
import hh.sof03.Bookstore.domain.BookRepository;
import hh.sof03.Bookstore.domain.Category;
import hh.sof03.Bookstore.domain.CategoryRepository;

@SpringBootApplication
public class BookstoreApplication {

	public static void main(String[] args) {
		SpringApplication.run(BookstoreApplication.class, args);
	}

	@Bean
	public CommandLineRunner demo(BookRepository bookRepository, CategoryRepository categoryRepository) {
		return (args) -> {
			categoryRepository.save(new Category("Action and Adventure"));
			categoryRepository.save(new Category("Classics"));
			categoryRepository.save(new Category("Comic Book or Graphic Nove"));
			categoryRepository.save(new Category("Detective and Mystery"));
			categoryRepository.save(new Category("Fantasy"));

			bookRepository.save(new Book("Harry Potter", "J.K.Rowling", "123-46-8", 2001, 5.00,
					categoryRepository.findByName("Fantasy").get(0)));
			
			

		};
	}

}
