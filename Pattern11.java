import java.util.Scanner;
public class Pattern11{
public static void main(String[]args){
System.out.println("enter number of lines");
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int x=n%2==0?n/2:((n+1)/2);
for(int row=1;row<=x;row++){
for(int col=1;col<=row;col++)
{
System.out.print("z ");
}
System.out.println();
}
for(int row=(x+1);row<=n;row++)
{for(int col=1;col<=(n+1)-row;col++){
System.out.print("z ");

}
System.out.println();
}
}
}