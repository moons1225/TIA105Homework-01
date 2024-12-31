package work3;

import java.util.Arrays;
import java.util.Scanner;

public class HomeWork3_2 {
	public static void main(String[] args) {
		System.out.println("請輸入你討厭哪個數字？");

		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();

		// 計算從1到49中，不包含討厭數字的數字數量
		int count = 0;
		for (int i = 1; i <= 49; i++) {
			if ((i / 10) != number && i % 10 != number)
				count++;
		}
		
		 // 創建一個整數陣列，用來存放所有可以選擇的數字
		int[] numbers = new int[count];
		
		// 用來計算可以選擇的數字
		int total = 0;
		for (int i = 1; i < 50; i++) {
			 // 過濾掉包含討厭數字的數字
			if ((i / 10) != number && i % 10 != number) {
				numbers[total] = i;   // 將符合條件的數字放入numbers陣列
				total++;
				String lineBreak = (total % 6 == 0) ? "\n" : "\t";
				System.out.print(i + lineBreak);
			}
		}
		System.out.print("總共有" + total + "個數字可選");

		System.out.println("\n" + "================================");
		
		// 用來存放六個幸運數字的陣列
		int[] luckNumbers = new int[6];
		// 外層迴圈隨機抽取6個幸運數字
		for (int i = 0; i < 6;) {
			// 從大陣列中隨機抽取一個元素索引值
			int idx = (int) (Math.random() * numbers.length); 
			
			boolean isChosen = false;  //判斷是否重複的布林值 先給初始值 f
			
			// 內層迴圈確保抽取的數字不會重複
			for (int j = 0; j < i; j++) {
				 // 如果抽到的數字已經在luckNumbers中，則布林值= t，跳出內迴圈
				if (luckNumbers[j] == numbers[idx]) {
					isChosen = true;
					break;
				}
			}
				if (!isChosen) {   // 如果這個數字還沒被選過，則放入小陣列
					luckNumbers[i] = numbers[idx];
					i++;   //若有數字有放入小陣列後才++
				}
		}
		System.out.print(Arrays.toString(luckNumbers));
		sc.close();
	}
}
