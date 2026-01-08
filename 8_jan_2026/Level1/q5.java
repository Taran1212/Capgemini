import java.util.*;

public class q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String s = sc.nextLine();

        fixException(s);

    }

    public static void fixException(String s){

        try{

            int i = 0;
            while(true){
                System.out.println(s.charAt(i));
                i++;
            }
        }catch(StringIndexOutOfBoundsException e){
            System.out.println("Exception handled");
        }
    }
}
