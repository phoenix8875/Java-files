class Thisconstructor {
//using this to call cons from another constructor
 int roll;String name,city;
 Thisconstructor(int roll,String name){
     this.roll=roll;
     this.name=name;
 }
 Thisconstructor(int roll,String name,String city){
  //taking name and roll by calling previous constructor
     this(roll,name);
     this.city=city;
 }
void show(){
    System.out.println("rolln is  "+roll+" name is "+name+" city "+city);
}
}
class Mainthiscons{
    public static void main(String[] args) {
        Thisconstructor obj=new Thisconstructor(126,"bunty");
        obj.show();
        Thisconstructor obj1=new Thisconstructor(161,"ritik","Banswara");
obj1.show();
    }
}
