package homework2;

//HW2-1: 計算1~1000的偶數和
public class hw2_1 {
	public static void main(String[] args) {
		int i;
		int sum = 0;
		for (i = 1; i <= 1000; i++) {
			if(i % 2 ==0) {
				sum += i;
			}
		}
		System.out.println("1~1000的偶數和為" + sum);
	}
}
