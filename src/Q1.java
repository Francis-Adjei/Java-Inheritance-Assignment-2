class Author{
	
	private String name;
	private String email;
	private char gender;
	
	public Author(String name, String email, char gender) {
		this.name = name;
		this.email = email;
		this.gender = gender;
	}
	public String getName() {
		return name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public char getGender() {
		return gender;
	}

	public String toString() {
	

		return name + "(" + gender + ") at " + email;
	}
	
	
	
}

class Book{
	private String name;
	private Author author;
	private double price;
	private int qty;
	
	public Book(String name, Author author, double price, int qty) {
		
		this.name = name;
		this.author = author;
		this.price = price;
		this.qty = qty;
	}

	public String getName() {
		return name;
	}

	public Author getAuthor() {
		return author;
	}

	public double getPrice() {
		return price;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}

	public int getQty() {
		return qty;
	}

	
	public void setQty(int qty) {
		this.qty= qty;
	}

	@Override
	public String toString() {
		return "'" + name +"' by " + author;
	}
	
	
}
public class Q1 {

	public static void main(String[] args) {
		
		Author obj1 = new Author("Francis Adjei", "francis.adjei@amalitech.org", 'm');
		System.out.println(obj1);
		obj1.setEmail("adjeifrancis1000@gmail.com");
		System.out.println(obj1);
		
		Book obj = new Book("Java is very interesting", obj1 , 89.5 , 800 );
		System.out.println(obj);

	}

}
