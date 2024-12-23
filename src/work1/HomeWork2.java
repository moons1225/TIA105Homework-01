package work1;
//設計一隻Java程式，計算200顆蛋共是幾打幾顆？
public class HomeWork2 {
	public static void main(String[] args) {
		int totalEggsNumber = 200; //總共有幾顆蛋
		int dozens = totalEggsNumber / 12;  //算出有幾打
		int eggsNumber = totalEggsNumber % 12;  //計算出剩餘的蛋的數量
		System.out.println("一共是 "+ dozens +"打，剩下 "+ eggsNumber +"顆蛋");
	}
}
