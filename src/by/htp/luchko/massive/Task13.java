package by.htp.luchko.massive;

import java.util.Arrays;
import java.util.Random;

public class Task13 {

	/*
	 * Определить количество элементов последовательности натуральных чисел, кратных
	 * числу М и заключенных в промежутке от L до N
	 */

	public static void main(String[] args) {

		int l = 1;
		int n = randomValue(100);

		int m = randomValue(10);
		printInt("Число m: ", m);

		int[] array = createArray(randomValue(15));

		int[] array2 = arrayRandom(array, l, n);
		printArray(array2);

		printInt("Элементы, кратные m: ", numbers(array, m));

	}

	public static int numbers(int[] array, int m) {

		int count = 0;

		for (int i = 0; i < array.length; i++) {
			if (array[i] % m == 0) {
				count++;
			}
		}
		return count;
	}

	public static int[] createArray(int i) {
		int[] array = new int[i];

		return array;
	}

	public static int[] arrayRandom(int[] array, int l, int n) {

		for (int i = 0; i < array.length; i++) {
			array[i] = randomValue(100);
		}
		return array;

	}

	public static int randomValue(int limit) {

		Random rand = new Random();
		return rand.nextInt(limit);

	}

	public static void printArray(int[] array) {
		System.out.println(Arrays.toString(array));
	}

	public static void printInt(String s, int a) {

		System.out.println(s + a);
	}
}
