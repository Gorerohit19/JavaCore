import java.util.*;

public class Loops {
    public static void main(String[] args)
    {
        /* 
        For Loop : printing 1 to 10 numbers
        for(int count = 0; count < 11; count++){
        System.out.println(count);
       }

       //while Loop : printing 1 to 10 numbers
       int i = 0;
       while(i < 11){
        System.out.println(i);
        i++; // Or i = i + 1 ;
       }
       

       //Do While Loop : Printing 1 to 10 Numbers
       int i = 0;
       do {
            System.out.println(i);
            i++;
       }
       while( i < 11);
       */
      /* 
        //False Condition For loops

        int i = 12;
        while(i < 11){
            System.out.println("Transflower");
        }

        do{
            System.out.println("Transflower");
        }
        while(i < 11);
        */
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

      for(int i = 1; i < 11; i++){
        System.out.println(i*n);
      }
    }  
}
