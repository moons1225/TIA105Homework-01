package work4;

import java.util.Scanner;

public class WhichColleagues2 {
	public static void main(String[] args) {
		System.out.println("想借多少錢？");
		Scanner scanner = new Scanner(System.in);
		int amount = scanner.nextInt();
		
		// 宣告二維陣列，儲存員工編號和對應可借金額
		int[][] colleague = { { 25, 2500 }, { 32, 800 }, { 8, 500 }, { 19, 1000 }, { 27, 1200 } };

		// 呼叫方法來取得符合條件的員工編號
		getColleagueId(amount, colleague);
		scanner.close();
	}

	// 類別方法：根據可借金額篩選出符合條件的員工編號，並列印結果
	public static void getColleagueId(int amount, int[][] colleague) {
		System.out.print("員工編號：");
		int count = 0;  //用來計算符合條件的員工數量
		
		for (int i = 0; i < colleague.length; i++) {
			//檢查輸入的金額是否小於或等於員工的可借金額
			if (amount <= colleague[i][1]) {
				System.out.print(colleague[i][0] + " ");
				count += 1;
			}
		}
		System.out.print("共 " + count + " 人!");
	}


}
