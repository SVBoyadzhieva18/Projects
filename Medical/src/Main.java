import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Pharmacy pharmacy = new Pharmacy();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("1. Add Medicine");
            System.out.println("2. Display All Medicines");
            System.out.println("3. Display Medicines by Manufacturer and Price");
            System.out.println("4. Display Medicines by Importer");
            System.out.println("5. Display All Providers");
            System.out.println("6. Display All Manufacturers");
            System.out.println("7. Display All Importers");
            System.out.println("8. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter Medicine name: ");
                    String name = sc.next();
                    System.out.print("Enter Medicine price: ");
                    double price = sc.nextDouble();
                    System.out.print("Enter Medicine shelf life: ");
                    int shelfLife = sc.nextInt();
                    System.out.print("Enter Provider name: ");
                    String providerName = sc.next();
                    System.out.print("Enter Provider address: ");
                    String providerAddress = sc.next();
                    System.out.print("Enter Provider phone: ");
                    String providerPhone = sc.next();
                    Provider provider = new Provider(providerName, providerAddress, providerPhone);
                    System.out.print("Enter Manufacturer name: ");
                    String manufacturerName = sc.next();
                    System.out.print("Enter Manufacturer address: ");
                    String manufacturerAddress = sc.next();
                    System.out.print("Enter Manufacturer phone: ");
                    String manufacturerPhone = sc.next();
                    Manufacturer manufacturer = new Manufacturer(manufacturerName, manufacturerAddress, manufacturerPhone);
                    System.out.print("Enter Importer name: ");
                    String importerName = sc.next();
                    System.out.print("Enter Importer address: ");
                    String importerAddress = sc.next();
                    System.out.print("Enter Importer phone: ");
                    String importerPhone = sc.next();
                    Importer importer = new Importer(importerName, importerAddress, importerPhone);
                    Medicine medicine = new Medicine(name, price, shelfLife, provider, manufacturer, importer);
                    pharmacy.addMedicine(medicine);
                    break;
                case 2:
                    pharmacy.displayAllMedicines();
                    break;
                case 3:
                    System.out.print("Enter Manufacturer name: ");
                    String manufacturerFilterName = sc.next();
                    System.out.print("Enter max Price: ");
                    double maxPrice = sc.nextDouble();
                    pharmacy.displayMedicinesByManufacturer(manufacturerFilterName, maxPrice);
                    break;
                case 4:
                    System.out.print("Enter Importer name: ");
                    String importerFilterName = sc.next();
                    ArrayList<Medicine> filteredMedicines = pharmacy.getMedicinesByImporter(importerFilterName);
                    for(Medicine filteredMedicine : filteredMedicines){
                        filteredMedicine.displayInfo();
                    }
                    break;
                case 5:
                    ArrayList<Provider> providerList = pharmacy.getAllProviders();
                    for(Provider currentProvider : providerList){
                        currentProvider.displayInfo();
                    }
                    break;
                case 6:
                    ArrayList<Manufacturer> manufacturerList = pharmacy.getAllManufacturers();
                    for(Manufacturer currentManufacturer : manufacturerList){
                        currentManufacturer.displayInfo();
                    }
                    break;
                case 7:
                    ArrayList<Importer> importerList = pharmacy.getAllImporters();
                    for(Importer currentImporter : importerList){
                        currentImporter.displayInfo();
                    }
                    break;
                case 8:
                    System.out.println("Exiting...");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}