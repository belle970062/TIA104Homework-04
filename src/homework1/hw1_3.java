package homework1;

// HW1-3: 計算256559秒為幾天、幾時、幾分、幾秒
public class hw1_3 {
	public static void main(String[] args) {
		int num1 = 256559;
		//天
		int days = (num1 / 86400);
		//時
		int hrs = ((num1 % 86400) / 3600);
		//分
		int mins = ((num1 % 86400 % 3600) / 60);
		//秒
		int secs = ((num1 % 86400 % 3600 % 60) % 60);
		
		System.out.println("256559秒為" + days +"天" + hrs + "時" + mins + "分" + secs + "秒");
	}
}
