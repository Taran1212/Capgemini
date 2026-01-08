import java.util.*;

public class q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        System.out.println("The length of the String is " + findLength(s));




    }

    public static int findLength(String s){

        int index = 0;

        while(true){

            try{
                s.charAt(index);
            }catch(RuntimeException e){
                return index;
            }

            index++;

        }

    }
}