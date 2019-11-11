package by.htp.luchko.decomposition;

import java.util.Arrays;
import java.util.Random;

public class Task13 {

	/*
	 * Дано натуральное число N. Написать метод(методы) для формирования массива,
	 * элементами которого являются цифры числа N.
	 * 
	 */

	public static void main(String[] args) {

		int n = randomValue(100000);
		printInt("Число N: ", n);

		int length = setArrayLength(n);
		printInt("Длина массива: ", length);

		int[] array = newArray(length);
		array = arrayElements(array, n);
		printArray("Массив", array);

	}

	public static int[] newArray(int i) {

		int[] array = new int[i];

		return array;
	}

	public static int[] arrayElements(int[] array, int n) {

		for (int i = 0; i < array.length; i++) {
			array[i] = n % 10;
			n = n / 10;
		}
		return array;
	}

	public static int setArrayLength(int n) {

		int length = 0;

		for (int i = 1; i <= n; i = i * 10) {
			length++;
		}

		return length;
	}

	public static int randomValue(int limit) {

		Random rand = new Random();
		return rand.nextInt(limit);
	}

	public static void printInt(String s, int a) {

		System.out.println(s + a);
	}

	public static void printArray(String s, int[] array) {
		System.out.println(Arrays.toString(array));
	}

}
