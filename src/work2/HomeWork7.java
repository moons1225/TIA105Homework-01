package work2;

public class HomeWork7 {
	public static void main(String[] args) {
		int c = 65;
		for (int i = 1; i <= 6; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print((char) c);
			}
			c += 1;
			System.out.println();
		}
		
		// while迴圈寫法
//		int c = 65, i = 1;
//		while (i <= 6) {
//			int j = 1;
//			while (j <= i) {
//				System.out.print((char) c);
//				j++;
//			}
//			c += 1;
//			i++;
//			System.out.println();
//		}
	}
}
