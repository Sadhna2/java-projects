package day9;

public class Book {
	private int bookId;
    private String title;
    private double price;
	public Book(int bookId, String title, double price) {
		
		this.bookId = bookId;
		this.title = title;
		this.price = price;
	}
	
	public int getBookId() {
		return bookId;
	}
	public void setBookId(int bookid) {
		this.bookId = bookid;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Book [bookid=" + bookId + ", title=" + title + ", price=" + price + "]";
	}
}
