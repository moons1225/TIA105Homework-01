package work4;

public class ExamScores {
	public static void main(String[] args) {
		//每個小陣列裡存放的是該次考試分數
		int[][] examScores = { 
				{ 10, 35, 40, 100, 90, 85, 75, 70 },	//第一次考試
				{ 37, 75, 77, 89, 64, 75, 70, 95 },		//第二次考試
				{ 100, 70, 79, 90, 75, 70, 79, 90 }, 	//第三次
				{ 77, 95, 70, 89, 60, 75, 85, 89 },		//第四次
				{ 98, 70, 89, 90, 75, 90, 89, 90 }, 	//第五次
				{ 90, 80, 100, 75, 50, 20, 99, 75 } 	//第六次
				};
		
		//宣告一個陣列來存放每次考試最高分的學生編號
		int[] topStudentIds = new int[5];
		
		for (int i = 0; i < topStudentIds.length; i++) {
			topStudentIds[i] = findMaxIndex(examScores[i]);
//			System.out.print(topStudentIds[i]+" ");
		}
		
		//宣告存放學生編號的陣列
		int[] studentIds = { 1, 2, 3, 4, 5, 6, 7, 8 };
		
		// 宣告 存取每個學生ID出現次數的陣列
		int[] appearanceCount = new int[studentIds.length];

		 // 計算每個學生ID在topStudentIds中的出現次數
		for (int j = 0; j < studentIds.length; j++) {
			int count = 0; // 計數器初始化為0

			for (int i = 0; i < topStudentIds.length; i++) {
				if (studentIds[j] == topStudentIds[i]) {
					++count;
					appearanceCount[j] = count;
				}
			}
			System.out.println(studentIds[j] + "號學生得了 " + appearanceCount[j] + " 次最高分");
		}
	}

	// 方法：找出最高分數的學生號碼
	static int findMaxIndex(int[] ar) {
		int maxIndex = 0;
		for (int i = 0; i < ar.length; i++) {
			if (ar[maxIndex] < ar[i]) {
				maxIndex = i;
			}
		}
		return maxIndex + 1;
	}
}
