/*
* java program to print number pyramid
*/

public class java14 {
    public static void main(String[] args) {
        int x=5;

        //outer loop
        for(int i=1; i<=x; i++){
            //inner loop -> to print numbers
            for(int j=1; j<=i; j++){
                System.out.print(j +" ");
            }
            System.out.println();
        }

        System.out.println("*******************");

        //inverted pyramid

        //outer loop
        for(int i=x; i>=1; i--){
            //inner loop -> print numbers
            for(int j=1; j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
