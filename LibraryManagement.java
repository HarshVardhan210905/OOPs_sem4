class Book {
    private String title;
    private String author;
    private double price;
    
    public Book(String title,String author,double price){
        this.title=title;
        this.author=author;
        this.price=price;
    }
    public Book(){
        this("Newspaper");
    }
//    private String title;
//    private String author;
//    private double price;
//
//  void setDetails(String title, String author, double price) {
//    this.title = title;
    //  this.author = author;
    //this.price = price;
//}
//
//  void display() {
//        System.out.println("Title: " + title + ", Author: " + author + ", Price: " + price);
//    }
}



public class LibraryManagement {
    public static void main(String[] args) {
        Book b1 = new Book();
        b1.setDetails("The Alchemist", "Paulo", 15.99);
        b1.display();
        Book b2=new Book();
        b2.setDetails("1984", "George", 12.99);
        b2.display();
    }
}
