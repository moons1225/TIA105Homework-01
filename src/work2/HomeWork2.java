package work2;
//請設計一隻Java程式，計算1～10的連乘積(1*2*3*…*10) (用for迴圈)
public class HomeWork2 {
	public static void main(String[] args) {
		int total=1;
		for(int num=1;num<=10;num++) {
			total=total * num;
		}
		System.out.println("連乘積 = "+total);
	} 
}
