package work4;

public class Planets {
	public static void main(String[] args) {
		// 定義包含八大行星名稱的字串陣列
		String[] planets = { "mercury", "venus", "earth", "mars", "jupiter", "saturn", "uranus", "neptune" };
		int count = 0; // 用於計算母音字母數量的變數

		// 外層迴圈：逐一遍歷每個元素
		for (int j = 0; j < planets.length; j++) {

			// 內層迴圈：逐一檢查每個行星名稱中的每個字母
			for (int i = 0; i < planets[j].length(); i++) {
				switch(planets[j].charAt(i)) {
				case 'a':
				case 'e':
				case 'i':	
				case 'o':
				case 'u':
					count += 1;
				}
				
//				if (planets[j].charAt(i) == 'a') {
//					count += 1;
//				} else if (planets[j].charAt(i) == 'e') {
//					count += 1;
//				} else if (planets[j].charAt(i) == 'i') {
//					count += 1;
//				} else if (planets[j].charAt(i) == 'o') {
//					count += 1;
//				} else if (planets[j].charAt(i) == 'u') {
//					count += 1;
//				}
			}
		}
		System.out.println("總共：" + count + " 個 a e i o u 母音");

//		int count = 0;
//		String vowels = "aeiou"; // 定義母音字母的字串
//		// 外層迴圈：逐一遍歷每個元素
//		for (int j = 0; j < planets.length; j++) {
//
//			// 內層迴圈：檢查字符是否在母音字串中，使用方法 ：indexOf(查找的字元或 Unicode 代碼)
//			// indexOf(int ch) 用來查找一個字元或 Unicode 代碼 在字串中第一次出現的索引。
//			// 若字元或 Unicode 代碼沒有出現在字串中則回傳 -1
//			for (int i = 0; i < planets[j].length(); i++) {
//
//				if (vowels.indexOf(planets[j].charAt(i)) != -1) {
//					count++;
//				}
//			}
//		}
//		System.out.println("總共有 : " + count + "個");
	}
}