import java.util.Scanner;
public class Pattern6{
public static void main(String[]args){
System.out.println("enter number of lines");
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
for(int row=1;row<=n;row++){
for(int col=1;col<=row;col++){
System.out.print ("*");
}
System.out.println();
}
}


}