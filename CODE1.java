import java.util.Scanner;

public class CODE1 {


    public static void main(String[] args) {
        double x;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter float x ");
        x=sc.nextFloat();
        int y=(int)x;
        System.out.println("conversion sucess:\n  "+y);
        System.out.println("precision to two decimals");
        System.out.printf("%.2f",x);

    }
}

