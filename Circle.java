package assignment;
import java.util.*;
public class Circle {
	private
		double radius;
		String color="red";
	Circle()
	{
		this.radius=1.0;
	}
	Circle(double r)
	{
		this.radius=r;
	}
	void getArea()
	{
		System.out.println("Area"+(3.142)*this.radius*this.radius);
	}
	void getRadius()
	{
		System.out.println("Radius is : "+this.radius);
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Circle c=new Circle();
		Circle C=new Circle();
		C.radius=sc.nextDouble();	
		sc.close();
		c.getRadius();
		c.getArea();
		C.getRadius();
		C.getArea();
	}
}

