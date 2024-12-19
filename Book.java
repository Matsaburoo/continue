package lower;

import java.util.Date;

public class Book {
	private String title;
	private String author;
	private Date pub;
	private String genre;
	public Book(String title,String author,Date pub,String genre) {
		this.title=title;
		this.author=author;
		this.pub=pub;
		this.genre=genre;
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
	public Date getPub() {
		return pub;
	}
	public void setPub(Date pub) {
		this.pub = pub;
	}
	public String getGenre() {
		// TODO Auto-generated method stub
		return genre;
	}
	

}
