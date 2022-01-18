package lab212;
import java.util.Scanner;
public class TryCatchFinally
{

	public static void main(String[] args) 
	{
		String check;
	do{
		try 
		{
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter number-1: ");
			int num1 = sc.nextInt();
			System.out.println("Enter number-2: ");
			int num2 = sc.nextInt();
			float result = num1/num2;
			System.out.println("Result ="+result);

		}
		catch( ArithmeticException e) 
		{
			System.out.println("/ by zero!");
		}
		finally 
		{
			Scanner ob = new Scanner(System.in);
			System.out.println("End of Operation");
			System.out.println("Do you want to Continue y/n ?");
		    check = ob.next();
		}
	   } while(check.equalsIgnoreCase("y"));
	}
}
