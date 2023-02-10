package com.exercise.bookstore;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.exercise.bookstore.domain.Book;
import com.exercise.bookstore.domain.BookRepository;

@SpringBootApplication
public class BookstoreApplication {

	public static void main(String[] args) {
		SpringApplication.run(BookstoreApplication.class, args);
	}
	
	@Bean
	public CommandLineRunner demo(BookRepository repository) {return (args) -> {
	 Book test = new Book("Harry Potter", "J.K.Rowling", "123-46-8", 2001, 5.00);
	 
	 repository.save(test);
	};
	}

}
