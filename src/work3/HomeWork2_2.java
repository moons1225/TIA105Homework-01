package work3;

import java.util.Scanner;

public class HomeWork2_2 {
	public static void main(String[] args) {
		int randomNumber = (int) (Math.random() * 101);
		System.out.println("請猜一個數字");
		Scanner sc = new Scanner(System.in);
		while (true) {
			int getNumber = sc.nextInt();
			if (randomNumber == getNumber) {
				System.out.println("答對了！答案就是" + randomNumber);
				break;
			} else if (randomNumber > getNumber) {
				System.out.println("猜大一點的數字");
			} else {
				System.out.println("猜小一點的數字");
			}
		}
		sc.close();
	}
}
