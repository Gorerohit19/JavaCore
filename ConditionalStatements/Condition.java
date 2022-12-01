import java.util.Scanner;

public class Condition {
    public static void main(String[] args)
    {
        /* 
        //If Else statement
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();

        if(age > 18){
            System.out.println("Adult");
        }
        else{
            System.out.println("Not Adult");
        }
        */
       /* 
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();


        if( a > b){
            System.out.println("A is Greater then B");
        }
        else if( a < b){
            System.out.println(" A is Less then B");
        }
        else{
            System.out.println("A is Equal to B");
        }
        */

        Scanner sc = new Scanner(System.in);
        int button = sc.nextInt();

        /* 
        if( button == 1){
            System.out.println(" Hello");
        }
        else if( button == 2){
            System.out.println("Namaste");
        }
        else if( button == 3){
            System.out.println("Bonjour");
        }
        else{
            System.out.println("Invalid Button");
        }
         */


        // Switch Statement
         switch(button){
            case 1 : System.out.println("Hello");
            break;
            case 2 : System.out.println("Namaste");
            break;
            case 3 : System.out.println("Bonjour");
            break;
            default : System.out.println("Invalid Button");
         }
    }
}
