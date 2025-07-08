import java.util.*;

public class Bookstore {
    private Map<String, Book> inventory = new HashMap<>();

    public void addBook(Book book) {
        inventory.put(book.getISBN(), book);
    }

    public List<Book> removeOutdatedBook(int oldyear) {
        List<Book> oldBooks = new ArrayList<>();

        Iterator<Map.Entry<String, Book>> it = inventory.entrySet().iterator();

        while (it.hasNext()) {

            Map.Entry<String, Book> entry = it.next();

            Book book = entry.getValue();

            if (book.getYear() < oldyear) {

                oldBooks.add(book);

                it.remove();
            }
        }
        return oldBooks;
    }

    public double buyBook(String ISBN, int quantity, String email, String address) {
        Book book = inventory.get(ISBN);

        if (book == null) {
            throw new IllegalArgumentException(" Sorry,book is not found");
        }

        if (!book.isForsale()) {
            throw new IllegalArgumentException(" Sorry,This book is not for sale");
        }

         if (book instanceof Paperbook paperbook) {
            if (!paperbook.reducedStock(quantity)) {
                throw new IllegalArgumentException("Not enough in stock");
            }
        paperbook.deliver(email, address);
    }   
        else if (book instanceof Ebook) {
            book.deliver(email, address);
} 
        else {
            throw new IllegalArgumentException("Unsupported book type for purchase");
}
        double total = book.getPrice() * quantity;
        System.out.println(" total payment= " + total + " EGP");
        return total;
    }
}
