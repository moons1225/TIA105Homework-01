package work5.homeworkext;

public class Pencil extends Pan {
	
	public Pencil(String brand, int price) {
		super(brand, (int)(price*0.8));

	}

	@Override
	public void setPrice(int price) {
		super.setPrice((int) (price * 0.8));
	}
	
	@Override
	public void write() {
		System.out.println("削鉛筆再寫");
	}
	
	public void draw() {
		System.out.println("素描");
	}

}
