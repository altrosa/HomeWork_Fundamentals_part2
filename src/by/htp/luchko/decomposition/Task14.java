package by.htp.luchko.decomposition;

import java.util.Random;

public class Task14 {

	// Написать метод(методы), определяющий, в каком из данных двух чисел больше
	// цифр.

	public static void main(String[] args) {

		int n = randomValue(12345678);
		printInt("Число N: ", n);

		int k = randomValue(123456);
		printInt("Число K: ", k);

		int a = length(n);
		int b = length(k);

		result(a, b);

	}

	public static int length(int l) {

		int length = 0;

		for (int i = 1; i <= l; i = i * 10) {
			length++;
		}

		return length;
	}

	public static void result(int a, int b) {
		if (a > b) {
			printInt("Цифр в числе N больше и оно равно: ", a);
		} else if (a < b) {
			printInt("Цифр в числе K больше и оно равно: ", b);
		} else {
			printInt("Цифр в числе N и K одинаково и равно: ", a);
		}

	}

	public static int randomValue(int limit) {

		Random rand = new Random();
		return rand.nextInt(limit);
	}

	public static void printInt(String s, int a) {

		System.out.println(s + a);
	}

}
