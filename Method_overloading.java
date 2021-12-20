package Java_programs;

import java.util.Scanner;

public class method_overloading {

	public static void main(String[] args) {
		int a,opt;
		double r;
		float w,h;
		char c;
	
		Scanner s=new Scanner(System.in);
		do
		{
		System.out.println("Select a shape\n \n Circle=1 \n Square=2 \n Triangle=3 \n ");
		opt=s.nextInt();
		if(opt==1)
		
		{System.out.println("Enter the radius of the circle:");
		r=s.nextDouble();
		Area.calc(r);}
		
		else if(opt==2)
		{
		System.out.println("Enter the length of the square:");
		a=s.nextInt();
		Area.calc(a);
		}
		else
		{
		System.out.println("Enter the breadth of the triangle:");
		w=s.nextFloat();
		System.out.println("Enter the height of the triangle:");
		h=s.nextFloat();
		Area.calc(w,h);
		}
		System.out.println("Do u want to continue(If yes,Please type Y or y):");
		c=s.next().charAt(0);}
		while(c=='Y'|| c=='y');
		

	}
	class Area{
		static double calc(double r)
		{   double area;
		    area=(3.14*r*r);
			System.out.println("The area of circle is" +" "+ +area);
		    return area;
		}
		static int calc(int a)
		{
			int area;
			area=a*a;
			System.out.println("The area of square is" +" "+ area);
		    return area;
		}
	    static float calc(float w,float h)
		{
	    	float area;
	    	area=(w*h)/2;
	    	System.out.println("The area of triangle is" +" "+ area);
	    	return area;
	    }
	    
		
		
	}

}
