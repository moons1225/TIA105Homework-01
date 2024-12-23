package work1;

/*請寫一隻程式，利用System.out.println()印出以下三個運算式結果：
5 + 5
5 + ‘5’
5 + “5”
並請用註解各別說明答案的產生原因*/
public class HomeWork6 {
	public static void main(String[] args) {

		/*
		 * 運算元皆是整數 int 型別，運算子為加法， 
		 * 故運算後的回傳值為10(整數int型別)
		 */
		System.out.println(5 + 5); // 印出10

		/*
		 * 5是整數 int 型別，'5' 是字元 char 型別
		 * 整數型別與字元型別進行算數運算(這裡是加法)時
		 * Java 會將字元轉換為對應的 ASCII 整數值或 Unicode 整數值來進行運算
		 * 字元 '5' 轉換後的整數值為53，故整數 5 + 整數 53 的回傳值為 58
		 */
		System.out.println(5 + '5'); // 印出58

		/*
		 * 5是整數 int 型別，"5" 是字串 String 型別
		 * 當字串型別 跟 整數型別 相加時，會進行文字串接，回傳結果為字串型別
		 * 故等同於 "5" + "5"，兩個字串連接起來為 55
		 */
		System.out.println( 5 + "5"); // 印出55

	}
}
