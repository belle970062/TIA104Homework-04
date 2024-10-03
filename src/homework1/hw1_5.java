package homework1;

// HW1-5: 存入150萬，年利率2%，計算10年後本利和

// 複利計算公式：本利和 = 本金 × (1 + 年利率)^期間
// Math.pow(x,y)= 計算x的y次方

public class hw1_5 {
	public static void main(String[] args) {
		int pv = 1500000, n=10;
		double r = 0.02;
		double fv = pv * Math.pow(1 + r, n);
		
		System.out.printf("本金加利息共有" + fv + "元");
	}
}
