class Person{
    String name;
    int age;

    Person(String n, int a){
        this.name = n;
        this.age = a;
    }

    Person(Person p1){
        this.name = p1.name;
        this.age = p1.age;
    }
}

public class q3 {
    public static void main(String[] args) {

        Person p1 = new Person("abc",12);
        Person p2 = new Person(p1);

        System.out.println(p1.name);
        System.out.println(p1.age);
        System.out.println(p2.name);
        System.out.println(p2.age);
        }
}
