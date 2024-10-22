package homework5;


//HW5-3: 利用Overloading,設計兩個方法int maxElement(int x[][])與double maxElement(double x[][]),可以找出二維陣列的最大值並回傳

public class hw5_3 {

	// int maxElement
	public static int maxElement(int[][] x) {
		int max = Integer.MIN_VALUE; //初始化最大值為最小整數，再遍歷陣列比大小
		for (int i = 0; i < x.length; i++) {
			for (int j = 0; j< x[i].length; j++) {
				if(x[i][j] > max) {
					max = x[i][j];
				}
			}
		}
		return max;
	}
	
	//double maxElement
	public static double maxElement(double[][] y) {
		double max = Double.NEGATIVE_INFINITY; //初始化最大值為最小浮點數，再遍歷陣列比大小
		for (int i = 0; i < y.length; i++) {
			for (int j = 0; j< y[i].length; j++) {
				if(y[i][j] > max) {
					max = y[i][j];
				}
			}
		}
		return max;
	}
	
	public static void main(String[] args) {
		int[][] intArray = {
				{1, 6, 3},
				{9, 5, 2}
				};
		
		double[][] doubleArray = {
				{1.2, 3.5, 2.2},
				{7.4, 2,1, 8,2}
				};	
		
		System.out.println(maxElement(intArray));
		System.out.println(maxElement(doubleArray));
	}

}
