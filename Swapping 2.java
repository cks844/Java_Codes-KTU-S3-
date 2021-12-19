package program_2; 
import java.util.Scanner; 
public class swap_2 { 
public static void main(String[] args) { int a,b,temp; 
Scanner s=new Scanner(System.in); 
System.out.println("Enter a:"); 
a=s.nextInt(); 
System.out.println("Enter b:"); 
b=s.nextInt(); 
a=a+b; 
b=a-b; 
a=a-b; 
System.out.println("a="+a +" & "+ "b="+b); 
} 
}
