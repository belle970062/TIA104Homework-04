package homework3;

/*阿文很喜歡簽大樂透(1~49),但他是個善變的人,上次討厭數字是4,但這次他想要依心情決定討厭哪個數字,
 請您設計一隻程式,讓阿文可以輸入他不想要的數字(1~9),畫面會顯示他可以選擇的號碼與總數*/

import java.util.Scanner;

public class hw3_3 {
	public static void main(String[] args) {
		
		Scanner dis = new Scanner(System.in);
		System.out.println("請阿文輸入一個討厭的數字~^^");
		int num = dis.nextInt();
		
		while (num < 1 || num > 9) {
			System.out.println("輸入無效，請輸入1~9的數字");
			num = dis.nextInt();
		}
		
		int total = 0;
		for (int i = 1; i <= 49; i++) {
			if (i >= 10 && (i / 10 != num) && (i % 10 != num) || (i < 10 && (i % 10 != num))){
				System.out.print(i);
				System.out.println("");
				total++;
			}
		}
		
		System.out.println("");
		System.out.println("可選擇的數字總共有" + total + "個");
		
	}
}
