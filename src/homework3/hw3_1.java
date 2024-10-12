package homework3;

//HW3-1: 請設計一隻程式,使用者輸入三個數字後,輸出結果會為正三角形、等腰三角形、其它三角形或不是三角形

import java.util.Scanner;

public class hw3_1 {
	public static void main(String[] args) {
		
		// step1: 請使用者輸入三個數字
		Scanner triangle = new Scanner(System.in);
		System.out.println("請輸入第一個數字");
		double a = triangle.nextDouble();
		System.out.println("請輸入第二個數字");
		double b = triangle.nextDouble();
		System.out.println("請輸入第三個數字");
		double c = triangle.nextDouble();
		
		// step2: 判斷邊長是否符合三角形定律: a+b>c, a-b<c
		if ((a+b>c) && (a+c>b) && (b+c>a) && (a-b<c) && (a-c<b) && (b-c<a)) {
			// step3: 判斷為哪一種三角形
			if (a==b && a==c && b==c) {
				System.out.println("正三角形");
			}
			else if (a==b || a==c || b==c) {
				System.out.println("等腰三角形");
			}
			else if (a*a+b*b==c*c || b*b+c*c==a*a || a*a+c*c==b*b) {
				System.out.println("直角三角形");
			}
			else {
				System.out.println("其他三角形");
			}
		} else {
			System.out.println("不是三角形!");
		}
	}
}
