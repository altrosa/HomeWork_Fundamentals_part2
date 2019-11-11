package by.htp.luchko.decomposition;

import java.util.Arrays;
import java.util.Random;

public class Task08 {

	/*
	 * Составить программу, которая в массиве A[N] находит второе по величине число
	 * (вывести на печать число, которое меньше максимального элемента массива, но
	 * больше всех других элементов).
	 * 
	 */

	public static void main(String[] args) {

		int n = randomValue(20);

		int[] array = createArray(n);
		printArray("Массив", array);

		int[] newArray = arrayElements(n, array);
		printArray("Массив", newArray);
		
		int  second =  findSecondByMax(newArray);

		printInt("  ", second);

	}

	public static int[] createArray(int n) {

		int[] array = new int[n];
		return array;
	}

	public static int[] arrayElements(int n, int[] array) {
		for (int i = 0; i < array.length; i++) {
			array[i] = new Random().nextInt(10);
		}

		return array;
	}

	public static int findSecondByMax(int[] newArray) {

		int max = 0;
		int second = 0;
		int temp = 0;

		for (int i = 0; i < newArray.length; i++) {
			if (newArray[i] > max) {
				max = newArray[i];
			}
		}

		for (int i = 0; i < newArray.length; i++) {
			if (newArray[i] < max && newArray[i] > temp) {
				temp = newArray[i];
				second = newArray[i];
			}
		}

		return second;
	}

	public static void printArray(String s, int[] array) {

		System.out.println(Arrays.toString(array));

	}

	public static void printInt(String s, int a) {

		System.out.println(s + a);
	}

	public static int randomValue(int limit) {

		Random rand = new Random();
		return rand.nextInt(limit);
	}
}
