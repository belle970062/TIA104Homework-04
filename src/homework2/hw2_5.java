package homework2;

//HW2-5: 設計一支程式，輸出阿文可以選擇的樂透數字(1~49且數字不能有4)，並計算有幾個
public class hw2_5 {
	public static void main(String[] args) {
	
		int total = 0;
		System.out.println("阿文可選擇的數字為：");
		for (int i = 1; i <= 49; i++) {
			if ((i / 10 != 4) && (i % 10 != 4)){
				System.out.print(i);
				System.out.println("");
				total++;
			}
		}
		System.out.println("");
		System.out.println("可選擇的數字總共有" + total + "個");
	}
}
