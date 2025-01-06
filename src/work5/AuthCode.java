package work5;

public class AuthCode {
	// 定義一個靜態字串，包含了大寫字母、小寫字母和數字，總共有 62 個字符
	private static String st = 
			"ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
	// 無參數的建構子
	public AuthCode() {
		
	}
	// genAuthCode 方法：根據傳入的字串 st，生成一個隨機的8位驗證碼
	public String genAuthCode(String st) {
		String authCode = "";  // 初始化一個空字串用來儲存驗證碼
		// 迴圈 8 次，每次隨機選擇一個字元並加入到 authCode 字串中
		for(int i = 0;i<8;i++) {
			authCode += st.charAt((int)(Math.random()*62));
		}
		return authCode;  //回傳生成的驗證碼
	}
	
	// getRandomCode 方法：根據傳入的字串 st，生成一個隨機的8位字元陣列
	public char[] getRandomCode(String st) {
		char[] authCode = new char[8];  // 創建一個長度為 8 的字元陣列
		 // 迴圈執行 8 次，每次隨機選擇一個字元並放入 authCode 陣列中
		for(int i = 0;i<authCode.length;i++) {
			char element = st.charAt((int)(Math.random()*62));
			authCode[i] = element;  // 把選中的字元放進陣列
		}
		return authCode;  // 回傳生成的字元陣列
	}
	
	public static void main(String[] args) {
		AuthCode a = new AuthCode();
		
		// 使用 genAuthCode 方法生成隨機的驗證碼
		String myAuthCode = a.genAuthCode(st);
		System.out.println(myAuthCode);
		
		System.out.println("==========");
		// 使用 getRandomCode 方法生成隨機的字元陣列
		char[] myRandomCode = a.getRandomCode(st);		
		/* 會根據傳入的 char[] 來創建一個新的 String 物件，
		 * 並將char[]中的字符複製到這個 String 中
		 */
		System.out.println(new String(myRandomCode));
		
	}
}
