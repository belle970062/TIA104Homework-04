package homework1;

// HW1-4: 半徑為5的圓面積與周長
public class hw1_4 {
	public static void main(String[] args) {
		final double d1 = 3.1415;
		int r = 5;		
		//面積
		double value1 = r*r*d1;
		//周長
		double value2 = r*2*d1;
		
		System.out.printf("圓面積為" + "%.4f%n" ,value1);
		System.out.printf("圓周長為" + "%.4f" ,value2);
	}
}
