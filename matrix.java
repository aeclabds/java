import java.util.Scanner;
public class Matrix
{
public static void main(String[] args)
{
int m1, n1, m2, n2;
Scanner g=new Scanner(System.in);
System.out.println("Enter the no.of rows of matrix 1");
m1=g.nextInt();
System.out.println("Enter the no.of columns of matrix 1");
n1=g.nextInt();
System.out.println("Enter the no.of rows of matrix 2");
m2=g.nextInt();
System.out.println("Enter the no.of columns of matrix 2");
n2=g.nextInt();
if(n1!=m2)
{
System.out.println("Matrix multiplication is not possible");
}
else
{
int A[][]=new int[m1][n1];
int B[][]=new int[m2][n2];
int C[][]=new int[m1][n2];
System.out.println("Enter the elements of matrix 1");
for(int i=0;i<m1;i++)
{
for(int j=0;j<n1;j++)
{
A[i][j]=g.nextInt();
}
}
System.out.println("Enter the elements of matrix 2");
for(int i=0;i<m2;i++)
{
for(int j=0;j<n2;j++)
{
B[i][j]=g.nextInt();
}
}
for(int i=0;i<m1;i++)
{
for(int j=0;j<n2;j++)
{
C[i][j]=0;
for(int k=0;k<n1;k++)
{
C[i][j]+=A[i][k]*B[k][j];
}
}
}
for(int i=0;i<m1;i++)
{
for(int j=0;j<n1;j++)
{
System.out.println("Matrix 1 is: " +A[i][j]);
}
}
for(int i=0;i<m2;i++)
{
for(int j=0;j<n2;j++)
{
System.out.println("Matrix 2 is: " +B[i][j]);
}
}
for(int i=0;i<m1;i++)
{
for(int j=0;j<n2;j++)
{
System.out.println("Resultant matrix is: " +C[i][j]);
}
}
}
}
}
