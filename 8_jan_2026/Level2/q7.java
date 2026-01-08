import java.util.*;

public class q7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        int[] index = customTrim(s);

        String temp = s.trim();
        s = s.substring(index[0],index[1]+1);

        if(s.equals(temp)){
            System.out.println("True");
        }else{
            System.out.println("False");
        }


        
    }

    public static int[] customTrim(String s){

        int start = 0;
        int end = 0;

        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) != ' '){
                start = i;
                break;
            }
        }

        for(int i = s.length()-1; i >= 0; i--){
            if(s.charAt(i) != ' '){
                end = i;
                break;
            }
        }


        return new int[]{start,end};
    }
}
