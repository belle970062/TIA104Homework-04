package homework5;

import java.util.Random;

//HW5-5: 請設計一個方法genAuthCode(),當呼叫此方法時,會回傳一個8位數的驗證碼,此驗證碼內容包含了英文大小寫與數字的亂數組合

public class hw5_5 {
	public static void main(String[] args) {
		
		System.out.println(getAuthCode(8));
	}

	public static String getAuthCode(int n) {
		String string = "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
		char[] captcha = new char[n]; //宣告一個字元陣列物件儲存驗證碼
		for (int i = 0; i < n; i++) {
			Random random = new Random();
			int index = random.nextInt(string.length());
			captcha[i] = string.charAt(index);
		}
		
		String result = String.valueOf(captcha);
		return result;
	}
}
