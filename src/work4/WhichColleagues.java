package work4;

import java.util.Arrays;
import java.util.Scanner;

public class WhichColleagues {
	public static void main(String[] args) {
		System.out.println("想借多少錢？");
		Scanner scanner = new Scanner(System.in);
		int amount = scanner.nextInt();
		
		// 宣告二維陣列，儲存員工編號和對應可借金額
		int[][] colleague = { { 25, 2500 }, { 32, 800 }, { 8, 500 }, { 19, 1000 }, { 27, 1200 } };
		
		// 呼叫 計算符合條件的員工人數的方法，取得可借的人數
		int sum = getArrayLength(amount, colleague);
		
		// 呼叫 篩選符合條件員工的方法，取得包含員工編號的小陣列
		int[] empId = getColleagueId(amount, colleague, sum);
		
		// 呼叫列印結果的方法
		printTotal(empId, sum);
	}

	//類別方法：取得可以借的員工人數(也就是小陣列的長度)
	public static int getArrayLength(int amount, int[][] colleague) {
		int count = 0;  //計算符合條件的員工
		
		for (int i = 0; i < colleague.length; i++) {
			// 如果金額小於等於該員工可借金額，計數加一
			if (amount <= colleague[i][1])
				count += 1;
		}
		return count;  //回傳符合條件的員工數量
	}

	//類別方法：取得可以借的員工有誰，並放入小陣列
	public static int[] getColleagueId(int amount, int[][] colleague, int sum) {
		
		int[] ids = new int[sum];  //宣告符合條件的員工編號陣列
		
		int i = 0;  //原陣列的索引值
		
		//使用迴圈遍歷符合條件的員工
		for (int j = 0; j < ids.length;i++) {
		//如果金額小於等於該員工可借金額，將員工編號加入小陣列
			if (amount <= colleague[i][1]) {
				ids[j] = colleague[i][0];  //將符合的員工編號加入小陣列
				j++;   //更新小陣列索引
			} else {
			//若不符合條件，跳過該員工，繼續檢查下一位員工
				continue;
			}
		}
		return ids;   //回傳符合條件的員工編號陣列
	}
	//類別方法：列印符合條件的員工編號及人數
	public static void printTotal(int[] empId, int sum) {
		System.out.print("員工編號：");
		//列印每個符合條件的員工編號
		for (int i = 0; i < empId.length; i++) 
			System.out.print(empId[i] + " ");	
		System.out.println("共 " + sum + " 人!");
	}
}
