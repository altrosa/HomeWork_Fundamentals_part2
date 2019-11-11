package by.htp.luchko.decomposition;

import java.util.Arrays;
import java.util.Random;

public class Task16 {

	/*
	 * Два простых числа называются «близнецами», если они отличаются друг от друга
	 * на 2 (например, 41 и 43). Найти и напечатать все пары «близнецов» из отрезка
	 * [n,2n], где n - заданное натуральное число больше 2. Для решения задачи
	 * использовать декомпозицию.
	 */

	public static void main(String[] args) {

		int n = randomValue(3);
		printInt("Число N: ", n);

		int[][] array = createArray(n);
		printArray("new array: ", array);

	}

	public static int[][] createArray(int n) {
		int m = n * 2;
		int[][] array = new int[n - 1][2];
		int j = 0;
		for (int i = n; i <= m - 2; i++) {
			array[j][0] = i;
			array[j][1] = i + 2;
			j++;
		}
		return array;
	}

	public static int randomValue(int limit) {

		Random rand = new Random();
		return rand.nextInt(limit);
	}

	public static void printInt(String s, int a) {

		System.out.println(s + a);
	}

	public static void printArray(String s, int[][] array) {
		System.out.print(Arrays.deepToString(array));
	}
}