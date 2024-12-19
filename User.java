package lower;
import java.util.ArrayList;
public class User {
	private String name;
	private String password;
	private String Email;
	private ArrayList<Book> fav=new ArrayList<Book>();
	private ArrayList<Book> later=new ArrayList<Book>();
	User(String name,String password,String Email){
		this.name=name;
		this.password=password;
		this.Email=Email;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	//-----------------------------------------
	public void  addFav(Book b) {
		this.fav.add(b);
		
	}
	public void removeFav(Book b) {
		if(this.fav.contains(b)) {
			this.fav.remove(b);
		}else {
			System.out.println("it doesn't exist");
		}
	}
	public void Readlater(Book b) {
		this.later.add(b);

	}
	public void Removelater(Book b) {
		if(this.later.contains(b)) {
			this.later.remove(b);
		}else {
			System.out.println("it doesn't exist");
		}
		
	}

}
