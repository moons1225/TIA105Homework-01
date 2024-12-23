package work3;

import java.util.Arrays;
import java.util.Scanner;

public class HomeWork3_3 {
	public static void main(String[] args) {
		System.out.println("請輸入你討厭哪個數字？");

		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();

		HomeWork3_3 h = new HomeWork3_3();
		int arraySize = h.getLength(number);

		int[] numbers = new int[arraySize];
		numbers = h.checkNumbers(numbers, number);

		h.getLuckyNumber(numbers);

		sc.close();
	}

	// 得到陣列長度的方法
	int getLength(int num) {
		int count = 0;
		for (int i = 1; i <= 49; i++) {
			if ((i / 10) != num && i % 10 != num)
				count++;
		}
		return count;
	}

	// 印出數字並將數字存放進陣列
	int[] checkNumbers(int[] ar, int num) {
		int sum = 0;
		for (int i = 1; i < 50; i++) {
			if ((i / 10) != num && i % 10 != num) {
				ar[sum] = i;
				sum += 1;
				String lineBreak = (sum % 6 == 0) ? "\n" : "\t";
				System.out.print(i + lineBreak);
			}
		}
		System.out.print("總共有" + sum + "個數字可選");
		return ar;
	}

	// 用亂數取得數字(會重複)
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

	// 不重複的數字
	void getLuckyNumber(int[] ar) {
		System.out.println("\n"+"============================");
		int[] luckNumbers = new int[6];
		for (int c = 0; c < luckNumbers.length;) {
			int idx = (int) (Math.random() * ar.length);
			boolean isChosen = false; // 是否重複，false->不重複
			/*
			 * 檢查是否有重複的數字，如果有重複isChosen = true 檢查到重複數字後跳出迴圈
			 */
			for (int j = 0; j < c; j++) {
				if (luckNumbers[j] == ar[idx]) {
					isChosen = true;
					break;
				}
			}
			/*
			 * 如果檢查過後仍然不重複(isChosen = false) 將數字放進小陣列
			 */
			if (!isChosen) {
				luckNumbers[c] = ar[idx];
				c++;
			}
		}
		System.out.println(Arrays.toString(luckNumbers));
	}
}
