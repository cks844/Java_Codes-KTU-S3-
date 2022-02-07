package java_lab;
class Character extends Thread
{
	public void run() 
	{
		for(char i='a';i<='e';i++)
		{
			try
			{
				System.out.print(i+"\n");
				Thread.sleep(100);
			}
			catch(Exception e) {}
			
		}
	}
}
class NUmber extends Thread
{ 
	public void run() 
	{
		for(int i=1;i<=5;i++)
		{
			try
			{
				System.out.print(i+"\n");
				Thread.sleep(500);
			}
			catch(Exception e) {}
			
		}
	}
}

public class MT2 {

	public static void main(String[] args) {
		Character alp = new Character();
		NUmber num = new NUmber();
		try {
			 
			 alp.start();
			 num.start(); 
			 alp.join();
			 num.join();
		}
		catch(Exception e)
		{
			System.out.println(e);
		
		}

	}

}
