class Copyconstructor {
    int a,b;
//default cons
    Copyconstructor(){
        a=5;
        b=6;
    System.out.println(a+b);
}
//copy cons take cons name with a refrence
   Copyconstructor(Copyconstructor c){
        //ref.variable of orignal
        a=c.a;
        b=c.b;
       System.out.println(a+b);
   }
}
class Maincopycons{
    public static void main(String []args){
        Copyconstructor obj=new Copyconstructor();
        Copyconstructor obj2=new Copyconstructor(obj);
    }
}
