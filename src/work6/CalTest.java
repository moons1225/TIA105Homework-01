package work6;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CalTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Calculator calculator = new Calculator();
		boolean isSuccess = false;
		while (!isSuccess) {
			try {
				System.out.println("請輸入x的值");
				int x = sc.nextInt();
				
				System.out.println("請輸入y的值");
				int y = sc.nextInt();

				int result = calculator.powerXY(x, y);
				System.out.println(x + "的" + y + "次方等於" + result);
				isSuccess = true;
			} catch (CalException e) {
				System.out.println(e.getMessage());
				 sc.nextLine();
			}catch(InputMismatchException e) {
				System.out.println("輸入格式不正確");
				 sc.nextLine();
			}
		}
		sc.close();
	}
}
