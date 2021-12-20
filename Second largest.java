package Java_programs;

import java.util.Scanner;

public class Second_largest {

	public static void main(String[] args) {
		int n,i,j,temp;
		int[] a=new int[50];
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the size of the array:");
		n=s.nextInt();
		System.out.println(" Enter the array elements:");
		for(i=0;i<n;i++)
		{
			a[i]=s.nextInt();
		}
		System.out.println(" The array elements are:");
		for(i=0;i<n;i++)
		{
			System.out.print("\t"+a[i]);
		}
		for(i=0;i<n;i++)
		{
			for(j=0;j<n-i-1;j++)
			if(a[j]<a[j+1])
			{
				temp=a[j];
				a[j]=a[j+1];
				a[j+1]=temp;
			}
          			
		}
		System.out.println("\n The sorted array is:");
		for(i=0;i<n;i++)
		{
			System.out.println(+a[i]);
				
		}
		System.out.println("The second largest element in the array is" +" "+ +a[1]);;
		
		
		
	}

}
