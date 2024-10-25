package homework6;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CalTest {

	public static void main(String[] args) {

		while (true) {
			try {
				Scanner xy = new Scanner(System.in);
				System.out.println("請輸入x的值:");
				int x = xy.nextInt();
				System.out.println("請輸入y的值:");
				int y = xy.nextInt();
				Calculator calulator = new Calculator();
				calulator.powerXY(x, y);
				break;

			} catch (CalException e) {
				System.out.println(e.getMessage());

			} catch (InputMismatchException e) {
				System.out.println("輸入格式不正確");

			}

		}

	}
}
