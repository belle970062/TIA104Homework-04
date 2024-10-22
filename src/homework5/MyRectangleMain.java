package homework5;

public class MyRectangleMain {
	public static void main(String[] args) {
		
		//使用public MyRectangle()建構子建立物件,設定width, depth為10, 20,透過getArea()印出結果
		
		MyRectangle r1 = new MyRectangle();
		r1.setWidth(10);
		r1.setDepth(20);
		System.out.println("r1面積為" + r1.getArea());
		
		//使用public MyRectangle(double width, double depth)建構子建立物件,設定width, depth為10, 20,透過getArea()印出結果
		MyRectangle r2 = new MyRectangle(10, 20);
		System.out.println("r2面積為" + r2.getArea());
	}
}
