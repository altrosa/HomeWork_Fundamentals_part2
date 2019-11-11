package by.htp.luchko.decomposition;

import java.util.Arrays;
import java.util.Random;

public class Task15 {

	/*
	 * Даны натуральные числа К и N. Написать метод(методы) формирования массива А,
	 * элементами которого являются числа, сумма цифр которых равна К и которые не
	 * большее N.
	 */

	public static void main(String[] args) {

		int k = randomValue(1000);
		printInt(" ", k);
		int n = randomValue(10000);

		printInt("Сумма ", sumOfValue(k));

		int lengthArray = lengthArray(k);

		int[] sumOfNumbers = sumOfNumbers(k, n, lengthArray);
		printArray(" ", sumOfNumbers);

	}

	public static int[] sumOfNumbers(int k, int n, int lengthArray) {
		int sum;
		int count = 0;
		int[] array = new int[lengthArray];

		for (int i = 0; i <= k; i++) {
			sum = sumOfValue(i);
			if (sum == n) {
				array[count] = i;
				count++;
			}
		}

		return array;
	}

	public static int lengthArray(int k) {

		int sum = 0;

		for (int i = 0; i < k; i++) {
			sum = sumOfValue(i);
			sum++;
		}
		return sum;
	}

	public static int sumOfValue(int k) {

		int sum = 0;

		for (int i = 1; i <= k; i = i * 10) {
			sum = sum + k / i % 10;
		}
		return sum;

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
