package work4;
/*
 * 使用物件導向方式進行字串反轉
 * 包含一個建構子來初始化字串，以及一個方法reverse()用來執行字串反轉
 */
public class StringReverser2 {
	// 定義實體變數，存放字串
	String str;
	
	//建構子，用於初始化 StringReverser2 類別的成員變數。
	public StringReverser2(String str) {
		this.str = str;
	}
	
	//反轉字串的方法
	public void reverse() {
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
	
	public static void main(String[] args) {
		// 創建 StringReverser2 類別的物件實體，並初始化要反轉的字串
		StringReverser2 str =new StringReverser2("Hello World");
		// 調用 reverse 方法進行字串反轉並輸出
		str.reverse();
		
	}
}
