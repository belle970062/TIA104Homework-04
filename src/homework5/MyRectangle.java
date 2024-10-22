package homework5;

public class MyRectangle {
	
	//兩個double型態~
	double width;
	double depth;
	
	//不帶參數也無內容的建構子
	public MyRectangle() {
		
	}
	
	//傳入引數會指定給對應的屬性
	public MyRectangle(double width, double depth) {
		this.width = width;
		this.depth = depth;
	}
	
	
	//三個get/set方法~
	public void setWidth(double width) {
		this.width = width;
	}
	
	public double getWidth() {
		return width;
	}
	
	public void setDepth(double depth) {
		this.depth = depth;
	}
	
	public double getDepth() {
		return depth;
	}
	
	public double getArea() {
		double area = width * depth;
		return area;
	}
}
