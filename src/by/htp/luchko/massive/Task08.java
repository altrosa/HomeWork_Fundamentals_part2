package by.htp.luchko.massive;

import java.util.Arrays;
import java.util.Scanner;

public class Task08 {

	/*
	 * Дан массив действительных чисел, размерность которого N. Подсчитать, сколько
	 * в нем отрицательных, положительных и нулевых элементов.
	 */

	public static void main(String[] args) {
		int min = 0;
		int plus = 0;
		int nul = 0;

		int n = enter("Enter N: ");
		int[] array = new int[n];
		lenghtArray(array);
		minusArray(array, min);
		plusArray(array, plus);
		nulArray(array, nul);

	}

	public static void lenghtArray(int[] array) {
		for (int i = 0; i < array.length; i++) {
			array[i] = (int) (Math.random() * (200 + 1)) - 100;
		}
		System.out.println(Arrays.toString(array));
	}

	public static void minusArray(int[] array, int min) {
		for (int i = 0; i < array.length; i++) {
			if (array[i] < 0) {
				min++;
			}
		}
		System.out.println("Количество отрицательных: " + min);
	}

	public static void nulArray(int[] array, int nul) {
		for (int i = 0; i < array.length; i++) {
			if (array[i] == 0) {
				nul++;
			}
		}
		System.out.println("Количество нулевых: " + nul);
	}

	public static void plusArray(int[] array, int plus) {
		for (int i = 0; i < array.length; i++) {
			if (array[i] > 0) {
				plus++;
			}
		}
		System.out.println("Количество отрицательных: " + plus);
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
