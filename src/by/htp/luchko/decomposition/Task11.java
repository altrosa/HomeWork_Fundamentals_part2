package by.htp.luchko.decomposition;

import java.util.Arrays;
import java.util.Random;

public class Task11 {

	/*
	 * Задан массив D. Определить следующие суммы: D[l] + D[2] + D[3]; D[3] + D[4] +
	 * D[5]; D[4] +D[5] +D[6]. Пояснение. Составить метод(методы) для вычисления
	 * суммы трех последовательно расположенных элементов массива с номерами от k до
	 * m.
	 */

	public static void main(String[] args) {

		int[] array = new int[6];

		arrayElements(array);
		printArray("Массив", arrayElements(array));

		int sum1 = sumForElements(array, 0, 2);
		printInt("Сумма D[l] + D[2] + D[3]: ", sum1);

		int sum2 = sumForElements(array, 2, 4);
		printInt("Сумма D[3] + D[4] + D[5]: ", sum2);

		int sum3 = sumForElements(array, 3, 5);
		printInt("Сумма D[4] + D[5] + D[6]: ", sum3);

	}

	public static int sumForElements(int[] array, int a, int b) {

		int sum = 0;
		for (int i = a; i <= b; i++) {
			sum = sum + array[i];
		}
		return sum;
	}

	public static int[] arrayElements(int[] array) {
		for (int i = 0; i < array.length; i++) {
			array[i] = new Random().nextInt(10);
		}
		return array;
	}

	public static void printArray(String s, int[] array) {

		System.out.println(Arrays.toString(array));
	}

	public static void printInt(String s, int m) {

		System.out.println(s + m);

	}
}
