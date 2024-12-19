package lower;
import java.util.Date;


public class Comics extends Book {
	private int chapters;
	public Comics(String name,String author,Date pub,String genre,int chapters) {
		super(name,author,pub,genre);
		this.chapters=chapters;
	}
	public Comics(String name, String author, Date pub, String genre) {
        this(name, author, pub, genre, 0);//par defaut y7ot 0
	}
	public int getChapters() {
		return chapters;
	}
	public void setChapters(int chapters) {
		this.chapters = chapters;
	}
	
    
}
