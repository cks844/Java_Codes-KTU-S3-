
import java.io.*;
import java.util.Scanner;

class File_1{
  public static void main(String[] args)throws IOException {
    File fin=new File("num1.txt");
    if(fin.exists())
    {
        System.out.println("File exists");
    }else
    {
        fin.createNewFile();
        System.out.println("File created");
    }
  FileOutputStream fout=new FileOutputStream("num1.txt");
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter the no of elements:");
  int s=sc.nextInt();
  for(int i=1;i<=s;i++)
  {
      System.out.println("Enter the "+i+" number:");
      int num=sc.nextInt();
      fout.write(num);
  }
  int i=0;
  FileInputStream fin1=new FileInputStream("num1.txt");
  while((i=fin1.read())!=-1)
  {
      System.out.print(i);
      System.out.print("\t");
  }
  
}
}
