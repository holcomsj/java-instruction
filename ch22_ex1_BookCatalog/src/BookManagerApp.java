import java.util.List;

public class BookManagerApp {

    public static void main(String[] args) {
        BookManager manager = new BookManager();
        
        List<Book> bookByTitle = manager.getBook(b -> b.getTitle()
        		.contains("Java Programming"));
        printList(bookByTitle);
        
        List<Book> bookByCategory = manager.getBook(b -> b.getCategory()
        		.equals(Book.JAVA));
        printList(bookByCategory);
        
        List<Book> bookByFormat = manager.getBook(b -> b.getFormat()
        		.equals(Book.PAPERBACK));
        printList(bookByFormat);
        
//        List<Book> booksByTitle = manager.getBooksByTitle("Java Programming");
//        System.out.println("\nBOOKS BY TITLE:");
//        printList(booksByTitle);
//        
//        List<Book> booksByCategory = manager.getBooksByCategory(Book.JAVA);
//        System.out.println("\nBOOKS BY CATEGORY:");
//        printList(booksByCategory);
//        
//        List<Book> booksByFormat = manager.getBooksByFormat(Book.PAPERBACK);
//        System.out.println("\nBOOKS BY FORMAT:");
//        printList(booksByFormat);
        
    }
    
    public static void printList(List<Book> bookList) {
        for (Book b : bookList) {
            System.out.println(b);
        }
    }
}