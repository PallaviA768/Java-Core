import java.util.Scanner;

public class Book {
    private double bookPrice;
    private String description;

    // Getter and setter for bookPrice
    public double getBookPrice() {
        return bookPrice;
    }

    public void setBookPrice(double bookPrice) {
        this.bookPrice = bookPrice;
    }

    // Getter and setter for description
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    // Method to create a book object using system input
    public static Book createBookFromInput() {
        Scanner scanner = new Scanner(System.in);
        Book book = new Book();
        
        System.out.println("Enter book price:");
        double price = scanner.nextDouble();
        book.setBookPrice(price);
        
        scanner.nextLine(); // Consume newline
        System.out.println("Enter book description:");
        String desc = scanner.nextLine();
        book.setDescription(desc);
        
        scanner.close();
        return book;
    }

    // Method to display book details
    public void showBookDetails() {
        System.out.println("Book Description: " + description);
        System.out.println("Book Price: $" + bookPrice);
    }

    public static void main(String[] args) {
        Book book = Book.createBookFromInput();
        book.showBookDetails();
    }
}