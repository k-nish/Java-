package kadai12;

public abstract class TangibleAsset extends Asset implements Thing{
	private double weight;
	private int price;
	private String color;

	//getterメソッド
	public double getWeight(){
		return this.weight;
	}
	public int getPrice() {
		return this.price;
	}

	public String getColor() {
		return this.color;
	}
	
	//setterメソッド
	public void setWeight(double weight){
		this.weight=weight;
	}
	
	public void setPrice(int price){
		this.price=price;
	}
	public void setColor(String color){
		this.color=color;
	}
}
