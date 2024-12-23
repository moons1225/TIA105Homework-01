package work1;
//請由程式計算256559秒為多少天、多少小時、多少分與多少秒
public class HomeWork3 {
	public static void main(String[] args) {
		int totalSeconds = 256559;  //總秒數
		int secondsPerDay = 24 * 60 *60;  //計算一天有多少秒
		
		// 計算總秒數中的天數
		int days = totalSeconds / secondsPerDay; 
		
		// 計算剩餘秒數
		int remainSeconds = totalSeconds % secondsPerDay;
		
		// 計算剩餘秒數中的小時數
		int hours = remainSeconds / (60*60); 
		
		// 計算剩餘秒數中的分鐘數
		int minutes = (remainSeconds%(60*60)) / 60;
		
		// 計算剩餘的秒數
		int seconds = remainSeconds % 60;
		
		String answer =totalSeconds+" 秒為 "+days+" 天 "+hours+" 小時 "+minutes+" 分 "+seconds+" 秒 ";
		System.out.println(answer);
	}
}
