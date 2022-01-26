//user input
//importing scanner
import java.util.Scanner;
public class Ui{
public static void main(String[]args)
{
System.out.println("entr your name");
//creating scanner object
Scanner sc=new Scanner(System.in);

//accepting string values
String n=sc.nextLine();
System.out.println("enter your age");
//accepting int
int age=sc.nextInt();


System.out.println("helloo	"+n);


if(age>18)
{
System.out.println("you are eligible");
}
else
{
System.out.println("you are not eligible");
}


}


}