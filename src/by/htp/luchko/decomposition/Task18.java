package by.htp.luchko.decomposition;

public class Task18 {

	/*
	 * Найти все натуральные n-значные числа, цифры в которых образуют строго
	 * возрастающую последовательность (например, 1234, 5789). Для решения задачи
	 * использовать декомпозицию.
	 */

	public static void main(String[] args) {

		int n = 5;
		String str = result(n);
		printString(str);
	}

	public static String result(int n) {
		String str = n + "- значное число: ";
		int mod = 0;
		int i = 1;
		while (mod != 9) {
			int number = 0;
			int d = i;
			for (int j = (n - 1); j >= 0; j--) {
				number = number + d * (int) (Math.pow(10, j));
				d++;
			}
			str = str + number + " ";
			mod = number % 10;
			i++;
		}

		return str;
	}

	public static void printString(String s) {

		System.out.println(s);
	}
}