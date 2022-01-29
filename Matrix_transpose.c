import java.util.Scanner;

public class Matrix_transpose {

	public static void main(String[] args) {
		int r,c,i,j;
	    int a[][]=new int[20][20];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of row: ");
		r=sc.nextInt();
		System.out.println("Enter the size of column: ");
		c=sc.nextInt();
		System.out.println("Enter the elements:");
		for(i=0;i<r;i++)
		{
		    for(j=0;j<c;j++)
		    {
		       a[i][j]=sc.nextInt();
		    }
		}
		System.out.println("The matrix is");
		for(i=0;i<r;i++)
		{
		    for(j=0;j<c;j++)
		    {
		       System.out.print(a[i][j]+"\t");
		    }
		    System.out.println();
		}
		System.out.println("The transpose of matrix is");
		for(i=0;i<r;i++)
		{
		    for(j=0;j<c;j++)
		    {
		       System.out.print(a[j][i]+"\t");
		    }
		    System.out.println();
		}
}
}
