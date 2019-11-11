package by.htp.luchko.decomposition;

import java.util.Random;

public class Task06 {
	/*
	 * Вычислить площадь правильного шестиугольника со стороной а, используя метод
	 * вычисления площади треугольника.
	 */

	public static void main(String[] args) {

		int a = randomValue(10);
		print ("Сторона а: ", (int) a);
		
		double area = areaOfHexagon(a);
		print("Площадь многоугольника со стороной а: ", area);

	}
	
	public static double areaOfHexagon (int a) {
		return areaOfTriangle(a) * 6;
	}
	
	public static double areaOfTriangle (int a) {
		return ((Math.sqrt(3) * Math.pow(a, 2)) / 4);
				
	}
	
	public static void print(String s, double area) {

		System.out.println(s + area);

	}

	public static int randomValue(int limit) {

		Random rand = new Random();
		return rand.nextInt(limit);
	}
}
