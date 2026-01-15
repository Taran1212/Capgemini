import java.util.*;

public class q7 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        int[] arr = new int[26];

        for(int i = 0; i < s.length(); i++){

            char ch = s.charAt(i);
            arr[ch - 'a'] ++;
        }

        boolean flag = false;

        for(int i = 0; i < arr.length; i++){
            if(arr[i] == 0){
                flag = true;
                break;
            }
        }

        if(flag){
            System.out.println("Not a panagram");
        }else{
            System.out.println("Panagram");
        }
    }
}
