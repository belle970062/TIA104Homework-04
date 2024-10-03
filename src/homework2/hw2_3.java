package homework2;

//HW2-3: 計算1~10的連乘積(while迴圈)
public class hw2_3 {
	public static void main(String[] args) {
		int i = 1;
		int product = 1;
		while(i <= 10) {
			product *= i;
			i++;
		}
		System.out.println("1~10的連乘積為" + product);
	}
}
