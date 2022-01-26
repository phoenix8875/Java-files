import java.util.Scanner;
public class Fib{
public static void main(String[]args){
int i,n1=0,n2=1,sum,count;
//ask for count value
System.out.println("enter the count");
Scanner sc=new Scanner(System.in);
count=sc.nextInt();
System.out.println(n1+" /n"+n2);
for(i=2;i<count;i++)
{
sum=n1+n2;
System.out.println(sum);
n1=n2;
n2=sum;

}

}



}