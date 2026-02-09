import java.util.*;
import java.util.stream.*;

public class Q3 {
    static class Book {
        String title;
        String author;
        String genre;
        double rating;

        Book(String title, String author, String genre, double rating) {
            this.title = title;
            this.author = author;
            this.genre = genre;
            this.rating = rating;
        }
    }

    static class BookRecommendation {
        String title;
        double rating;

        BookRecommendation(String title, double rating) {
            this.title = title;
            this.rating = rating;
        }
    }

    static class Page<T> {
        List<T> content;
        int pageNumber;
        int pageSize;
        int totalPages;

        Page(List<T> content, int pageNumber, int pageSize, int totalPages) {
            this.content = content;
            this.pageNumber = pageNumber;
            this.pageSize = pageSize;
            this.totalPages = totalPages;
        }
    }

    public static void main(String[] args) {
        List<Book> books = List.of(
            new Book("Dune", "Frank Herbert", "Science Fiction", 4.8),
            new Book("Foundation", "Isaac Asimov", "Science Fiction", 4.5),
            new Book("Neuromancer", "William Gibson", "Science Fiction", 4.2),
            new Book("Hyperion", "Dan Simmons", "Science Fiction", 4.6),
            new Book("Snow Crash", "Neal Stephenson", "Science Fiction", 4.1),
            new Book("The Martian", "Andy Weir", "Science Fiction", 4.7),
            new Book("Ender's Game", "Orson Scott Card", "Science Fiction", 4.4),
            new Book("The Expanse", "James S. A. Corey", "Science Fiction", 4.3),
            new Book("Project Hail Mary", "Andy Weir", "Science Fiction", 4.9),
            new Book("Ready Player One", "Ernest Cline", "Science Fiction", 4.0),
            new Book("1984", "George Orwell", "Dystopian", 4.6)
        );

        List<BookRecommendation> top10 = books.stream()
                .filter(b -> "Science Fiction".equals(b.genre))
                .filter(b -> b.rating > 4.0)
                .map(b -> new BookRecommendation(b.title, b.rating))
                .sorted((a, b) -> Double.compare(b.rating, a.rating))
                .limit(10)
                .toList();

        int pageSize = 5;
        int totalPages = (int) Math.ceil((double) top10.size() / pageSize);

        List<Page<BookRecommendation>> pages = IntStream.range(0, totalPages)
                .mapToObj(i -> new Page<>(
                        top10.stream()
                                .skip((long) i * pageSize)
                                .limit(pageSize)
                                .toList(),
                        i + 1,
                        pageSize,
                        totalPages
                ))
                .toList();

        pages.forEach(p -> {
            System.out.println("Page " + p.pageNumber);
            p.content.forEach(b -> System.out.println(b.title + " " + b.rating));
        });
    }
}
