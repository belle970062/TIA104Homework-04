package homework4;

/*HW4-2: 請建立一個字串,經過程式執行後,輸入結果是反過來的
例如String s = “Hello World”,執行結果即為dlroW olleH */

public class hw4_2 {
	public static void main(String[] args) {
		String s = "Hello World";
	    String reversed = "";

	        for (int i = s.length() - 1; i >= 0; i--) {
	            reversed += s.charAt(i);
	        }
	        System.out.println(reversed);
	}
}
