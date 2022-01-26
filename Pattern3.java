import java.util.Scanner;

public class Array2 {
    public static void main(String[] args) {
        int i, j;
        System.out.println("enter the value of rows and col");
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();
        int arr[][] = new int[r][c];
        System.out.println("Enter elements in array");

        for (i = 0; i < r; i++) {
            for (j = 0; j < c; j++) {
                arr[i][j] = sc.nextInt();
            }
            // print
            for (int k = 0; k < r; k++) {
                for (int l = 0; l < c; l++) {
                    System.out.print(arr[k][l]);
                }

            }

            // printend
        }

    }

}