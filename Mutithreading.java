
import java.io.*;
import java.util.Scanner;
class Table
{
	void print(int n)
	{
		synchronized(this) {
			 for (int i = 1; i <= 5; i++)
			 {
				 System.out.println(n + "*"+i+ "="+(i * n));
				 try {
					 Thread.sleep(100);
				 }catch(Exception e) {
					 System.out.println(e);
				  }
			 }
		}
	 }
}
class Tab extends Thread
{
	Table t;
	int n;
	Tab(Table tab,int num)
	{
		t=tab;
		n=num;
	}
	 public void run()
	 {
		t.print(n); 
	 }
}
public class Multithreading
{
 public static void main(String args[]){
	 int num;
	 Table multi=new Table();
	 Scanner sc=new Scanner(System.in);
	 System.out.println("Enter the Table you want to run by Thread 1");
	 num=sc.nextInt();
	 Tab t1=new Tab(multi,num);
	 System.out.println("Enter the Table you want to run by Thread 2");
	 num=sc.nextInt();
	 Tab t2=new Tab(multi,num);
	 System.out.println("Enter the Table you want to run by Thread 3");
	 num=sc.nextInt();
	 Tab t3=new Tab(multi,num);
	 t1.run();
	 t2.run();
	 t3.run();
	 sc.close();
 }
}
