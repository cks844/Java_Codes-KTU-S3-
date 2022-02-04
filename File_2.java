package java_lab;
import java.io.*;
import java.util.Scanner;

public class File_2 {

	public static void main(String[] args) throws IOException{
	File fin=new File("sample.txt");
	if(fin.exists())
	{
		System.out.println("exists");
	}else
	{
		fin.createNewFile();
		System.out.println("file created");
	}
	try
	{
	 FileOutputStream fout=new FileOutputStream("sample.txt",true);
	 BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
	 System.out.println("enter data");
	 String s=br.readLine();
	 byte[] arr=s.getBytes();
	 fout.write(arr);
	    System.out.println("data added");
	 
	 }
	catch(Exception e)
	{
		System.out.println("File not found");
	}
	int i=0;
	FileInputStream fin1=new FileInputStream("sample.txt");
	System.out.println(fin1.available());
	while((i=fin1.read())!=-1)
	{
		char c=(char)i;
		System.out.print(c);
	}
  }
}
