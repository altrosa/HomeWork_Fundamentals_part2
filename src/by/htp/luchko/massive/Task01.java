package by.htp.luchko.massive;

import java.util.Random;
import java.util.Scanner;

public class Task01 {
	/*
	 * � ������ A [N] �������� ����������� �����. ����� ����� ��� ���������, �������
	 * ������ ������� �.
	 * 
	 */

	public static void main(String[] args) {
		int a = enter("Enter K: ");
		int s = 0;

		mas(a, s);
	}

	public static void mas(int a, int s) {
		int[] x = new int[10];
		for (int i = 0; i < x.length; i++) {
			x[i] = new Random().nextInt(99);

		}
		for (int i = 0; i < x.length; i++) {
			if (x[i] % a == 0) {
				s = s + x[i];
			}

		}

		System.out.println("Сумма элементов, кратных K = " + s);
	}

	public static int enter(String message) {
		int value;
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.print(message);
		while (!sc.hasNextInt()) {
			sc.next();
			System.out.print(message);
		}
		value = sc.nextInt();
		return value;

	}

}
