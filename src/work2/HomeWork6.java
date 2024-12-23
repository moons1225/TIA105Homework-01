package work2;

public class HomeWork6 {
	public static void main(String[] args) {
		for (int i = 10; i >= 1; i--) {
			for (int j = 1; j <= i; j++)
				System.out.print(j + " ");
			System.out.println();
		}

		// while迴圈寫法
		int i = 10;
		while (i >= 1) {
			int j = 1;
			while (j <= i) {
				System.out.print(j + " ");
				j++;
			}
			i--;
			System.out.println();
		}
	}
}
