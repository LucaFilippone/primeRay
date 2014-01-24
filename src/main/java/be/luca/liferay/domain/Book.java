package be.luca.liferay.domain;

public class Book {
	private String title;
	private String author;
	private String isbn;
	private Integer rating;
	
	public Book(){
		
	}
	

	public Book(String title, String author, String isbn, Integer rating) {
		super();
		this.title = title;
		this.author = author;
		this.isbn = isbn;
		this.rating = rating;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public Integer getRating() {
		return rating;
	}

	public void setRating(Integer rating) {
		this.rating = rating;
	}
	
	
	
}
