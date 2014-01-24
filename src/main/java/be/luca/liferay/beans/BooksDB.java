package be.luca.liferay.beans;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;

import be.luca.liferay.domain.Book;

/**
 * Class for simulating the database with books
 * @author contribute
 *
 */
@Named
@ApplicationScoped
public class BooksDB {
	
	private List<Book> allBooks;
	
	@PostConstruct
	public void init(){
		allBooks = new ArrayList<Book>();
		loadSampleData();
	}
	
	private void loadSampleData(){
		allBooks.add(new Book("The hunger games","Suzanne Collins","ISBN1",new Integer(5)));
		allBooks.add(new Book("Twilight","Stephane Meyers","ISBN2",new Integer(4)));
	}

	public List<Book> getAllBooks() {
		return allBooks;
	}

	public void setAllBooks(List<Book> allBooks) {
		this.allBooks = allBooks;
	}

}
