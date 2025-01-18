package work5.HomeworkExt;

public abstract class Pan {
	private String brand;
	private int price;
	
	public Pan() {
		
	}
	
	public Pan(String brand, int price) {
		if(price<0) {
			System.out.println("金額輸入錯誤");
			 return; 
		}else {
			this.brand = brand;
			this.price = price;
		}
	}
	
	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	
	public String getBrand() {
		return this.brand;
	}
	
	public int getPrice() {
		return this.price;
	}
	
	public abstract void write();
	
	public abstract void draw();
}
