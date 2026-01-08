import java.util.*;

public class q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        fixException(s);

    }


    public static void fixException(String s){

        try{
            s.substring(1,0);
        }catch(RuntimeException e){
            System.out.println("Handled");
        }
    }
}
