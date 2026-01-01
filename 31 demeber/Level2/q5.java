import java.util.*;

public class q5{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int fahrenheit = sc.nextInt();

        int celsiusResult = (int)((fahrenheit-32)*(5.0/9));

        System.out.println("The " + fahrenheit + " fahrenheit is " + celsiusResult +  " celsius");
    }
}