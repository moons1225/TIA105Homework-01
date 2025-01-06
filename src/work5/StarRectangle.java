package work5;

public class StarRectangle {
	 // 私有成員變數，用於儲存矩形的寬和高
	private int width;
	private int height;
	// 無參數建構子，不進行任何初始化操作。
	StarRectangle() {

	}
	//繪製星號矩形的方法
	void starSquare(int width, int height) {
		// 外層迴圈控制矩形的行數（高度）
		for (int i = 1; i <= height; i++) {
			// 內層迴圈控制每行的星號數量（寬度）
			for (int j = 1; j <= width; j++) {
				System.out.print("*");  // 輸出一個星號，不換行
			}
			System.out.println();  // 每行輸出結束後換行
		}
	}

	public static void main(String[] args) {
		
		StarRectangle rectangle1 = new StarRectangle();
		rectangle1.starSquare(5, 4);
		
		StarRectangle rectangle2 = new StarRectangle();
		rectangle2.starSquare(10, 4);
	}
}
