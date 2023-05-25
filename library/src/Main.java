import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        LendingRegistry lendingRegistry = new LendingRegistry();
        Scanner sc = new Scanner(System.in);
        int choice;
        do {
            System.out.println("1. Add a book to lending registry");
            System.out.println("2. Display all data in lending registry");
            System.out.println("3. Return a book");
            System.out.println("4. Display list of readers who haven't returned books on time");
            System.out.println("5. Display list of books not returned on time");
            System.out.println("6. Display list of book titles by a specific author");
            System.out.println("7. Display list of readers who have to return books on a specific date");
            System.out.println("8. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            switch (choice) {
                case 1 -> lendingRegistry.addBookToLendingRegistry();
                case 2 -> lendingRegistry.displayAllDataInLendingRegistry();
                case 3 -> lendingRegistry.returnBook();
                case 4 -> lendingRegistry.displayListOfReadersWhoHaventReturnedBooksOnTime();
                case 5 -> lendingRegistry.displayListOfBooksNotReturnedOnTime();
                case 6 -> {
                    System.out.print("Enter author name: ");
                    String author = sc.next();
                    lendingRegistry.displayListOfBookTitlesByAuthor(author);
                }
                case 7 -> {
                    System.out.print("Enter date (yyyy-MM-dd): ");
                    String date = sc.next();
                    lendingRegistry.displayListOfReadersWhoHaveToReturnBooksOnSpecificDate(date);
                }
                case 8 -> System.out.println("Exiting...");
                default -> System.out.println("Invalid choice. Please enter a valid choice.");
            }
        } while (choice != 8);
    }
}