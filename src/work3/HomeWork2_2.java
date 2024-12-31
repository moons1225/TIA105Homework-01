package work3;

import java.util.Scanner;

public class HomeWork2_2 {
	public static void main(String[] args) {
		//產生一個 0 到 100 之間的隨機數字
		int randomNumber = (int) (Math.random() * 101);
		
		System.out.println("請猜一個數字");
		
		// 創建 Scanner 物件，用來讀取使用者的輸入
		Scanner sc = new Scanner(System.in);
		
		 // 無窮迴圈，直到猜對為止
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
