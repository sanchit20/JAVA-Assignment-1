package assignment;

public class Generic<E> {
	public <E> void get_result(E n)
	{
		try
		{
			if(n.getClass().getName()=="String")
			{
				throw new Exception();
			}
			else {
				System.out.println("2/3 of "+n+" is : " +((Integer.parseInt(String.valueOf(n))*2)/3));
			}
		} 
		catch(Exception e) 
		{ 
			System.out.println("Strings not allowed!");
		} 
	}
	public static void main(String[] args) 
	{
		Generic gen=new Generic();
		gen.get_result(1000);
		gen.get_result("one");
	}
}
