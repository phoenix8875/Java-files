import java.util.*;
class Getdatatypes {
void getint(int a){
    System.out.println(a);
}
void getchar(char a){
    System.out.println(a);
}
void getboolean(boolean a){
    System.out.println(a);
}
void getdouble(double a){
    System.out.println(a);
}
void getstring(String a){
    System.out.println(a);
}
void getfloat(float a){
    System.out.println(a);
}

}
class Datatypes{

    public static void main(String[] args) {
        Getdatatypes obj=new Getdatatypes();
        Scanner sc=new Scanner(System.in);
       System.out.println("enter boolean val");
        obj.getboolean(sc.nextBoolean());
        System.out.println("enter char val");
        obj.getchar(sc.next().charAt(0));
        System.out.println("enter double val");
        obj.getdouble(sc.nextDouble());
        System.out.println("enter int val");
        obj.getint(sc.nextInt());
        System.out.println("enter a line");
        obj.getstring(sc.nextLine());
        System.out.println("enter float");
        obj.getfloat(sc.nextFloat());

    }

        }
