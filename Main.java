import java.util.List;

public class Main{
    public static void main(String[] args) throws Exception {
     
        Bookstore store = new Bookstore();

      
        store.addBook(new Paperbook("001", "The Blue Elephant", 200.0, 2014, 5));
        store.addBook(new Ebook("002", "Hepta", 150.0, 2015, "hepta.pdf"));
        store.addBook(new DemoBook("003", "Children of Gebelawi", 60.0, 1959));

        System.out.println("\n=== Buying a Paper Book ===");
        try {
            store.buyBook("001", 2, "nada@example.com", "Zayed, Egypt");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        System.out.println("\n=== Buying an Ebook ===");
        try {
            store.buyBook("002", 1, "jana@example.com", "Zayed, Egypt");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        System.out.println("\n=== Trying to Buy a Demo Book ===");
        try {
            store.buyBook("003", 1, "mariem@example.com", "Zayed, Egypt");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        System.out.println("\n=== Removing Books Published Before 2016 ===");
        List<Book> removedBooks = store.removeOutdatedBook(2016);
        for (Book b : removedBooks) {
            System.out.println("Removed: " + b.getTitle());
        }
    }
}

    
