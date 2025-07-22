public class Library {
    public static class Book {
        String title;
        String author;
        String ISBN;
        public Book(String title, String author, String ISBN) {
            this.title = title;
            this.author = author;
            this.ISBN = ISBN;
        }
        public void displayDetails() {
            System.out.println("Book Title: " + title);
            System.out.println("Author: " + author);
            System.out.println("ISBN: " + ISBN);
        }
    }
    public static void main(String[] args) {
        Library.Book myBook = new Library.Book("Percy Jackson", "Rick Riordan", "1234567");
        myBook.displayDetails();
    }
}
 x