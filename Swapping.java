package program_2; 
import java.util.Scanner; 
public class swap { 
public static void main(String[] args) { int a,b,temp; 
Scanner s=new Scanner(System.in); 
System.out.println("Enter a:"); 
a=s.nextInt(); 
System.out.println("Enter b:"); 
b=s.nextInt(); 
temp=a; 
a=b; 
b=temp; 
System.out.println("Value of a is:"+a); System.out.println("Value of b is:" +b); 
} 
}
