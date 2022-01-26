import java.util.Scanner;
public class Pattern8{
public static void main(String args[]){
int p=1;
System.out.println("enter number of lines");
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
for(int row=1;row<=n;row++){
for(int col=1;col<=row;col++){
System.out.print(p);
p++;
}
System.out.println();
}


}
}