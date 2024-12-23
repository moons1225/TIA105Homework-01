package work3;

import java.util.Scanner;

public class HomeWork3 {
	public static void main(String[] args) {
		System.out.println("請輸入你討厭哪個數字？");
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		HomeWork3 h = new HomeWork3();
		h.chackNumbers(number);
		sc.close();
	}

	void chackNumbers(int num) {
		int sum = 0;
		for (int i = 1; i < 50; i++) {
			if ((i / 10) != num && i % 10 != num) {
				sum += 1;
				String lineBreak = (sum % 6 == 0) ? "\n" : "\t";
				System.out.print(i + lineBreak);
			}
		}
		System.out.print("總共有" + sum + "個數字可選");
	}
}
