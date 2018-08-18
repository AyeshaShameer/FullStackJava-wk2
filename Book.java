package wk2;

public class Book {

    public String bookTitle;
    public String authorName;
    public double bookPrice;
    Book(){}

    public Book (String title, String author, double price){
        bookTitle = title ;
        authorName = author;
        bookPrice = price;
    }

    public void setTitle(String title){
        this.bookTitle = title;
    }
    public void setAuthor(String author){
        this.authorName = author;
    }
    public void setPrice(double price){
        this.bookPrice = price;
    }
    public String getTitle(){
        return this.bookTitle;
    }
    public String getAuthor(){
        return this.authorName;
    }
    public void StringtoString(){
        System.out.println("Title of the book is " +bookTitle);
        System.out.println("Name of the book author is " +authorName);
        System.out.println("Price of the book is " +bookPrice);
    }
    public static void main(String[] args) {
        Book B1 = new Book("A Christmas Tale","Geromino Stilton", 45.78);
        Book B2 = new Book();
        B2.setTitle("Hollywood Hoax");
        B2.setAuthor("Thea Stilton");
        B2.setPrice(34.24);
        B2.getTitle();
        B2.getAuthor();

        B1.StringtoString();
        B2.StringtoString();
    }

}
