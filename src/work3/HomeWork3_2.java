package work3;

import java.util.Arrays;
import java.util.Scanner;

public class HomeWork3_2 {
	public static void main(String[] args) {
		System.out.println("請輸入你討厭哪個數字？");

		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();

		int count = 0;
		for (int i = 1; i <= 49; i++) {
			if ((i / 10) != number && i % 10 != number)
				count++;
		}

		int[] numbers = new int[count];

		int sum = 0;
		for (int i = 1; i < 50; i++) {
			if ((i / 10) != number && i % 10 != number) {
				numbers[sum] = i;
				sum++;
				String lineBreak = (sum % 6 == 0) ? "\n" : "\t";
				System.out.print(i + lineBreak);
			}
		}
		System.out.print("總共有" + sum + "個數字可選");

		System.out.println("\n" + "================================");

		int[] luckNumbers = new int[6];
		for (int i = 0; i < 6;) {
			int idx = (int) (Math.random() * numbers.length);
			boolean isChosen = false;
			for (int j = 0; j < i; j++) {
				if (luckNumbers[j] == numbers[idx]) {
					isChosen = true;
					break;
				}
			}
				if (!isChosen) {
					luckNumbers[i] = numbers[idx];
					i++;
				}
		}
		System.out.print(Arrays.toString(luckNumbers));
		sc.close();
	}
}
