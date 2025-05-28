public class Book {
    
    String title;
    String author;
    double price;

    Book (String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    void displayInfo() {
        System.out.println("Judul: " + title);
        System.out.println("Author: " + author);
        System.out.println("Harga: " + price);
    }

    public static void main(String[] args) {
        Book book = new Book("Clean Code", "Robert C.Martin", 450000.0);
        book.displayInfo();
    }
}
