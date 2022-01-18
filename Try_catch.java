package java_lab;
import java.util.Scanner;
public class Try_Catch{
		   
	public static void main(String args[]) {
			   int num1,num2,div; 
			   Scanner s= new Scanner(System.in);
			   System.out.println("Enter the first number:");
			   num1=s.nextInt();
			   System.out.println("Enter the second number:");
			   num2=s.nextInt();
			  try {
		         div=num1/num2;
			  }
		      catch (ArithmeticException e) { 
		         System.out.println("Exception thrown:"+e);
		      }

       }
}

