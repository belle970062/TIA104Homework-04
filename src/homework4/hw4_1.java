package homework4;

/*HW4-1: 有個一維陣列如下:
{29, 100, 39, 41, 50, 8, 66, 77, 95, 15}
請寫出一隻程式能輸出此陣列所有元素的平均值與大於平均值的元素 */

public class hw4_1 {
	public static void main(String[] args) {
		int[] intArray = {29, 100, 39, 41, 50, 8, 66, 77, 95, 15};
       
        int sum = 0;
        for (int i = 0; i < intArray.length; i++) {
			sum += intArray[i];
		}
       
        double avg = sum / intArray.length;
        System.out.println("所有元素平均值為" + avg);
		System.out.println("======================");
		
		System.out.print("大於平均值的元素有");
		for (int i = 0; i < intArray.length; i++) {
			if (intArray[i] > avg) {
			System.out.print(intArray[i] + " ");
			}
		}
	}
}