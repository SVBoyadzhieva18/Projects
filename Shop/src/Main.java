import java.util.Scanner;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Supermarket supermarket = new Supermarket();
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("Please select an option:");
            System.out.println("1. Add a new product");
            System.out.println("2. Display all products");
            System.out.println("3. Remove expired products");
            System.out.println("4. Display products greater than a price");
            System.out.println("5. Display manufacturers of a product");
            System.out.println("6. Get manufacturers by product price");
            System.out.println("7. Update manufacturer phone number");
            System.out.println("8. Exit");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter product number: ");
                    int productNumber = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Enter product name: ");
                    String productName = scanner.nextLine();
                    System.out.println("Enter product price: ");
                    double productPrice = scanner.nextDouble();
                    System.out.println("Enter product quantity: ");
                    int productQuantity = scanner.nextInt();
                    System.out.println("Enter product expiry date: ");
                    String productExpiry = scanner.nextLine();
                    scanner.nextLine();
                    System.out.println("Enter manufacturer number: ");
                    int manufacturerNumber = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Enter manufacturer name: ");
                    String manufacturerName = scanner.nextLine();
                    System.out.println("Enter manufacturer address: ");
                    String manufacturerAddress = scanner.nextLine();
                    System.out.println("Enter manufacturer phone: ");
                    String manufacturerPhone = scanner.nextLine();

                    Manufacturer manufacturer = new Manufacturer(manufacturerNumber, manufacturerName, manufacturerAddress, manufacturerPhone);
                    Product product = new Product(productNumber, productName, productPrice, productQuantity, productExpiry, manufacturer);
                    supermarket.addProduct(product);
                    System.out.println("Product added successfully!");
                    break;
                case 2:
                    supermarket.displayAllDeliveredProducts();
                    break;
                case 3:
                    supermarket.removeExpiredProducts();
                    System.out.println("Expired products removed successfully!");
                    break;
                case 4:
                    System.out.println("Enter a price: ");
                    double price = scanner.nextDouble();
                    supermarket.displayProductsGreaterThanPrice(price);
                    break;
                case 5:
                    System.out.println("Enter product number: ");
                    int pn = scanner.nextInt();
                    supermarket.displayManufacturerByProductNumber(pn);
                    break;
                case 6:
                    System.out.println("Enter a price: ");
                    double userPrice = scanner.nextDouble();
                    List<Manufacturer> manufacturers = supermarket.getManufacturersByPrice(userPrice);
                    for (Manufacturer m : manufacturers) {
                        System.out.println("Manufacturer number: " + m.getManufacturerNumber());
                        System.out.println("Manufacturer name: " + m.getName());
                        System.out.println("Manufacturer address: " + m.getAddress());
                        System.out.println("Manufacturer phone: " + m.getPhone());
                    }
                    break;
                case 7:
                    System.out.println("Enter manufacturer number: ");
                    int manufNumber = scanner.nextInt();
                    System.out.println("Enter new phone number: ");
                    String newPhone = scanner.nextLine();
                    scanner.nextLine();
                    supermarket.updateManufacturerPhone(manufNumber, newPhone);
                    System.out.println("Phone number updated successfully!");
                    break;
                case 8:
                    System.out.println("Exiting program...");
                    return;
                default:
                    System.out.println("Invalid option. Please try again.");
                    break;
            }
        }while (true);
    }
}