public class q1{

    static class Book{
        String title;
        String author;
        int price;

        Book(){
            System.out.println("This is the default constructor");
        }

        Book(String t, String a){
            this.title = t;
            this.author = a;
            System.out.println("This is the 1st constructor");

        }

        Book(String t, String a, int p){
            this.title = t;
            this.author = a;
            this.price = p;

            System.out.println("This is the 2nd constructor");
        }
    }
    public static void main(String[] args){
        Book b1 = new Book();
        Book b2 = new Book("aaaaaaaaaaaaa","bbb");
        Book b3 = new Book("ppppppppppppppp","hkjhk",999);

        System.out.println(b1.title);
        System.out.println(b1.author);
        System.out.println(b1.price);

        System.out.println(b3.title);
        System.out.println(b3.author);
        System.out.println(b3.price);

    }
}