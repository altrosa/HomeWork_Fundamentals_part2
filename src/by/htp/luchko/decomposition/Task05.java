package by.htp.luchko.decomposition;

import java.util.Random;

public class Task05 {

	/*
	 * Написать метод(методы) для нахождения суммы большего и меньшего из трех
	 * чисел.
	 */

	public static void main(String[] args) {

		int a = randomValue(100);
		print("Число А: ", a);

		int b = randomValue(100);
		print("Число В : ", b);

		int c = randomValue(100);
		print("Число C : ", c);

		int big = biggerOfThree(a, b, c);
		print("Bigger: ", big);

		int small = smallerOfThree(a, b, c);
		print("Smaller: ", small);

		int sum = summOf(small, big);
		print("Summa: ", sum);

	}

	public static int smallerOfThree(int a, int b, int c) {
		int temp;

		if (a == b || a == c) {
			return a;
		}

		if ((a < b) & (a < c)) {
			temp = a;
		} else if ((b < a) & (b < c)) {
			temp = b;
		} else if ((c < b) & (c < a)) {
			temp = c;
		} else {
			temp = 0;
		}
		return temp;
	}

	public static int biggerOfThree(int a, int b, int c) {
		int temp;

		if ((a > b) & (a > c)) {
			temp = a;
		} else if ((b > a) & (b > c)) {
			temp = b;
		} else if ((c > b) & (c > a)) {
			temp = c;
		} else {
			temp = 0;
		}
		return temp;
	}

	public static int summOf(int big, int small) {
		return big + small;
	}

	public static int randomValue(int limit) {

		Random rand = new Random();
		return rand.nextInt(limit);
	}

	public static void print(String s, int a) {

		System.out.println(s + a);

	}
}
