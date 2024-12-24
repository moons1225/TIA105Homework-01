package work4;
/*
 * 這是一個字串反轉的範例程式。
 * 它使用兩個 for 迴圈將字串中的每個字元存入字元陣列，
 * 並以反序的方式輸出結果。
 */
public class StringReverser {
	public static void main(String[] arge) {
		// 定義一個字串
		String str = "Hello World";
		
		 // 取得字串的長度
		int len = str.length();
		
		// 建立一個字元陣列，用來存放字串的每個字元
		char[] charArray = new char[len];
		
		 // 將字串的每個字元逐一存入字元陣列
		for (int i = 0; i < charArray.length; i++) 
			charArray[i] = str.charAt(i);
		
		// 從字元陣列的最後一個字元開始，逐一輸出（反轉字串）
		for (int i = charArray.length - 1; i >= 0; i--) 
			System.out.print(charArray[i]);
	}
}
