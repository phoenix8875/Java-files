 class Staticvariable{

    int x=10;
    static int y=10;
 void show()

     {
         System.out.println("    x=  " + x + "  y=  " + y);
     }
}
class Main{
    public static void main(String[] args) {
        Staticvariable obj=new Staticvariable();
        Staticvariable obj2=new Staticvariable();
       obj.x=121;
        obj2.y=45;
       obj.show();
       obj2.show();
    }
}
