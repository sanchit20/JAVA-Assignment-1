package CodingAssesment;
import java.util.Scanner;

		class Rectangle {
			int height,width;
			void Show()
			{
				System.out.println("Width: "+this.width+" and Height: "+this.height);
			}
		}
		class RectangleArea extends Rectangle
		{
			void read()
			{
				Scanner sc=new Scanner(System.in);
				System.out.print("Enter width");
				width=sc.nextInt();
				System.out.print("Enter height");
				height=sc.nextInt();
				sc.close();
			}
			void Show(int width,int height)
			{
				System.out.println("Area of rectangle is: "+width*height);
			}
		}
		public class AssignmentCode2
		{
			public static void main(String[] args)
			{
				RectangleArea ra=new RectangleArea();
				ra.read();
				ra.Show();
				ra.Show(ra.width,ra.height);
			}
		}
	
