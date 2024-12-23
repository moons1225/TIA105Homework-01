package work2;
//請設計一隻Java程式，計算1～1000的偶數和(2+4+6+8+…+1000)
public class HomeWork1 {
	public static void main(String[] args) {
		// 使用for迴圈
		int total = 0;
		for (int num = 1; num <= 1000; num++) {
			if (num % 2 != 1) {
				total += num;
			}
		}
		System.out.println("總和 = " + total);
		
		// 使用while迴圈
//		int num = 1, total = 0;
//		while (num <= 1000) {
//			if (num % 2 == 0)
//				total += num;
//			num++;
//		}
//		System.out.println("總和 = " + total);
	}
}
