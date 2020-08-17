package CodingAssesment;
import java.util.*;
public class AssignmentCode1 {
	interface Add
	{
		void add(int x,int y);
	}
	interface Subtract
	{
		void difference(int x,int y);
	}
	interface Multiply
	{
		void product(int x,int y);
	}
	interface Divide
	{
		void safeDivision(int x,int y);
	}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("-----------------------------Welcome to Simple Calculator by Cipher Schools-----------");
		System.out.print("Enter the numbers : ");
		int m=sc.nextInt();
		int n=sc.nextInt();
		System.out.print("For Addition press '+' + For Subtraction press '-' + For Multiplication press'*' + For divide press '/' ");
		char c=sc.next().charAt(0);
		Add add=(int a,int b)->{
			System.out.println(a+b);
		};
		Subtract difference=(int a,int b)->{
			System.out.println(a-b);
		};
		Multiply product=(int a,int b)->{
			System.out.println(a*b);
		};
		Divide safeDivision=(int a,int b)->{
			System.out.println(a/b);
		};
		sc.close();
		switch(c)
		{
		case('+'):
		{
			add.add(m,n);
			break;
		}
		case('-'):
		{
			difference.difference(m,n);
			break;
		}
		case('*'):
		{
			product.product(m,n);
			break;
		}
		case('/'):
		{
			safeDivision.safeDivision(m,n);
			break;
		}
		default:
			System.out.println("Invalid operation!");
		}
	}
}