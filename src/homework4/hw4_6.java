package homework4;

// HW4-6: 班上有8位同學,他們進行了6次考試結果如下，請算出每位同學考最高分的次數
// 待修!!!
public class hw4_6 {
	public static void main(String[] args) {
		int[][] grades = {
							{ 10, 35, 40, 100, 90, 85, 75, 70 }, 
							{ 27, 75, 77, 89, 64, 75, 70, 95 },
							{ 100, 70, 79, 90, 75, 70, 79, 90 },
							{ 77, 95, 70, 89, 60, 75, 85, 89 },
							{ 98, 70, 89, 90, 75, 90, 89, 90 },
							{ 90, 80, 100, 75, 50, 20, 99, 75 }
						};
	// 新增陣列存放每位同學考最高分的次數
	int[] hightestGradeCount = new int[8];
		
	// 外層迴圈遍歷每次考試的分數
    for (int i = 0; i < grades.length; i++) {
        int maxGrade = Integer.MIN_VALUE;

        // 內層回圈找到該次考試的最高分
        for (int j = 0; j < grades[i].length; j++) {
            if (grades[i][j] > maxGrade) {
                maxGrade = grades[i][j];
            }
        }

        // 統計每位同學考最高分的次數
        for (int j = 0; j < grades[i].length; j++) {
            if (grades[i][j] == maxGrade) {
            	hightestGradeCount[j]++;
            } 
        }
    }
    // 輸出每位同學在所有小考中獲得最高分的次數
    for (int i = 0; i < hightestGradeCount.length; i++) {
        System.out.println("同學 " + (i + 1) + " 獲得最高分 " + hightestGradeCount[i] + "次");
    }
	}    
}