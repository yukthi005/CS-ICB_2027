import java.util.ArrayList;
import java.util.Scanner;

// Book class to represent a book in the library
class Book {
    private String title;
    private String author;
    private boolean isAvailable;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.isAvailable = true;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void borrowBook() {
        if (isAvailable) {
            isAvailable = false;
            System.out.println("You have borrowed the book: " + title);
        } else {
            System.out.println("Sorry, the book is not available.");
        }
    }

    public void returnBook() {
        if (!isAvailable) {
            isAvailable = true;
            System.out.println("You have returned the book: " + title);
        } else {
            System.out.println("This book wasn't borrowed.");
        }
    }

    @Override
    public String toString() {
        return "Title: " + title + ", Author: " + author + ", Available: " + (isAvailable ? "Yes" : "No");
    }
}

// Library class to manage books in the library
class Library {
    private ArrayList<Book> books;

    public Library() {
        books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void displayBooks() {
        if (books.isEmpty()) {
            System.out.println("No books available in the library.");
        } else {
            for (Book book : books) {
                System.out.println(book);
            }
        }
    }

    public void borrowBook(String title) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                book.borrowBook();
                return;
            }
        }
        System.out.println("Book with the title \"" + title + "\" not found.");
    }

    public void returnBook(String title) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                book.returnBook();
                return;
            }
        }
        System.out.println("Book with the title \"" + title + "\" not found.");
    }
}

// Main class to run the Library Management System
public class LibraryManagementSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Library library = new Library();

        // Adding some books to the library
        library.addBook(new Book("Harry Potter and the Sorcerer's Stone", "J.K. Rowling"));
        library.addBook(new Book("The Hobbit", "J.R.R. Tolkien"));
        library.addBook(new Book("To Kill a Mockingbird", "Harper Lee"));

        while (true) {
            System.out.println("\nLibrary Management System");
            System.out.println("1. Display all books");
            System.out.println("2. Borrow a book");
            System.out.println("3. Return a book");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            int option = scanner.nextInt();
            scanner.nextLine();  // To consume the newline character after the number input

            switch (option) {
                case 1:
                    library.displayBooks();
                    break;
                case 2:
                    System.out.print("Enter the title of the book to borrow: ");
                    String borrowTitle = scanner.nextLine();
                    library.borrowBook(borrowTitle);
                    break;
                case 3:
                    System.out.print("Enter the title of the book to return: ");
                    String returnTitle = scanner.nextLine();
                    library.returnBook(returnTitle);
                    break;
                case 4:
                    System.out.println("Thank you for using the Library Management System.");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }
}
