package homework5;

//HW5-1: 請設計一個方法為starSquare(int width, int height),當使用者鍵盤輸入寬與高時,即會印出對應的*長方形

import java.util.Scanner;

public class hw5_1 {
	public static void main(String[] args) {
		 Scanner ss = new Scanner(System.in);
		 System.out.println("請輸入寬與高:");
		 int width = ss.nextInt();
		 int height = ss.nextInt();
		 starSquare(width, height);		 
		 
	}

	public static void starSquare(int width, int height) {
		 for (int i = 0; i < height; i++) {
	            for (int j = 0; j < width; j++) {
	                System.out.print("*");
	            }
	            System.out.println(); // 換行
	     }
	}

}
