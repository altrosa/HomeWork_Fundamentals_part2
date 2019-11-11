package by.htp.luchko.massive;

public class Task04 {
	/*
	 * Дана последовательность действительных чисел а1 а2 ,..., аn . Выяснить, будет
	 * ли она возрастающей.
	 * 
	 */

	public static void main(String[] args) {
		mas();

	}

	public static void mas() {
		int[] x = new int[10];
		for (int i = 1; i < x.length; i++) {
			x[i] = i;
			System.out.println(x[i]);
			if (x[i] - 1 < x[i]) {
				System.out.println("Возрастающая");
			} else {
				System.out.println("Убыыающая");
			}
		}

	}

}
