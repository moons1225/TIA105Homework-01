package work5;
/*
 * MyRectangle 類別用來表示一個矩形，並包含計算面積的方法。
 * 提供了兩個主要屬性：寬度（width）和深度（depth），並包含
 * 相應的 getter 和 setter 方法，以及一個計算面積的方法。
 */
public class MyRectangle {
	private static double width;  // 靜態變數，用來儲存矩形的寬度
	private static double depth;  // 靜態變數，用來儲存矩形的深度
	
	//無參數建構子，用來建立一個預設的 MyRectangle 物件。
	public MyRectangle() {
		
	}
	
	// 有參數建構子，如果寬度或深度小於或等於 0，會顯示錯誤訊息。
	public MyRectangle(double width,double depth) {
		if(width>0 && depth>0) {
			this.width = width;
			this.depth = depth;
		}else {
			System.out.println("資料錯誤");
		}
	}
	
	// 設定矩形的寬度
	void setWidth(double width) {
		this.width = width;
	}
	
	// 設定矩形的寬度
	void setDepth(double depth) {
		this.depth = depth;
	}
	
	//取得矩形的面積的方法
	double getArea(){
		return width * depth;
	}
}
