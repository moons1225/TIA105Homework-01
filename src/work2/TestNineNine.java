package work2;

public class TestNineNine {
	public static void main(String[] args) {

		// 使用for迴圈+while迴圈
		int num1, num2;
		for (num1 = 1; num1 <= 9; num1++) {
			num2 = 1;
			while (num2 <= 9) {
				int ans = num1 * num2;
				System.out.print(num1 + " * " + num2 + " = " + ans + "\t");
				num2++;
			}
			System.out.println();
		}
		System.out.println("==========================================");
//		使用for迴圈 + do while迴圈
//		int num1 , num2;   //第一個迴圈已宣告過了
		for (num1 = 1; num1 <= 9; num1++) {
			num2 = 1;
			do {
				int ans = num1 * num2;
				System.out.print(num1 + " * " + num2 + " = " + ans + "\t");
				num2++;
			} while (num2 <= 9);
			System.out.println();
		}
		System.out.println("==========================================");
		// 使用while 迴圈 + do while迴圈
//		int num1 = 1,num2;  //第一個迴圈已宣告過了
		while (num1 <= 9) {
			for (num2 = 1; num2 <= 9; num2++) {
				int ans = num1 * num2;
				System.out.print(num1 + " * " + num2 + " = " + ans + "\t");
			}
			System.out.println();
			num1++;
		}
	}
}
