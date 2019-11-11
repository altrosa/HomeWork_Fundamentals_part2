package by.htp.luchko.massive;

import java.util.Arrays;
import java.util.Random;

public class Task17 {

	/*
	 * Дана последовательность целых чисел a a an , , , 1 2  . Образовать новую
	 * последовательность, выбросив из исходной те члены, которые равны min( , , , )
	 * a1 a2  an .
	 */

	public static void main(String[] args) {
		
		int[] array = createArray(randomValue(100));
		array = arrayElements(array);
		printArray(array);
		
		int [] second = removeMinimums(array);
		
		printArray(second);
	}

	public static int[] createArray(int i) {
		int[] array = new int[i];

		return array;
	}

	public static int[] arrayElements(int[] array) {

		for (int i = 0; i < array.length; i++) {
			array[i] = randomValue(10);
		}
		return array;

	}
	
	public static int [] removeMinimums(int[] array) {
	    int count = 0;
	    int  min = Integer.MAX_VALUE;

	    for (int d : array) {
	        if (d < min) {
	            count = 1;
	            min = d;
	        }
	        else if (d == min) {
	            count++;
	        }
	    }

	   int i = 0;
	   int [] res = new int[array.length - count];
	    for (int d : array) {
	        if (d > min) {
	            res[i++] = d;
	        }
	    }

	    return res;
	}

	public static int findMin(int[] array) {

		int min = array[0];

		for (int i = 1; i < array.length; i = i + 1) {
			if (array[i] < min) {
				min = array[i];
				min++;
			}
		}
		return min;
	}

	public static void printArray(int[] array) {
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
