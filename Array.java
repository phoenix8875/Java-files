import java.util.Scanner;
class Arrayexample {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("enter row value");
        int row = sc.nextInt();
        System.out.println("enter col value");
        int col = sc.nextInt();
        int arr[][] = new int[row][col];
        //take elements in array
        for(int i=0;i<row;i++){
            System.out.println(" enter "+col+" elements in row "+i);
            for(int j=0;j<col;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    //change specific position values

        System.out.println("new array is");
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

    }
}
