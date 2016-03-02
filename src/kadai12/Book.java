package kadai12;

public class Book extends TangibleAsset {
	private String isbn;

	public Book(String name, int price, String color, String isbn) {
		setName(name);
		setPrice(price);
		setColor(color);
		setIsbn(isbn);
	}

	// isbnのgetterメソッド
	public String getIsbn() {
		return this.isbn;
	}

	// isbnのsetterメソッド
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
}
