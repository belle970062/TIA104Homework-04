package homework4;

/*HW4-3: 有個字串陣列如下 (八大行星):
{“mercury”, “venus”, “earth”, “mars”, “jupiter”, “saturn”, “uranus”, “neptune”}
請用程式計算出這陣列裡面共有多少個母音(a, e, i, o, u)*/

public class hw4_3 {
	public static void main(String[] args) {
		String[] planet = {"mercury", "venus", "earth", "mars", "jupiter", "saturn", "uranus", "neptune"};
		int count = 0;
		
		// 外層迴圈控制字串列元素
		for (int i = 0; i< planet.length; i++) {
			// 內層迴圈檢視每一元素的母音數量
			for (int j = 0; j < planet[i].length(); j++) {
				switch (planet[i].charAt(j)) {                   // 來比每個單字是否出現母音
				case 'a', 'i', 'e', 'o', 'u':
					count = 1 + count;
				}
			}
		}
		
		System.out.println("母音總共有" + count + "個");	
	}
}
