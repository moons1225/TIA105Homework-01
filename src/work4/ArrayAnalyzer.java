package work4;

public class ArrayAnalyzer {
	public static void main(String[] args) {
		int[] array = { 29, 100, 39, 41, 50, 8, 66, 77, 95, 15 };
		int sum = 0;
		for (int c = 0; c < array.length; c++) {
			sum += array[c];
		}
		int avg = sum / array.length;
		System.out.println("平均數為：" + avg);
		System.out.print("高於平均數有：");
		for (int c = 0; c < array.length; c++) {
			if (array[c] > avg)
				System.out.print(array[c] + " ");
		}
	}

}
