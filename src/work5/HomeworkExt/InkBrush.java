package work5.HomeworkExt;

public class InkBrush extends Pan {
	
	public InkBrush(String brand, int price) {
		super(brand, (int)(price * 0.9));
	}
	public void setPrice(int price) {
		super.setPrice((int)(price * 0.9));
	}
	public void write() {
		System.out.println("沾墨汁再寫");
	}
	
	public void draw() {
		System.out.println("水墨畫");
	}
	
}
