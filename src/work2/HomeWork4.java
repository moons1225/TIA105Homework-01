package work2;

// 請設計一隻Java程式，輸出結果為以下：1 4 9 16 25 36 49 64 81 100
public class HomeWork4 {
	public static void main(String[] args) {
		for (int num = 1; num <= 10; num++) {
			System.out.print(num * num + " ");
		}

		// while迴圈
		int num = 1;
		while (num <= 10) {
			System.out.print(num * num + " ");
			num++;
		}
	}
}
