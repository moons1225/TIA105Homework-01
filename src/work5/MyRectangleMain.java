package work5;

public class MyRectangleMain {
	public static void main(String[] args) {
		// 創建一個 MyRectangle 物件 r1，使用無參數建構子
		MyRectangle r1 = new MyRectangle();
		r1.setWidth(10);
		r1.setDepth(20);
		System.out.println(r1.getArea());
		
		System.out.println("==============");
		
		//創建另一個 MyRectangle 物件 r2，使用帶參數的建構子，初始化寬度為 10，深度為 20
		MyRectangle r2 = new MyRectangle(10, 20);
		System.out.println(r2.getArea());
	}
}
