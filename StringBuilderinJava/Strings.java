import java.util.*;

public class Strings{
    public static void main(String args []){
        //StringBuilder sb = new StringBuilder("Tony");
       // System.out.println(sb);
        /*
         * //char at index 0
        System.out.println(sb.charAt(0));

        //set char at index
        sb.setCharAt(0, 'P');
        System.out.println(sb);
         */
        
         /*
          *  //Inserting new char in String
        sb.insert(0, 'S');
        System.out.println(sb);
         
        sb.insert(2, 'N');
        System.out.println(sb);
          
        
        //Delete the extra 'N'
        sb.delete(2, 3);
        System.out.println(sb);
       */

       /*
        * //append : Adding char in string
       StringBuilder sb = new StringBuilder("R");
       sb.append("o");
       sb.append("h");
       sb.append("i");
       sb.append("t");

       System.out.println(sb.length());

        */

        //Reversed String 
        StringBuilder sb = new StringBuilder("Rohit");

        for(int i=0; i<sb.length()/2; i++){
            int front = i;
            int back = sb.length()-1-i; // 5-1-0

            //Deleting Char on front, back
            char frontChar = sb.charAt(front);
            char backChar = sb.charAt(back);
             
            //Stting char at Front, Back
            sb.setCharAt(front, backChar);
            sb.setCharAt(back, frontChar);
        }

        System.out.println(sb);
       
    }
}