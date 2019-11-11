package by.htp.luchko.massive;

import java.util.Arrays;
import java.util.Scanner;

public class Task10 {
	/*
	 * Даны целые числа а1 ,а2 ,..., аn . Вывести на печать только те числа, для
	 * которых аi > i
	 */

	public static void main(String[] args) {
		int n = enter("Enter N: ");
		int[] array = new int[n];
		lengthArray(array);
		result(array);

	}

	public static void lengthArray(int[] array) {
		for (int i = 0; i < array.length; i++) {
			array[i] = (int) (Math.random() * (200 + 1)) - 100;
		}

		System.out.println(Arrays.toString(array));
	}

	public static void result(int[] array) {
		for (int i = 0; i < array.length; i++) {
			if (array[i] > i) {
				System.out.print(array[i]+ " ");
			}		
		}
		
		
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
