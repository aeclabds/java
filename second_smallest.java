import java.util.Scanner;
public class Smallest
{
public static void main(String[] args)
{
int n,min;
Scanner o=new Scanner(System.in);
System.out.println("enter the number of elements");
n=o.nextInt();
int a[]=new int[n];
System.out.println("enter the elements in array");
for(int i=0;i<n;i++)
{
a[i]=o.nextInt();
}
for(int i=0;i<n;i++)
{
for(int j=0;j<n;j++)
{
if(a[i]<a[j])
{
min=a[j];
a[j]=a[i];
a[i]=min;
}
}
}

System.out.println("the Smallest element in the array is :"+a[1]);
}
}
