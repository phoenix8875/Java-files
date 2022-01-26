public class Methodoverload {
   static int sum(int a ,int b){
        return(a+b);
    }
  static int sum(int a,int b,int c){
        return(a+b+c);
   }
 static double sum(double a,double b){
        return(a+b);
  }

    public static void main(String[] args) {
      /*  Methodoverload obj=new Methodoverload();
        int x=obj.sum(1,4);
        int y= obj.sum(4,5,6);
        double z=obj.sum(4.5,2.4);

       */
        int x=sum(4,5);
        int y=sum(54,45);
        double z=sum(4.15,2.55);
        System.out.println(x+"\n"+y+"\n"+z);
    }
}
