class Supertocallcons {
Supertocallcons(){
    System.out.println("parent class constructor is called");
}
}
class two extends Supertocallcons{
    two(){
        super();
        System.out.println("child class constructor is called");
    }
}
class Mainsuper{
    public static void main(String[] args) {
        two obj=new two();

    }
}