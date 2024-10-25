package homeworkext;

public abstract class Pen {

	// 兩個屬性(封裝設計)
	protected String brand;
	protected double price;

	// 兩個建構子設計(無參數/屬性)
	public Pen() {

	}

	public Pen(String brand, double price) {
		this.brand = brand;
		this.price = price;
	}

	// getter/setter
	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	// 宣告一個抽象方法write()
	public abstract void write();

}
