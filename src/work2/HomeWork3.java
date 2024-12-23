package work2;

//請設計一隻Java程式，計算1～10的連乘積(1*2*3*…*10) (用while迴圈)
public class HomeWork3 {
	public static void main(String[] args) {
		int num = 1, total = 1;
		while (num <= 10) {
			total*=num;
			num++;
		}
		System.out.println("連乘積 = "+total);
	}
}
