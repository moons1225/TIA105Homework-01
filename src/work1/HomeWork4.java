package work1;

//請定義一個常數為3.1415(圓周率)，並計算半徑為5的圓面積與圓周長
public class HomeWork4 {
	public static void main(String[] args) {
		final double PI = 3.1415;
		int radius = 5;
		// 圓面積=半徑平方*圓周率
		double area = (Math.pow(radius, 2)) * PI;
		System.out.println("圓面積 = " + area);
		System.out.printf("圓面積 = %.4f %n",area);

		// 圓周長=直徑*圓周率
		double circumference = (radius * 2) * PI;
		System.out.println("圓周長 = " + circumference);
		System.out.printf("圓周長 = %.4f %n", circumference);
	}
}
