import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
       int arr[][]= new arr[3][2];
      for(int i=0;i<2;i++){
          for(int j=0;j<i;j++){
              arr[i][j]=sc.nextInt();
          }
      }
        for(int i=0;i<2;i++){
            for(int j=0;j<i;j++){
                System.out.println(arr[i][j]);
            }
        }
    }
}
