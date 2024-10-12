package homework3;

//HW3-2: 請設計一隻程式,會亂數產生一個0~100的數字,然後可以玩猜數字遊戲,猜錯會顯示錯誤訊息,猜對則顯示正確訊息,每次猜就會提示你是大於還是小於正確答案

import java.util.Scanner;

public class hw3_2 {
	public static void main(String[] args) {

		// 隨機數產生器
        int secretNumber = (int) (Math.random() * 101);
        
        Scanner x = new Scanner(System.in);
        int guess = -1; // 初始化猜測的數字，確保while迴圈正常執行(guess != secretNumber 都會為 true)

        System.out.println("開始猜數字吧0~100!");

        while (guess != secretNumber) {
            System.out.print("你的猜測是：");
            // 確保使用者輸入的是一個有效的整數
            if (x.hasNextInt()) {
                guess = x.nextInt();

                if (guess < secretNumber) {
                    System.out.println("答錯囉，小於答案!");
                } else if (guess > secretNumber) {
                    System.out.println("答錯囉，大於答案!");
                } else {
                    System.out.println("恭喜！你答對了！答案就是 " + secretNumber);
                }
            } else {
                System.out.println("請輸入一個1~100整數!");
                x.next(); // 清除無效輸入
            }
        }
        x.close();
    }
}		
