package work4;

import java.util.Scanner;

public class DayOfYear {
	//宣告變數 儲存年份、月份和日期
	private int year;
	private int month;
	private int day;
	
	 // 宣告陣列來存放每個月的天數（平年，二月為28天）
	int[] daysInMonth = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

	 // 建構子：初始化年、月、日
	public DayOfYear(int year, int month, int day) {
		this.year = year;
		this.month = month;
		this.day = day;
	}

	// 方法 確認輸入的日期是否正確 (檢查月份<=12 二月日期平年<=28 閏年<=29)
	public boolean validateDate() {
		 // 判斷是否為閏年
		boolean isLeapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
		// 若為閏年，將二月天數調整為29天
		if (isLeapYear) {
			daysInMonth[1] = 29;
		}
		// 檢查月份是否有效
		boolean checkMonth = true;
		if (month < 1 || month > 12) {
			System.out.println("請輸入正確月份");
			checkMonth = false;
		}
		// 檢查日期是否有效
		boolean checkDay = true;
		if (day < 1 || day > daysInMonth[month - 1]) {
			System.out.println("請輸入正確日期");
			checkDay = false;
		}
		// 返回檢查結果
		return checkMonth && checkDay;
	}

	// 方法 計算該日期是該年的第幾天
	public void calculateDayOfYear() {
		int count = 0;  // 累計天數
		// 將當前月份之前的所有天數累加
		for (int i = 0; i < month - 1; i++) {
			count += daysInMonth[i];
		}
		// 加上當前月的日期
		count += day;
		System.out.println("輸入的日期為該年第" + count + "天");
	}

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		// 不斷要求使用者輸入，直到輸入正確的日期
		while (true) {
			System.out.println("請輸入年份 (yyyy)：");
			int year = scanner.nextInt();

			System.out.println("請輸入月份 (mm)：");
			int month = scanner.nextInt();

			System.out.println("請輸入日期 (dd)：");
			int day = scanner.nextInt();
			
			// 創建 DayOfYear 物件 並給初始值
			DayOfYear dayOfYear = new DayOfYear(year, month, day);

			 // 驗證日期是否正確
			if (dayOfYear.validateDate()) {
				dayOfYear.calculateDayOfYear();  // 如果正確，計算並顯示第幾天
				break;
			} else {
				System.out.println("請重新輸入");
				// 如果不正確，要求重新輸入
			}
		}
		scanner.close();
	}
}