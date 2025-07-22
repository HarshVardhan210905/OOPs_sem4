public class lab8_q1 {
    public static class Book {
        private String title;
        private String author;
        private String ISBN;
        public Book(String title, String author, String ISBN) {
            this.title = title;
            this.author = author;
            this.ISBN = ISBN;
        }
        public void displayDetails() {
            System.out.println("Book Details:");
            System.out.println("Title : " + title);
            System.out.println("Author: " + author);
            System.out.println("ISBN  : " + ISBN);
        }
    }
    public static void main(String[] args) {
        Library.Book myBook = new Library.Book("Around The World In 80 Days", "Jules Verne", "123456789");
        myBook.displayDetails();
    }
}

