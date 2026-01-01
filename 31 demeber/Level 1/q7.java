public class q7 {
    public static void main(String[] args) {
        int radius = 6378;

        double PI = 22/7;

        double volumeInKilometer = (4/3) * PI * radius * radius * radius;
        double volumeInMiles = volumeInKilometer * 1.6;

        System.out.println("The volume of earth in cubic kilometers is " + volumeInKilometer +  " and cubic miles is " + volumeInMiles);
    }
}
