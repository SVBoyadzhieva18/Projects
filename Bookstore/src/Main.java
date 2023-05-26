import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        LendingRegistry lendingRegistry = new LendingRegistry();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Add book to reader");
            System.out.println("2. Display all data");
            System.out.println("3. Remove returned book");
            System.out.println("4. Display late readers");
            System.out.println("5. Display late books");
            System.out.println("6. Display books by author");
            System.out.println("7. Display readers by date");
            System.out.println("0. Exit");

            int choice = scanner.nextInt();
            scanner.nextLine(); // consume the newline character

            switch (choice) {
                case 1:
                    System.out.println("Enter book details:");
                    System.out.print("Inventory Number: ");
                    int inventoryNumber = scanner.nextInt();
                    scanner.nextLine(); // consume the newline character
                    System.out.print("Author: ");
                    String author = scanner.nextLine();
                    System.out.print("Title: ");
                    String title = scanner.nextLine();
                    System.out.print("Price: ");
                    double price = scanner.nextDouble();
                    scanner.nextLine(); // consume the newline character

                    System.out.println("Enter reader details:");
                    System.out.print("Name: ");
                    String name = scanner.nextLine();
                    System.out.print("Address: ");
                    String address = scanner.nextLine();
                    System.out.print("EGN: ");
                    String egn = scanner.nextLine();

                    System.out.print("Enter return date: ");
                    // Assuming the date input format is "dd/MM/yyyy"
                    String returnDateStr = scanner.nextLine();
                    Date returnDate = parseDate(returnDateStr);
                    Book book = new Book(inventoryNumber, author, title, price);
                    Reader reader = new Reader(name, address, egn);
                    lendingRegistry.addBookToReader(book, reader, returnDate);
                    break;

                case 2:
                    lendingRegistry.displayAllData();
                    break;

                case 3:
                    System.out.print("Enter the index of the returned book: ");
                    int index = scanner.nextInt();
                    lendingRegistry.removeReturnedBook(index);
                    break;

                case 4:
                    lendingRegistry.displayLateReaders();
                    break;

                case 5:
                    lendingRegistry.displayLateBooks();
                    break;

                case 6:
                    System.out.print("Enter the author's name: ");
                    String authorName = scanner.nextLine();
                    lendingRegistry.displayBooksByAuthor(authorName);
                    break;

                case 7:
                    System.out.print("Enter the return date (dd/MM/yyyy): ");
                    String returnDateInput = scanner.nextLine();
                    Date returnDateFilter = parseDate(returnDateInput);
                    lendingRegistry.displayReadersByDate(returnDateFilter);
                    break;

                case 0:
                    System.out.println("Exiting the program...");
                    scanner.close();
                    System.exit(0);

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private static Date parseDate(String dateStr) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        try {
            Date date = dateFormat.parse(dateStr);
            return date;
        } catch (ParseException e) {
            e.printStackTrace();
            return null;
        }
    }
}