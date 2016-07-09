import java.io.*;
import java.util.*;
import java.lang.*;
public class Number
{
public static void main(String[]args)
{
int n;
System.out.println("Enter the Number");
Scanner sc=new Scanner(System.in);
n=sc.nextInt();
if(n==0)
{
System.out.println("Given number is Zero");
}
else if(n<0)
{
System.out.println("Given number is Negative");
}
else
{
System.out.println("Given number is Positive");
}
}
}
