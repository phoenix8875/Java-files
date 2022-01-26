import java.util.Scanner;
public class Pattern12
{//class
public static void main(String[]args)
{//method
System.out.println("enter number of lines");
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int x=n%2==0?(n/2):((n+1)/2);
for(int r=1;r<=x;r++)
{//1stloop

for(int c=1;c<=((x+1)-r);c++)
{//2ndloop
System.out.print(" ");

//2ndloop}
for(int c=1;c<=r;c++)
{//3rdloop

System.out.print("* ");
//3rdloop}


//1stloop}




//method}
//class}