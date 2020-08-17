package assignment;
import java.util.*;
public class Code5 {
	double real,imagin;
	Code5(double real,double imaginary)
	{
		this.real=real;
		this.imagin=imaginary;
	}
	static void Sum(Code5 a,Code5 b)
	{
		System.out.println("Sum : "+(a.real+b.real)+"+"+(a.imagin+b.imagin)+"i");
	}
	static void subtract(Code5 a,Code5 b)
	{
		System.out.println("Difference: "+(a.real-b.real)+"+"+(a.imagin-b.imagin)+"i");
	}
	static void multiply(Code5 a,Code5 b)
	{
		System.out.println("Product: "+(a.real*b.real)+"+"+(a.imagin*b.imagin)+"i");
	}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		ArrayList<Code5> code=new ArrayList<Code5>();
		System.out.print("add first input");
		code.add(new Code5(sc.nextDouble(),sc.nextDouble()));
	    System.out.println("add second input");
		code.add(new Code5(sc.nextDouble(),sc.nextDouble()));
		System.out.println("Additon");
		Sum(code.get(0),code.get(1));
		multiply(code.get(0),code.get(1));
		subtract(code.get(0),code.get(1));
		sc.close();
	}
}

