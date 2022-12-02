

public class ButterflyPattern{
    public static void main(String[] args){
        int n = 5;

        //First half -> Upper half
        for(int i = 1; i<=n; i++){
            //1St part
            for(int j = 1 ; j<=i; j++){
                System.out.print("*");
            }
            //Spaces
            int spaces = 2 * (n-i);
            for(int j = 1; j<=spaces; j++){
                System.out.print(" ");
            }

            //2nd part Star
            for(int j = 1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
            //Lower half 
            for(int i = n; i>=1; i--){
                //1St part
                for(int j = 1 ; j<=i; j++){
                    System.out.print("*");
                }
                //Spaces
                int spaces = 2 * (n-i);
                for(int j = 1; j<=spaces; j++){
                    System.out.print(" ");
                }
    
                //2nd part Star
                for(int j = 1; j<=i; j++){
                    System.out.print("*");
                }
                System.out.println();
        
                }
            }
}