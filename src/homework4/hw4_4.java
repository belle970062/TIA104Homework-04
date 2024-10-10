package homework4;

/*HW4-4: 請設計一個程式,可以讓小華輸入欲借的金額後,便會顯示哪些員工編號的同事
有錢可借他;並且統計有錢可借的總人數:例如輸入 1000 就顯示「有錢可借的
員工編號: 25 19 27 共 3 人!」*/

import java.util.Scanner;

public class hw4_4 {
	public static void main(String[] args) {
		
		int borrow = 0;
		Scanner m = new Scanner(System.in);
		System.out.println("請輸入欲借的金額:");
		
		//先判斷scanner數值是否成立
		if (m.hasNextInt()) {
			borrow = m.nextInt();	
		}
		if (borrow <= 0) {
			System.out.print("請重新輸入!");
		}
		if (borrow > 2500) {
			System.out.println("無人可借!");
		} else {
			System.out.println("有錢可借的員工編號:");
			int count = 0;
			int[][] moneyArray = { { 25, 32, 8, 19, 27 }, { 2500, 800, 500, 1000, 1200 } };
			for (int j = 0; j < moneyArray[1].length; j++) {
				if (moneyArray[1][j] >= borrow) {
					System.out.println(moneyArray[0][j] + "");
					count++;
				}
			}
			
			System.out.println("共" + count + "人");
		}	
	}
}
