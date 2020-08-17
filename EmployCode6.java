package assignment;

import java.util.ArrayList;
public class EmployCode6{
	int year,salary;
	String name,address;
	
	EmployCode6(String name,int year,int sal,String add) {
		this.name=name;
		this.year=year;
		this.salary=sal;
		this.address=add;
	}
	void display()
	{
		System.out.println(this.name+"          "+this.year+"          "+this.address);
	}
	public static void main(String[] args) {
		
		ArrayList<EmployCode6> Employ =new ArrayList<EmployCode6>();
		System.out.println( "----------------------Details of Employes are--------------------");
		Employ.add(new EmployCode6("Robert",1994,25000,"64C- WallStreet"));
		Employ.add(new EmployCode6("Sam",2000,35000,"68D- WallStreet"));
		Employ.add(new EmployCode6("John",1999,45000,"26B- WallStreet"));
		System.out.println("Name      Year of Joining      Address");
		for(EmployCode6 code: Employ)
		{
			
			code.display();
		}
	}
}