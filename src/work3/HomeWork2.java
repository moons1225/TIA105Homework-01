package work3;

//請設計一隻程式，會亂數產生一個0～9的數字，然後可以玩猜數字遊戲，猜錯會顯示錯誤訊息，猜對則顯示正確訊息
import java.util.Scanner;

public class HomeWork2 {
	public static void main(String[] args) {	
		// 產生一個 0 到 100 之間的隨機數字
		int randomNumber = (int) (Math.random() * 10);
		
		System.out.println("請猜一個數字");
		
		// 創建 Scanner 物件，用來讀取使用者的輸入
		Scanner sc = new Scanner(System.in);
		
		// 無窮迴圈，直到猜對為止
		while (true) {
			int getNumber = sc.nextInt();
			if (randomNumber == getNumber) {
				System.out.println("答對了！答案就是" + randomNumber);
				break;
			} else {
				System.out.println("猜錯囉");
			}
		}
		sc.close();
	}
}
