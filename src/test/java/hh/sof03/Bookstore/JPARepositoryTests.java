package hh.sof03.Bookstore;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import hh.sof03.Bookstore.domain.Book;
import hh.sof03.Bookstore.domain.BookRepository;
import hh.sof03.Bookstore.domain.CategoryRepository;

@ExtendWith(SpringExtension.class) // JUnit5 eli Jupiter
@SpringBootTest
public class JPARepositoryTests {

	@Autowired
	private BookRepository bookRepository;

	@Autowired
	private CategoryRepository categoryRepository;

	@Test
	public void createNewBook() {
		Book book1 = new Book("Game of Thrones", "George Martin", "123-46-9", 1996, 5.00,
				categoryRepository.findByName("Fantasy").get(0));
		bookRepository.save(book1);
		assertThat(book1.getId()).isNotNull();
	}

	@Test
	public void findByTitleShouldReturnAuthor() {

		List<Book> books = bookRepository.findByTitle("Harry Potter");

		assertThat(books).hasSize(1);
		assertThat(books.get(0).getAuthor()).isEqualTo("J.K.Rowling");

	}

}
