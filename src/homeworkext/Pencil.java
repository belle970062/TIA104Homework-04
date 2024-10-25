package homeworkext;

public class Pencil extends Pen {

	public Pencil() {

	}

	public Pencil(String name, double price) {
		super(name, price);
	}

	@Override
	public double getPrice() {
		return ((super.getPrice()) * 0.8);
	}

	@Override
	public void write() {
		System.out.println("削鉛筆再寫");

	}

}
