class Constructor{
    Constructor(){
        System.out.println("hello from default cons");
    }
    Constructor(int a,int b){
        System.out.println(a+b);
    }
    Constructor(double a,double b){
        System.out.printf("%.1f",a+b);
    }
}
class Mainc{
    public static void main(String[] args) {
        Constructor obj=new Constructor();
        Constructor obj2=new Constructor(4.5656,2.23);
        System.out.println();
        Constructor obj3=new Constructor(4,5);

    }
}