package assignment7;

import java.util.*;
import java.util.Map.Entry;

public class Book1Hash {

    int bookId;
    String title;
    String author;
    float price;

    Scanner sc = new Scanner(System.in);

    Book1Hash(int bookId, String title, String author, float price) {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
        this.price = price;
    }

    void displaybook() {
        System.out.println(
            "Book ID: " + bookId +
            ", Title: " + title +
            ", Author: " + author +
            ", Price: " + price
        );
    }

    public void add(HashMap<Integer, Book1Hash> hm, int id, Book1Hash book) {
        hm.put(id, book);
    }

    public void displayAllBooks(HashMap<Integer, Book1Hash> hm) {
        for (Entry<Integer, Book1Hash> b : hm.entrySet()) {
            System.out.print("ID: " + b.getKey() + " ");
            b.getValue().displaybook();
        }
    }

    public void searchBook(HashMap<Integer, Book1Hash> hm) {

        int id = sc.nextInt();

        if (hm.containsKey(id)) {
            Book1Hash book = hm.get(id);
            book.displaybook();
        } else {
            System.out.println("There is no book");
        }
    }

    public void update(HashMap<Integer, Book1Hash> hm) {

        int id = sc.nextInt();

        if (hm.containsKey(id)) {

            Book1Hash book = hm.get(id);

            System.out.print("Enter new title: ");
            book.title = sc.next();

            System.out.print("Enter new author: ");
            book.author = sc.next();

            System.out.print("Enter new price: ");
            book.price = sc.nextFloat();

            System.out.println("Book updated successfully.");

        } else {
            System.out.println("There is no book");
        }
    }

    public void deleteBook(HashMap<Integer, Book1Hash> hm) {

        int id = sc.nextInt();

        if (hm.containsKey(id)) {
            hm.remove(id);
            System.out.println("Book deleted successfully.");
        } else {
            System.out.println("There is no book");
        }
    }

    public static void main(String[] args) {

        HashMap<Integer, Book1Hash> hm = new HashMap<>();

        Book1Hash bh1 = new Book1Hash(
            101, "Ramayana", "Valmiki", 999
        );

        Book1Hash bh2 = new Book1Hash(
            102, "Mahabharata", "Ganesh", 899
        );

        bh1.add(hm, bh1.bookId, bh1);
        bh2.add(hm, bh2.bookId, bh2);

        System.out.println("All Books:");
        bh1.displayAllBooks(hm);

        System.out.println("\nEnter book ID to search:");
        bh1.searchBook(hm);

        System.out.println("\nEnter book ID to delete:");
        bh1.deleteBook(hm);

        System.out.println("\nBooks after deletion:");
        bh1.displayAllBooks(hm);
    }
}