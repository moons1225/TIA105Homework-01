package work1;

//某人在銀行存入150萬，銀行利率為2%，如果每年利息都繼續存入銀行，
//請用程式計算10年後，本金加利息共有多少錢 
//用複利計算：期初本金 * (1 + 利率) 期數次方 = 期末本利和
public class HomeWork5 {
	public static void main(String[] args) {
		// 宣告本金為150萬
		int principal = 1_500_000;

		// 宣告年利率為2%
		double rate = 2.0 / 100; //除數與被除數至少要有一方是浮點數型別
								//若都是整數型別進行除法，結果會捨棄小數部分，直接返回整數結果
		
		// 使用複利公式計算總金額
		double totalAmount = principal * Math.pow((1 + rate), 10);

		// 印出結果，使用 %.2f 格式化總金額保留兩位小數
		System.out.printf("總金額 = %.2f 元", totalAmount);
	}
}
