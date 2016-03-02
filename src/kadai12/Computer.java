package kadai12;

public class Computer extends TangibleAsset {
	private String makername;

	public Computer(String name, int price, String color, String isbn) {
		setName(name);
		setPrice(price);
		setColor(color);
		setMakername(makername);
	}

	// makernameのgetterメソッド
	public String getMakername() {
		return this.makername;
	}

	// makernameのsetterメソッド
	public void setMakername(String makername) {
		this.makername = makername;
	}
}
