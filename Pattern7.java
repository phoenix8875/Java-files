import java.util.Scanner;
public class Pattern7{
public static void main(String args[]){
System.out.println("enter the number of lines");
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
for(int row=1;row<=n;row++){
for(int col=1;col<=((n+5)-2*row);col++){
 System.out.print("* ");
}
for(int col=1;col<=(row-1);col++){
System.out.print(" ");
}

System.out.println();
}
}}