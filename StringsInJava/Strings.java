import java.util.*;


public class Strings{
    public static void main(String args []){
        //String Declaration
       // String name = "Rohti";
       // String fullName = "Rohti Gore ";
       // String sentece = "My name is Rohti Gore";

       /*
        * //Inputing Name
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        System.out.println("Your Name is : "+ name);
        */
        /*
         *  //Concatenation
        String firstName = "Tony";
        String LastName = "Stark";
        String fullName = firstName +" "+ LastName;
        System.out.println(fullName.length());

        //CharAt
        for(int i=0; i<=fullName.length(); i++){
            System.out.println(fullName.charAt(i));
        }
         */

        // Compare Strings
        String name1 = "Rohit";
        String name2 = "Gaurav";

        //1. s1 > s2 -> +ve value
        //2. s1 == s2 -> 0
        //3. s1 < s2 -> -ve value

        /*
         * if(name1.compareTo(name2) == 0);{
            System.out.println("Strings are Equal");
        }else{
            System.out.println("Strings are not Equal");
        }
         */
        
         //if(name1 == name2){
          //  System.out.println("Strings are equal");
        // }else{
          //  System.out.println("Strings are not equal");
        // }
        /*
         * //Dont use == , use compareTo() function
        if(new String("Rohit")== new String("Rohit")){
            System.out.println("Strings are equal");
        }
        else{
            System.out.println("Strings are not equal");
        }
         */
       
         //SubString
        String sentance = "RohitGore";
        //substring(beginIndex (starting Index), end Index )
        String name = sentance.substring(5);
        System.out.println("Name :"+name);

        //String are Immutable
        


         
        

       
    }
}

