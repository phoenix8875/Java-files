public class Varargs {

       void sum(int... arr){
           System.out.println("number of arguments      "+arr.length);
        }

}
class Mainvarargs{
    public static void main(String[] args) {
   Varargs obj=new Varargs();
   obj.sum(4,6,56,45,78);
   obj.sum(45,54);
    }
}
