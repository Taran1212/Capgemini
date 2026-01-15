import java.util.*;

public class q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int arr[] = new int[n];

        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();

        }

        int largest = Integer.MIN_VALUE;
        int second_largest = Integer.MIN_VALUE;

        for(int i = 0; i < arr.length; i++){

            if(arr[i] > largest){
                second_largest = largest;
                largest = arr[i];
            }else if(arr[i] > second_largest){
                second_largest = arr[i];
            }
        }

        System.out.println(second_largest);




    }
}
