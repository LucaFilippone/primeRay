package be.luca.liferay.beans;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

import be.luca.liferay.domain.Book;

@Named
@ViewScoped
public class BooksOverview {
	
	@Inject
	private BooksDB booksDB;
	
	private List<Book> allBooks = new ArrayList<Book>();
	
	@PostConstruct
	public void init(){
		allBooks = booksDB.getAllBooks();
	}

	public List<Book> getAllBooks() {
		return allBooks;
	}

	public void setAllBooks(List<Book> allBooks) {
		this.allBooks = allBooks;
	}
	

	

}
