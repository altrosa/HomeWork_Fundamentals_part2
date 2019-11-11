package by.htp.luchko.massive;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task07 {
	/*
	 * Дана последовательность действительных чисел а1 ,а2 ,..., ап. Заменить все ее
	 * члены, большие данного Z, этим числом. Подсчитать количество замен.
	 */

	public static void main(String[] args) {
		int n = enter("Введите размер последовательности N: ");
		int k = enter("Введите число K: ");
		int[] array = new int[n];
		int zam = 0;
		arrayInclude(n, array, k, zam);

	}

	public static void arrayInclude(int n, int[] array, int k, int zam) {
		for (int i = 0; i < array.length; i++) {
			array[i] = new Random().nextInt(100);

		}
		System.out.println(Arrays.toString(array));

		for (int i = 0; i < array.length; i++) {
			if (array[i] > k) {
				array[i] = k;

			}
			if (array[i] == k) {
				zam++;
			}

		}

		System.out.println(Arrays.toString(array));
		System.out.println("Количеcтво замен" + zam);
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
