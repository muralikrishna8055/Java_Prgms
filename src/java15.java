/*
* java program to print floyds triangle
*/

public class java15 {
    public static void main(String[] args) {
        int x=5;
        int counter=1;

        //outer loop
        for(int i=1; i<=x; i++){
            //inner loop -> to print the numbers
            for(int j=1; j<=i; j++){
                System.out.print(counter +" ");
                counter ++;
            }
            System.out.println();
        }


        System.out.println("****************");

        //o-1 triangle

        for(int i=1; i<=x; i++){

            // innerloop -> to print the o,1
            for(int j=1; j<=i; j++){

                // conditon to print value 0 or 1
                if( (i+j) %2 ==0){  //even
                    System.out.print("1");
                }else{ // odd
                    System.out.print("0");
                }
            }
            System.out.println();
        }
    }
}
