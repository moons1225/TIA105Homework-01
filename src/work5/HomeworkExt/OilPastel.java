package work5.HomeworkExt;

public class OilPastel extends Pan {
	private String color; 
	
	public OilPastel(String brand, int price, String color) {
		super(brand, price);
		this.color = color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	public String getColor() {
		return this.color;
	}
	
	public void write() {
		System.out.println("直接寫");
	}
	
	public void draw() {
		System.out.println("粉彩畫");
	}
}
