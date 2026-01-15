import java.util.Scanner;

public class q14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];

        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }

        int first = 0;
        int end = arr.length-1;

        while(first < end){
            int temp = arr[end];
            arr[end] = arr[first];
            arr[first] = temp;

            first ++;
            end --;
        }

        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
