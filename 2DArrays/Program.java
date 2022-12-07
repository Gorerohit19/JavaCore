import java.util.*;

public class Program{
    public static void main(String args []){
       
       /*
       Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int cols = sc.nextInt();

        int [][] numbers = new int [row][cols];

        //Input 
        for(int i=0; i<row; i++){
            for(int j=0; j<cols; j++){
                numbers[i][j] = sc.nextInt();
            }
        }

        //Output 
        for(int i=0; i<row; i++){
            for(int j=0; j<cols ; j++){
                System.out.print(numbers[i][j] + " ");
            }
            System.out.println();
        }
       */ 

       //Finding x in Matrix Example :
       Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int cols = sc.nextInt();

        int [][] numbers = new int [row][cols];

        //Input 
        for(int i=0; i<row; i++){
            for(int j=0; j<cols; j++){
                numbers[i][j] = sc.nextInt();
            }
        }
        
        int x = sc.nextInt();

        for(int i=0; i<row; i++){
            for(int j=0; j<cols; j++){
                //Compare with x
                if(numbers[i][j] == x){
                    System.out.println("X found at location ("+ i + ","+ j +")");
                }
            }
        }
    }
}