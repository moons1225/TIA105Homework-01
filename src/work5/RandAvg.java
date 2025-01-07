package work5;

public class RandAvg {
	// 定義 randAvg 方法，用於生成亂數並計算平均值
	void randAvg() {
		int[] num = new int[10];  // 建立大小為 10 的整數陣列，用來存放亂數
		int count = 0;   // 用來累加亂數的總和
		System.out.println("本次亂數結果：");
		
		// 使用 for 迴圈產生 10 個亂數
		for (int i = 0; i < num.length; i++) {
			 // 根據是否為最後一個數字決定是否添加空格或換行
			String isSpace = i < num.length - 1 ? " " : "\n";
			// 產生 0 到 100 的亂數並存入陣列
			num[i] = (int) (Math.random() * 101);
			// 累加亂數至總和變數 count
			count += num[i];
			// 輸出當前的亂數值，並根據條件添加空格或換行
			System.out.print(num[i] + isSpace);
		}
		System.out.println("平均值：" + count / 10);
	}

	public static void main(String[] args) {
		RandAvg avg = new RandAvg();  // 建立 RandAvg 類別的物件
		avg.randAvg();  // 呼叫 randAvg 方法執行亂數生成與平均值計算
	}
}
