import java.util.Scanner;
public class Pr1{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
System.out.println("enter number of lines");
int n=sc.nextInt();
for(int r=1;r<=n;r++){
for(int col=1;col<=n-r;col++){
System.out.print(" ");
}
for(int col=1;col<=(2*r)-1;col++){
System.out.print("* ");
}
System.out.println();
}
}



}