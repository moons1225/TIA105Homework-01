package work4;

public class ExamScores2 {
//方法 找出得分最高的學生編號 存在陣列裡並回傳
	int[] findTopStudentId(int[][] arr) {
		int[] topId = new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			int index = 0;
			for (int j = 0; j < arr[i].length; j++) {
				if (arr[i][j] > topId[i]) {
					topId[i] = arr[i][j];
					index = j;
				}
			}
			topId[i] = index + 1;
		}
		return topId;
	}

//方法 計算每個學生得最高分的次數 存到陣列裡並回傳
	int[] getCountNumber(int[] arr) {
		int[] topScoreCounts = new int[8];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] >= 1 && arr[i] <= 8) {
				topScoreCounts[arr[i] - 1] += 1;
			}
		}
		return topScoreCounts;
	}

	public static void main(String[] args) {
		int[][] examScores = { { 10, 35, 40, 100, 90, 85, 75, 70 }, // 第一次考試
				{ 37, 75, 77, 89, 64, 75, 70, 95 }, // 第二次考試
				{ 100, 70, 79, 90, 75, 70, 79, 90 }, // 第三次
				{ 77, 95, 70, 89, 60, 75, 85, 89 }, // 第四次
				{ 98, 70, 89, 90, 75, 90, 89, 90 }, // 第五次
				{ 90, 80, 100, 75, 50, 20, 99, 75 } // 第六次
		};
		ExamScores2 e = new ExamScores2();
		int[] topIds = e.findTopStudentId(examScores);
		int[] count = e.getCountNumber(topIds);
		
		for(int i= 0;i<count.length;i++) {
			System.out.println((i+1)+"號學生得了 "+ count[i]+"次最高分");			
		}
	}

}
