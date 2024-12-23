package work2;

//阿文很熱衷大樂透(1 ～49)，但他不喜歡有4的數字，不論是個位數或是十位數。
//請設計一隻程式，輸出結果為阿文可以選擇的數字有哪些？總共有幾個？
public class HomeWork5 {
	public static void main(String[] args) {
		int sum = 0;
		for (int num = 1; num <= 49; num++) {
			String line = (num % 10 == 0) ? "\n" : " ";
			if (!((num / 10) == 4 || num % 10 == 4)) {
				System.out.print(num + line);
				sum += 1;	
			}
		}
		System.out.print("\n"+"總共有 " + sum + " 個數字");
		
//		int sum=0;
//		for (int num = 1; num < 49; num++) {
//			if (!String.valueOf(num).contains("4")) {
//				if(num<10) {
//					System.out.print("0"+num+" ");
//				}else {
//					System.out.print(num+" ");
//				}
//				sum+=1;
//			}
//		}
//		System.out.print("\n"+"總共有 " + sum + " 個數字");
	}
}
