public class q2 {

    static class Book{
        static String libraryName = "l1";

        String title;
        String author;
        final int isbn;

        static void displayLibraryName(){
            System.out.println(libraryName);
        }

        Book(String title, String author, int isbn){
            this.title = title;
            this.author = author;
            this.isbn = isbn;

        }
    }
    public static void main(String[] args) {

        System.out.println(Book.libraryName);
        Book b1 = new Book("abc","Taran",123);

        System.out.println(b1.title);
        System.out.println(b1.author);
        System.out.println(b1.isbn);

        System.out.println(b1 instanceof Book);
    }
}
