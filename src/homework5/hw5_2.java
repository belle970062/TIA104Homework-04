package homework5;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

//HW5-2: 請設計一個方法為randAvg(),從10個 0~100(含100)的整數亂數中取平均值並印出這10個亂數與平均值

public class hw5_2 {
	public static void main(String[] args) {
		randAvg();
	}

	public static void randAvg() {
		Set<Integer> set = new HashSet<>();
		while (set.size() < 10) { 
			int LottoNumber = (int) (Math.random() * 101);
			set.add(LottoNumber);
		}
		System.out.println("本次亂數結果: "); 
		int sum = 0;
		
	    for (int number : set) {
	        System.out.print(number + " ");
	        sum += number;
	    }
    
		 /*
		  * 可用Interator代替
		 Iterator<Integer> num = set.iterator();
		 while (num.hasNext()) {
			int number = num.next();
     		System.out.print(number + " ");
     		sum += number;
     	 }
     	 */
	    
	    System.out.println();
	    
	    double average = sum / 10.0;
	    System.out.println("平均值為: " + average);
				
	}	   
}
