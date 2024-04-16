package frq;

public class BookListing {
    private Book book;
    private double price; 
    
    public BookListing(Book b, double p){
        book = b;
        price = p; 
    }

    public void printDescription(){
        book.printBookInfo();
        System.out.print(", $" + price);
    }
    
}
