This Java-based **Bookstore Management System** simulates an online bookstore that supports various types of books (eBooks, Paperbooks, and Demo copies), allowing:

- Buying books based on availability.
- Delivering eBooks via email and paper books via shipping.
- Managing inventory.
- Removing outdated books.

The system emphasizes Object-Oriented Programming principles like inheritance, abstraction, encapsulation, and polymorphism.
 **Abstraction**  `Book` is an abstract class with abstract methods `isForsale()` and `deliver()` 
 **Inheritance**  `Ebook`, `Paperbook`, and `DemoBook` extend the `Book` class                   
 **Polymorphism** `buyBook()` method handles different behaviors depending on book type          
 **Encapsulation**  Book properties are private and accessed via getters
 
**Project Structure**
├── Main.java # Entry point to run the system
├── Book.java # Abstract class representing a generic book
├── Paperbook.java # Concrete class representing a physical book
├── Ebook.java # Concrete class representing a digital book
├── DemoBook.java # Book not for sale, for demo purposes
├── Bookstore.java # Handles book inventory and buying logic
├── ShippingService.java # Simulates shipping paper books
├── MailService.java # Simulates sending eBooks via email

**Features Demonstrated**
*Add Book*

-store.addBook(new Paperbook("001", "The Blue Elephant", 200.0, 2014, 5));

*buy Book*

-Handles both Ebook and Paperbook
-Validates stock for paper books
-Throws meaningful errors for:
-Unavailable books
-Unsupported book types
-Out-of-stock paper books

*Deliver Book*

-eBooks → Delivered to email
-Paperbooks → Shipped to address

*Remove and return Outdated Books*

-store.removeOutdatedBook(2016);

**SAMPLE OUTPUT**
=== Buying a Paper Book ===
The Blue Elephant will be shipped to Zayed, Egypt
 total payment= 400.0 EGP

=== Buying an Ebook ===
Hepta will be sent to email jana@example.com     
 total payment= 150.0 EGP

=== Trying to Buy a Demo Book ===
 Sorry,This book is not for sale

=== Removing Books Published Before 2016 ===     
Removed: The Blue Elephant
Removed: Hepta
Removed: Children of Gebelawi
