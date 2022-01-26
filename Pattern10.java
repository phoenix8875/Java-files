public class Pattern10{
public static void main(String[]args)
{int n=7;
for(int row=1;row<n;row++){
for(int col=1;col<=row;col++){
System.out.print("*");
if (row==col)
 {
System.out.print("*");
row--;
}


}
System.out.println();}
}
}