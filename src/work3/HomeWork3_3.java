package work3;

import java.util.Arrays;
import java.util.Scanner;

public class HomeWork3_3 {
	public static void main(String[] args) {
		System.out.println("請輸入你討厭哪個數字？");

		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();

		HomeWork3_3 h = new HomeWork3_3();
		// 獲取可選數字的陣列大小
		int arraySize = h.getLength(number);
		
		// 建立一個存放可選數字的陣列
		int[] numbers = new int[arraySize];
		// 呼叫方法，獲取可選數字的陣列
		numbers = h.checkNumbers(numbers, number);
		
		// 獲取不重複的幸運數字
		h.getLuckyNumber(numbers);

		sc.close();
	}

	// 方法：計算可以選擇的數字的陣列長度
	int getLength(int num) {
		int count = 0;  //用於計算可選數字有幾個
		
		for (int i = 1; i <= 49; i++) {
			// 檢查該數字是否不包含討厭的數字
			if ((i / 10) != num && i % 10 != num)
				count++;  //如果不包含，數量加1
		}
		return count;   // 返回可選數字的總數
	}

	 //方法：檢查可選數字並將其存放進陣列，並印出這些數字
	int[] checkNumbers(int[] ar, int num) {
		int sum = 0;  //用於計算有效數字的數量，及當作陣列的索引
		for (int i = 1; i < 50; i++) {
			
			// 該數字是否不包含用戶討厭的數字
			if ((i / 10) != num && i % 10 != num) {
				ar[sum] = i;  // 將有效數字存入陣列
				sum += 1;	  // 增加有效數字 的 計數
				String lineBreak = (sum % 6 == 0) ? "\n" : "\t";  // 每6個數字換行一次
				System.out.print(i + lineBreak);
			}
		}
		System.out.print("總共有" + sum + "個數字可選");
		return ar;
	}

	// 方法：用亂數取得數字(會重複)
//	void getLuckyNumber(int[] ar){
//		System.out.println("\n"+"============================");
//		int[] luckNumbers = new int[6];
//		for (int i = 0; i < 6;) {
//			int idx = (int) (Math.random() * ar.length);
//				luckNumbers[i]=ar[idx];
//				System.out.print(luckNumbers[i] + "\t");
//				i++;
//				}	
//		}	

	// 方法：取得不重複的數字
	void getLuckyNumber(int[] ar) {
		System.out.println("\n"+"============================");
		// 用於存放六個幸運號碼的陣列
		int[] luckNumbers = new int[6];
		
		// 迴圈 直到獲得6個不重複的號碼
		for (int c = 0; c < luckNumbers.length;) {
			// 隨機選擇一個索引
			int idx = (int) (Math.random() * ar.length);
			
			boolean isChosen = false; //標記該數字是否重複，初始值 宣告false->不重複
			
			 //檢查是否有重複的數字，如果有重複isChosen = true 檢查到重複數字後跳出迴圈
			for (int j = 0; j < c; j++) {
				if (luckNumbers[j] == ar[idx]) {
					isChosen = true;
					break;
				}
			}
			 //如果檢查過後仍然不重複(isChosen = false) 將數字放進小陣列
			if (!isChosen) {
				luckNumbers[c] = ar[idx];
				c++;  //確定不重複才增加幸運號碼的計數器
			}
		}
		System.out.println(Arrays.toString(luckNumbers));
	}
}
