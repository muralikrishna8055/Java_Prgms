/*
* java program to print thr Number pyramid
*/

public class java19 {
    public static void main(String[] args) {

        int n = 5;

        for (int i = 1; i <= n; i++) {// outer loop
            for(int j=1; j<=n-i; j++) {       // printing the space
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {       // loop printing the number
                System.out.print(i+" ");
            }
            System.out.println(" ");
            ;
        }
    }
}
