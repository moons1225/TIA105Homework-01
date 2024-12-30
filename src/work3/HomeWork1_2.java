package work3;

import java.util.Arrays;
import java.util.Scanner;

//請設計一隻程式，使用者輸入三個數字後，輸出結果會為直角三角形、正三角形、等腰三角形、其它三角形或不是三角形
public class HomeWork1_2 {
	public static void main(String[] args) {
		System.out.println("輸入三個數字");

		// 取得輸入的數字
		Scanner sc = new Scanner(System.in);

		// 宣告陣列用於存放三角形的三個邊長
		int[] triangleSides = new int[3];

		// 使用 for 迴圈將輸入的三個數字放進陣列
		for (int i = 0; i < triangleSides.length; i++)
			triangleSides[i] = sc.nextInt();

		// 將陣列內的元素進行排序，方便後續判斷
		Arrays.sort(triangleSides);

		// 建立 HomeWork1_2 物件
		HomeWork1_2 triangleType = new HomeWork1_2();
		// 使用物件呼叫 checkTriangleType 方法進行三角形類型判斷並取回傳值
		String result = triangleType.checkTriangleType(triangleSides);
		// 印出回傳值結果
		System.out.println(result);

		sc.close();
	}

	String checkTriangleType(int[] sides) {
		if (sides[0] <= 0 || sides[1] <= 0 || sides[2] <= 0 || (sides[0] + sides[1] <= sides[2])) {
			return "不是三角形";
		} else if (sides[0] == sides[1] && sides[1] == sides[2]) {
			return "正三角形";
		} else if (sides[0] == sides[1] && sides[0] != sides[2]) {
			return "等腰三角形";
		} else if (Math.pow(sides[0], 2) + Math.pow(sides[1], 2) == Math.pow(sides[2], 2)) {
			return "直角三角形";
		} else {
			return "其他三角形";
		}
	}
}
