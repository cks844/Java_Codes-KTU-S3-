import java.util.Scanner;

public class Matrix_multiplication {

	public static void main(String[] args) {
		int i,j,k,r1,c1,r2,s=0;
		int mat1[][]=new int[20][20];
		int mat2[][]=new int[20][20];
		int pro[][]=new int[20][20];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of rows and columns of the first matrix : ");
		r1=sc.nextInt();
		c1=sc.nextInt();
		System.out.println("Enter the elements of the first matrix : ");
		for(i=0;i<r1;i++)
		{
			for(j=0;j<c1;j++)
				mat1[i][j]=sc.nextInt();
		}
		System.out.println("Enter the number of rows of the second matrix : ");
		r2=sc.nextInt();
		System.out.println("Enter the elements of the second matrix : ");
		for(i=0;i<r2;i++)
		{
			for(j=0;j<c1;j++)
				mat2[i][j]=sc.nextInt();
		}
		System.out.println("First matrix");
		for(i=0;i<r1;i++)
		{
			for(j=0;j<c1;j++)
				System.out.print(mat1[i][j]+"\t");
			System.out.println();
		}
		System.out.println("Second matrix");
		for(i=0;i<r2;i++)
		{
			for(j=0;j<c1;j++)
				System.out.print(mat2[i][j]+"\t");
			System.out.println();
		}
		for(i=0;i<r1;i++)
		{
			for(j=0;j<c1;j++)
			{
			  pro[i][j]=0;
			    for(k=0;k<r2;k++)
				s+=mat1[i][k]*mat2[k][j];
				
			}
		}
		System.out.println("Product matrix");
		for(i=0;i<r1;i++)
		{
			for(j=0;j<c1;j++)
				System.out.print(pro[i][j]+"\t");
			System.out.println();
		}
	}

}
