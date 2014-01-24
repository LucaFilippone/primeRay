package be.luca.liferay.beans;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import be.luca.liferay.domain.Book;

@Named
@RequestScoped
public class EditBookBean {

	private String mode;
	private Book book;

	@Inject
	private BooksDB allBooks;

	@PostConstruct
	public void init(){
		book = new Book();
	}
	
	public String saveAndReturn() {

		allBooks.getAllBooks().add(getBook());

		return "view.xhtml";
	}

	public String getMode() {
		return mode;
	}

	public void setMode(String mode) {
		this.mode = mode;
	}

	public Book getBook() {
		return book;
	}

	public void setBook(Book book) {
		this.book = book;
	}

}
