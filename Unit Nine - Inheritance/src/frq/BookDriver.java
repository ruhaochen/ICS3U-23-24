package frq;

import java.util.ArrayList;

public class BookDriver {
    public static void main(String[] args) {
        ArrayList<Book> myLibrary = new ArrayList<Book>();

        Book book1 = new Book("Frankenstein", "Mary Shelly");
        Book book2 = new PictureBook("The Wonderful Wizard of Oz", "L. Frank Baum", "W.W Denslow");

        myLibrary.add(book1);
        myLibrary.add(book2); 
    }
}
