import java.util.Scanner;
public class Pattern0
{
public static void main(String[]args)
{
System.out.println("enter number of rows");
Scanner sc=new Scanner(System.in);
int r=sc.nextInt();
for(int i=0;i<r;i++)
{
for(int j=0;j<=i;j++){
System.out.print("*");

}
System.out.println();
}
}
}