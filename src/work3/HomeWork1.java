package work3;

import java.util.Scanner;

//請設計一隻程式，使用者輸入三個數字後，輸出結果會為正三角形、等腰三角形、其它三角形或不是三角形
public class HomeWork1 {
	public static void main(String[] args) {
		System.out.println("輸入三個數字");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		boolean j = Math.pow(a, 2) + Math.pow(b, 2) == Math.pow(c, 2);
		boolean k = Math.pow(a, 2) + Math.pow(c, 2) == Math.pow(b, 2);
		boolean i = Math.pow(b, 2) + Math.pow(c, 2) == Math.pow(a, 2);
		if (a <= 0 || b <= 0 || c <= 0) {
			System.out.println("不是三角形");
		} else if (a == b && b == c) {
			System.out.println("正三角形");
		} else if (a == b || b == c || a == c) {
			System.out.println("等腰角形");
		} else if (j || k || i) {
			System.out.println("直角三角形");
		} else if (a != b && b != c && a != c) {
			System.out.println("其它三角形");
		}
		sc.close();
	}
}
