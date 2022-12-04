public class Arrays{
    public static void main(String args []){
        //Normaly creating variable
        int age = 18;
        int english = 95;
        int physics = 97;
        int chemistry = 98;

        //List of item in same types : Arrays 

        int [] marks = new int[3];
        marks [0] = 95;
        marks [1] = 97;
        marks [2] = 98;
        
        System.out.println("English marks ="+ marks[0]);
        System.err.println("Physics marks ="+ marks[1]);
        System.out.println("Chemistry marks ="+ marks[2]);
    }
}