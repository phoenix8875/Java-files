class Superasrefrence {
int x;
void set(int a){
    x=a;
}
void show(){
    System.out.println("parent class x= "+x);
}
}
class Two extends Superasrefrence{
    int x;
    void set(int a,int b){
        super.x=a;
        this.x=b;
    }
    void show(){
        super.show();
        System.out.println("child class x=  "+x);
    }
}
class MainSup{
    public static void main(String[] args) {
        Two obj=new Two();
        obj.set(4,66);
        obj.show();
    }
}
