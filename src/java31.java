import java.util.Scanner;

public class java31 {
    public static void main(String[] args) {
        /* Scanner sc= new Scanner(System.in);
        System.out.println("Enter your Name");
        String name= sc.nextLine();
        System.out.println(name+" no of character in the name = "+name.length());
         */
        String firstName="Murali";
        String lastName="krishna";
        String fullName= firstName + lastName;
        System.out.println("full name = "+fullName +"  no of character =" +fullName.length());
        // CharAt()
        for(int i=0; i<fullName.length(); i++){
            System.out.print(" " + i + " " +fullName.charAt(i) + " " );
        }
        System.out.println(" ");
        if(firstName.compareTo(lastName)==0){
            System.out.println("strings are equal");
        }else{
            System.out.println("stings are not equal");
       }
}

}