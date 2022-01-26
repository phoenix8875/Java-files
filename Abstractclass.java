abstract class One{
   abstract void show();
}
class Twoo extends  One{
    void show(){
        System.out.println("abstract class example");
    }
}
class Abstractclass{
    public static void main(String[] args) {
        Twoo obj=new Twoo();
        obj.show();
    }
}