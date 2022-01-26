class Student{
    int rolln;String name;
   void Studentdata(int rolln,String name){
    this.rolln=rolln;
    this.name=name;
    }
    void show(){
        System.out.println("roll n is   "+rolln+"   name is "+name);
    }
}
class Mainthiskey{
    public static void main(String[] args) {
        Student obj=new Student();
        obj.Studentdata(126,"bnty");
        obj.show();

    }
}