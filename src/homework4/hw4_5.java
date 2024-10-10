package homework4;

/*HW4-5: 請設計由鍵盤輸入三個整數,分別代表西元yyyy年,mm月,dd日,執行後會顯示是該年的第幾天
例:輸入 1984 9 8 三個號碼後,程式會顯示「輸入的日期為該年第252天」*/

import java.util.Scanner;

public class hw4_5 {
	public static void main(String[] args) {
		
		// step1: 輸入年份、月份、日期
        Scanner date = new Scanner(System.in);
		System.out.println("請輸入年份 (yyyy):");
		int year = date.nextInt();
		System.out.println("請輸入月份 (mm):");
		int month = date.nextInt();
		System.out.println("請輸入日期 (dd):");
		int day = date.nextInt();
		
        // step2: 檢查輸入的月份和日期是否有效
        if (!isValidDate(year, month, day)) {
            System.out.println("輸入的日期不正確。");
            return; // 結束程式
        }

        // step3: 計算該日期是該年的第幾天
        int dayOfYear = calculateDayOfYear(year, month, day);
        
        // step4: 輸出結果
        System.out.println("輸入的日期為該年第 " + dayOfYear + " 天");
    }

	// isValidDate: 檢查輸入的月份和日期是否有效
	public static boolean isValidDate(int year, int month, int day) {
        // 檢查月份是否有效
        if (month < 1 || month > 12) {
            return false;
        }
        
        int[] daysInMonth = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
     
        // 檢查是否為閏年
        if (isLeapYear(year)) {
            daysInMonth[1] = 29; // 二月天數設定為29
        }
        
        //檢查日期是否有效
        return day > 0 && day <= daysInMonth[month - 1];
	}
	
	// calculateDayOfYear: 計算該日期是該年的第幾天
	public static int calculateDayOfYear(int year, int month, int day) {
        // 每個月份的天數
        int[] daysInMonth = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
        
        // 判斷是否為閏年
        if (isLeapYear(year)) {
            daysInMonth[1] = 29; // 二月天數設定為29
        }

        // 計算截至指定月份的天數
        int dayOfYear = 0;
        for (int i = 0; i < month - 1; i++) {
            dayOfYear += daysInMonth[i];
        }
        dayOfYear += day; // 加上當月的天數
        return dayOfYear;
    }
	
	// isLeapYear: 判斷是否為閏年(能被 4 整除且不能被 100 整除 or 可以被 400 整除)
	public static boolean isLeapYear(int year) {
	    return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
	}
	 
}
