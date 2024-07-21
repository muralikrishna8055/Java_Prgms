/*
* java program to print the palindromic pattern
*/

public class java20 {
    public static void main(String[] args) {

        int n=5;
        for(int i=1; i<=n; i++){     //outer loop
            for(int j=1; j<=n-i; j++){    // to print the space
                System.out.print(" ");
            }
            for(int j=i; j>=1; j--){      // print the number
                System.out.print(j);
            }
            for(int j=2; j<=i; j++){   // second half
                System.out.print(j);
            }
            System.out.println("");
        }
    }
}
