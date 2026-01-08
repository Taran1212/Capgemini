import java.util.*;

public class q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        int startIndex = sc.nextInt();
        int endIndex = sc.nextInt();

        String temp = findSubString(s, startIndex, endIndex);
        s = s.substring(startIndex,endIndex+1);

        if(temp.equals(s)){
            System.out.println("True");
        }else{
            System.out.println("False");
        }
    }

    public static String findSubString(String s, int startIndex, int endIndex) {

        String res = "";

        for(int i = startIndex; i<= endIndex; i++){
            res+= s.charAt(i);
        }

        return res;
    }
}
