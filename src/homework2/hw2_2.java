package homework2;

//HW2-2: 計算1~10的連乘積(for迴圈)
public class hw2_2 {
	public static void main(String[] args) {
		int i;
		int product = 1;
		for (i = 1; i <= 10; i++) {
			product *= i;
		}
		System.out.println("1~10的連乘積為" + product);
	}
}
