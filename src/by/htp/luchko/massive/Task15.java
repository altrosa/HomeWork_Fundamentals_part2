package by.htp.luchko.massive;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task15 {

	/*
	 * Дана последовательность действительных чисел a a an , , , 1 2  . Указать те
	 * ее элементы, которые принадлежат отрезку [с, d]
	 */

	public static void main(String[] args) {

		int c = enterFromConsole("Введите первый член последовательности: ");
		int d = enterFromConsole("Введите второй член последовательности: ");

		int[] array = createArray(randomValue(100));
		array = arrayElements(array);
		printArray(array);
		check(array, c, d);

	}

	public static int[] createArray(int i) {
		int[] array = new int[i];

		return array;
	}

	public static int[] arrayElements(int[] array) {

		for (int i = 0; i < array.length; i++) {
			array[i] = randomValue(100);
		}
		return array;

	}

	public static void check(int[] array, int c, int d) {
		for (int i = 0; i < array.length; i++) {
			if (array[i] >= c && array[i] <= d) {
				System.out.print(" " + array[i]);
			}

		}

	}

	public static int enterFromConsole(String message) {

		int value;
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.print(message);
		while (!sc.hasNextInt()) {
			System.out.print(message);
			sc.nextInt();
		}
		value = sc.nextInt();
		return value;

	}

	public static int randomValue(int limit) {

		Random rand = new Random();
		return rand.nextInt(limit);
	}

	public static void printArray(int[] array) {
		System.out.println(Arrays.toString(array));
	}
}
