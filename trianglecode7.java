package assignment;

import java.util.Scanner;

public class trianglecode7 {
	

	public static void main(String[] args) {
		double a, b, c, Perimeter, s, Area;
	Scanner sc = new Scanner(System.in);
		System.out.println(" Please Enter Three sides of triangle: ");
		a = sc.nextDouble();
		b = sc.nextDouble();
		c = sc.nextDouble();

		Perimeter = a + b + c;
		s = (a + b + c)/2;
		Area = Math.sqrt(s*(s-a)*(s-b)*(s-c));


		System.out.println("perimeter is "+Perimeter);
		System.out.println("Semiperimeter is "+s);
		System.out.println("Area is "+Area);
		sc.close();
	}
}
