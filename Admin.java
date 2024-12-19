package lower;
import java.util.ArrayList;
import java.util.Date;
public class Admin extends User {
	private ArrayList<Book>Books=new ArrayList<Book>();
	private ArrayList<String>titles=new ArrayList<String>();
	private ArrayList<String>authors=new ArrayList<String>();
	private ArrayList<String>genres=new ArrayList<String>();
	private ArrayList<Date>pubs=new ArrayList<Date>();
	private ArrayList<Integer>chapters=new ArrayList<Integer>();
	public Admin(String name,String password,String Email) {
		super(name,password,Email);
	}
	public void addBook(Book b) {
		if (b instanceof Comics) {  //if it's comic then add 
            Comics comic = (Comics) b; 
            this.chapters.add(comic.getChapters());
            this.Books.add(comic);
            this.titles.add(comic.getTitle());
            this.authors.add(comic.getAuthor());
            this.genres.add(comic.getGenre());
            this.pubs.add(comic.getPub());
        }
		if (b instanceof Novel) { //if it's novel then add hethokom heritage
            Novel novel = (Novel) b; 
            this.chapters.add(novel.getChapters());
            this.Books.add(novel);
            this.titles.add(novel.getTitle());
            this.authors.add(novel.getAuthor());
            this.genres.add(novel.getGenre());
            this.pubs.add(novel.getPub());
        }
		this.Books.add(b);
		this.titles.add(b.getTitle());
		this.authors.add(b.getAuthor());
		this.genres.add(b.getGenre());
		this.pubs.add(b.getPub());
	}
}
