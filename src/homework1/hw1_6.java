package homework1;

public class hw1_6 {
	public static void main(String[] args) {
		
		// 5+5為數字相加，故5+5=10
		System.out.println(5 + 5);
		
		//5+'5'為數字加字元，5對照Unicode表為U+0035，以16進位轉10進位得 16*3+5=53，故5+53=58
		System.out.println(5 + '5');
		
		//5+"5"為數字加字串，串接後得結果5+"5"=55
		System.out.println(5 + "5");
	}

}
