class Inheritence {
void test(){
    System.out.println("object of inherited class calling parent class method");
}

}
class Inh extends Inheritence{
    void test2(){
        System.out.println("mlti");
    }
}
class Maininheritence extends Inh{
    public static void main(String[] args) {
        Maininheritence obj=new Maininheritence();
        obj.test();
        obj.test2();
    }
}
