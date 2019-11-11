package by.htp.luchko.massive;

import java.util.Arrays;
import java.util.Scanner;

public class Task09 {
	/*
	 * Даны действительные числа а1 ,а2 ,..., аn . Поменять местами наибольший и
	 * наименьший элементы.
	 * 
	 */

	public static void main(String[] args) {
		int n = enter("Enter N: ");
		int[] array = new int[n];
		lengthArray(array);
		int temp = array[0];
		result(array, temp);
	}

	public static void lengthArray(int[] array) {
		for (int i = 0; i < array.length; i++) {
			array[i] = (int) (Math.random() * (200 + 1)) - 100;
		}
		Arrays.sort(array);
		System.out.println(Arrays.toString(array));
	}

	public static void result(int[] array, int temp) {
		for (int i = 0; i < array.length; i++) {
			array[0] = array[array.length - 1];
		}
		array[array.length - 1] = temp;

		System.out.println(Arrays.toString(array));

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
