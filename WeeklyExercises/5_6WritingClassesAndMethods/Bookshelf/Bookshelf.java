import java.util.Scanner;
public class Bookshelf {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the book title: ");
        String title = scan.nextLine();

        System.out.println("Enter the book author: ");
        String author = scan.nextLine();

        System.out.println("Enter the book publisher: ");
        String publisher = scan.nextLine();

        System.out.println("Enter the book copyright date: ");
        String copyright = scan.nextLine();


        book newbook = new book(title, author, publisher, copyright);

        System.out.println("Title: " + newbook.getTitle());
        System.out.println("Author: " + newbook.getAuthor());
        System.out.println("Publisher: " + newbook.getPublisher());
        System.out.println("Copyright: " + newbook.getCopyright());
    }
}
