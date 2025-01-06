package work5;

public class MaxNumber {
	// 定義方法 maxElement，接收一個二維整數陣列，返回最大元素
	int maxElement(int x[][]) {
		int num = 0;  // 初始化最大值變數，預設為 0
		// 遍歷二維陣列的每一個元素
		for (int i = 0; i < x.length; i++) {   //外層迴圈，遍歷大陣列
			for (int j = 0; j < x[i].length; j++) {  //內層迴圈，遍歷小陣列
				if (num < x[i][j])  // 如果當前元素大於 num
					num = x[i][j];  // 更新最大值
			}
		}
		return num;  // 返回找到的最大值
	}

	 // 定義方法 maxElement，接收一個二維浮點數陣列，返回最大元素
	double maxElement(double x[][]) {
		double num = 0;
		for (int i = 0; i < x.length; i++) {
			for (int j = 0; j < x[i].length; j++) {
				if (num < x[i][j])
					num = x[i][j];
			}
		}
		return num;
	}

	public static void main(String[] args) {
		int[][] intArray = { 
					{ 1, 6, 3 }, 
					{ 9, 5, 2 } 
				  };
		double[][] doubleArray = {
						{1.2,3.5,2.2},
						{7.4,2.1,8.2}
					};

		MaxNumber m = new MaxNumber();
		System.out.println(m.maxElement(intArray));
		System.out.println(m.maxElement(doubleArray));
	}
}
