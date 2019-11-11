package by.htp.luchko.massive;

import java.util.Arrays;
import java.util.Random;

public class Task14 {

	/*
	 * Дан одномерный массив A[N]. Найти: max + min.
	 */

	public static void main(String[] args) {

		int n = randomValue(25);

		int[] array = createArray(n);
		int[] arrayRand = arrayRandom(array, n);
		printArray(arrayRand);
		
		int max = findMax(array);
		int min = findMin(array);
		
		int sum = findSumMaxMin(max, min);
		printInt("Сумма max () + min() : ", sum);


	}

	public static int[] createArray(int i) {
		int[] array = new int[i];

		return array;
	}

	public static int[] arrayRandom(int[] array, int n) {

		for (int i = 0; i < array.length; i++) {
			array[i] = randomValue(100);
		}
		return array;

	}

	public static int findMax(int[] array) {

		int max = array[0];

		for (int i = 1; i < array.length; i = i + 1) {
			if (array[i] > max) {
				max = array[i];
			}
		}
		return max;
	}

	public static int findMin(int[] array) {

		int min = array[0];

		for (int i = 1; i < array.length; i = i + 1) {
			if (array[i] < min) {
				min = array[i];
			}
		}
		return min;
	}
	
	public static int findSumMaxMin(int max, int min) {
		 int sum = max + min;
		 
		 return sum;
	}

	public static int randomValue(int limit) {

		Random rand = new Random();
		return rand.nextInt(limit);
	}

	public static void printInt(String s, int a) {

		System.out.println(s + a);
	}

	public static void printArray(int[] array) {
		System.out.println(Arrays.toString(array));
	}

}
