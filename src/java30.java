import java.util.Scanner;

public class java30 {
    public static void main(String[] args) {
        Scanner cs= new Scanner(System.in);

        // input
        System.out.print("Enter The Size Of Row  ");
        int m = cs.nextInt();
        System.out.print("Enter The Size Of Column ");
        int n= cs.nextInt();
        int[][] matrix= new int[m][n]; // array declaration
         // input to array
        for(int i=0; i<m; i++){  //rows
            System.out.println("Enter the number in "+i+ " th row");
            for(int j=0; j<n; j++){  // columns
                matrix[i][j]=cs.nextInt();
            }
        }

        // output
        for(int i=0; i<m; i++){
            for(int j=0;  j<n; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println(" ");
        }

    }
}
