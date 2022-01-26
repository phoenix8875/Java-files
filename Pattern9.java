import java.util.Scanner;
public class Pattern9{
public static void main(String[]aargs)
{System.out.println("enter number of lines");
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
for(int row=1;row<=n;row++){
for(int col=n;col>=row;col--){
System.out.print(col);
}
System.out.println();
}


}
}