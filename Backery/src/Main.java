import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Bakery bakery = new Bakery();
        Scanner scanner = new Scanner(System.in);

        int choice = 0;
        while (choice != 6) {
            displayMenu();
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            switch (choice) {
                case 1:
                    addPastryToBaker(bakery, scanner);
                    break;
                case 2:
                    displayAllPastries(bakery);
                    break;
                case 3:
                    displayPastriesByBakerId(bakery, scanner);
                    break;
                case 4:
                    removePastryFromBaker(bakery, scanner);
                    break;
                case 5:
                    displayAllPastries(bakery);
                    break;
                case 6:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private static void displayMenu() {
        System.out.println("Menu:");
        System.out.println("1. Add Pastry to Baker");
        System.out.println("2. Display All Pastries");
        System.out.println("3. Display Pastries by Baker ID");
        System.out.println("4. Remove Pastry from Baker");
        System.out.println("5. Display All Pastries");
        System.out.println("6. Exit");
    }

    private static void addPastryToBaker(Bakery bakery, Scanner scanner) {
        System.out.print("Enter Pastry ID: ");
        int pastryId = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        System.out.print("Enter Pastry Name: ");
        String pastryName = scanner.nextLine();

        System.out.print("Enter Pastry Frosting: ");
        String pastryFrosting = scanner.nextLine();

        System.out.print("Enter Pastry Weight: ");
        double pastryWeight = scanner.nextDouble();
        scanner.nextLine(); // Consume the newline character

        System.out.print("Enter Baker ID: ");
        int bakerId = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        System.out.print("Enter Baker Company Name: ");
        String bakerCompanyName = scanner.nextLine();

        System.out.print("Enter Baker Country: ");
        String bakerCountry = scanner.nextLine();

        System.out.print("Enter Baker Work Time: ");
        String bakerWorkTime = scanner.nextLine();

        Pastry pastry = new Pastry(pastryId, pastryName, pastryFrosting, pastryWeight);
        Baker baker = new Baker(bakerId, bakerCompanyName, bakerCountry, bakerWorkTime);

        bakery.addPastryToBaker(pastry, baker);
        System.out.println("Pastry added to Baker successfully.");
    }

    private static void displayAllPastries(Bakery bakery) {
        System.out.println("All Pastries:");
        List<PastryBaker> allPastries = bakery.getAllPastries();
        for (PastryBaker pastryBaker : allPastries) {
            pastryBaker.displayPastryBakerInfo();
        }
    }

    private static void displayPastriesByBakerId(Bakery bakery, Scanner scanner) {
        System.out.print("Enter Baker ID: ");
        int bakerId = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        System.out.println("Pastries by Baker ID " + bakerId + ":");
        List<PastryBaker> pastriesByBakerId = bakery.getPastriesByBakerId(bakerId);
        for (PastryBaker pastryBaker : pastriesByBakerId) {
            pastryBaker.displayPastryBakerInfo();
        }
    }

    private static void removePastryFromBaker(Bakery bakery, Scanner scanner) {
        System.out.print("Enter Pastry ID: ");
        int pastryId = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        System.out.print("Enter Baker ID: ");
        int bakerId = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        bakery.removePastryFromBaker(pastryId, bakerId);
        System.out.println("Pastry removed from Baker successfully.");
    }
}