package homework2;

//HW2-7: 請設計一隻Java程式,輸出結果為以下:
//A
//BB
//CCC
//DDDD
//EEEEE
//FFFFFF
public class hw2_7 {
	public static void main(String[] args) {
		// 外層迴圈控制行數
		for (int i = 1; i <= 6; i++) {
			//計算該行輸出的字母
			char letter = (char)('A'+ i - 1);
			
			for (int j = 0; j < i; j++) {
				System.out.print(letter);	
			}
			// 每行結束後換行
            System.out.println();
		}
	}
}
