import java.util.Scanner;
public class prime
{
public static void main(String[] args)
{

int n,i,m=0,flag=0;
Scanner w=new Scanner(System.in);
System.out.println("Enter the Number");
n=w.nextInt();
m=n/2;
if(n==0 || n==1)
{
System.out.println("the number is not prime");
}
else
{
for(i=2;i<=m;i++)
{
if(n%i==0)
{
System.out.println("The number is not prime");
flag=1;
break;
}
}
if(flag==0)
{
System.out.println("the number is prime");
}
}
}
}
