package jbasedconfig;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("nexturn.properties")
public class NexturnConfiguration {
	@Value("${book.id}")
	private int id;
	@Value("${book.title}")
	private String title;
	@Value("${book.author}")
	private String author ;
	
	@Bean
	public Book getBook() {
		
		Book book=new Book();
		book.setId(id);
		book.setTitle(title);
		book.setAuthor(author);
		return book;
	}
}
