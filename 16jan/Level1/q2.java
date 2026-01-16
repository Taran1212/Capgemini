class Circle{
    int radius = 20;

    Circle(int radius){
        this.radius = radius;
    }

    Circle(){

    }
}

public class q2 {
    public static void main(String[] args) {
        
        Circle c1 = new Circle();
        Circle c2 = new Circle(32);

        System.out.println(c1.radius);
        System.out.println(c2.radius);

    }
}
