import java.util.Scanner;

class Library {
    private String[] books = {
            "To Kill a Mockingbird",
            "1984",
            "The Great Gatsby",
            "The Catcher in the Rye",
            "hummingbird"
    };

    // Method to show available books
    public void showAvailableBooks() {
        if (books.length == 0) {
            System.out.println("No books are currently available.");
        } else {
            System.out.println("Available books:");
            for (String book : books) {
                System.out.println(book);
            }
        }
    }

    // Method to issue books
    public void issueBook() {
        Scanner sc = new Scanner(System.in);
        System.out.print("How many books do you want to issue = ");
        int numBooks = sc.nextInt();
        sc.nextLine();  // Consume newline left-over

        for (int i = 1; i <= numBooks; i++) {
            System.out.print("Enter the name of the " + i + " book you want to take from the library:");
            String book = sc.nextLine();
            books = removeBook(books, book);
        }
    }

    // Method to return books
    public void returnBooks() {
        Scanner sc = new Scanner(System.in);
        System.out.print("How many books do you want to return = ");
        int numBooksReturn = sc.nextInt();
        sc.nextLine();  // Consume newline left-over

        for (int i = 1; i <= numBooksReturn; i++) {
            System.out.print("Enter the name of the " + i + " book you want to return to the library:");
            String bookReturn = sc.nextLine();
            books = addBook(books, bookReturn);
        }
    }

    // Method to add a book to the array
    private String[] addBook(String[] books, String newBook) {
        String[] newBooks = new String[books.length + 1];
        for(int i = 0; i < books.length; i++) {
            newBooks[i] = books[i];
        }
        newBooks[newBooks.length - 1] = newBook;
        return newBooks;
    }

    // Method to remove a book from the array
    private String[] removeBook(String[] books, String bookToRemove) {
        int index = -1;
        for (int i = 0; i < books.length; i++) {
            if (books[i].equals(bookToRemove)) {
                index = i;
                break;
            }
        }
        if (index == -1) {
            System.out.println("Book not found: " + bookToRemove);
            return books;
        }
        String[] newBooks = new String[books.length - 1];
        for (int i = 0, j = 0; i < books.length; i++) {
            if (i != index) {
                newBooks[j++] = books[i];
            }
        }
        return newBooks;
    }

    public static void main(String[] args) {
        Library library = new Library();
        library.showAvailableBooks();
        library.issueBook();
        library.showAvailableBooks();
        library.returnBooks();
        library.showAvailableBooks();
    }
}