class Parent{
    void property(){
        System.out.println("cash land gold");
    }
void marriage(){
    System.out.println("traditional");
}
}
class Child extends Parent{
    void marriage(){
        System.out.println("modern");
    }
}

class Overriding {
    public static void main(String[] args) {
        Parent p1=new Parent();
        p1.marriage();
        Parent p2=new Child();
        p2.marriage();
        Child c1= new Child();
        c1.marriage();
    }
}
