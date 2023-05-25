import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Pharmacy {
    private List<Medicine> medicines;

    public Pharmacy() {
        medicines = new ArrayList<>();
    }

    public void addMedicine(Medicine medicine) {
        medicines.add(medicine);
    }

    public void displayAllMedicines() {
        for (Medicine medicine : medicines) {
            medicine.displayInfo();
        }
    }

    public void displayMedicinesWithPriceBelow(double price) {
        for (Medicine medicine : medicines) {
            if (medicine.getPrice() < price) {
                medicine.displayInfo();
            }
        }
    }

    public List<Medicine> getMedicinesByImporter(Importer importer) {
        List<Medicine> importerMedicines = new ArrayList<>();
        for (Medicine medicine : medicines) {
            if (medicine.getImporter().equals(importer)) {
                importerMedicines.add(medicine);
            }
        }
        return importerMedicines;
    }

    public List<Importer> getAllImporters() {
        List<Importer> importers = new ArrayList<>();
        for (Medicine medicine : medicines) {
            Importer importer = medicine.getImporter();
            if (!importers.contains(importer)) {
                importers.add(importer);
            }
        }
        return importers;
    }
    public void displayMenu() {
        Scanner scanner = new Scanner(System.in);
        int choice = -1;

        while (choice != 0) {
            System.out.println("Pharmacy Menu:");
            System.out.println("1. Add a new medicine");
            System.out.println("2. Display all medicines");
            System.out.println("3. Display medicines with price below a certain value");
            System.out.println("4. Display medicines imported by a specific importer");
            System.out.println("5. Display all importers");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    addMedicineFromUserInput();
                    break;
                case 2:
                    displayAllMedicines();
                    break;
                case 3:
                    displayMedicinesWithPriceBelowFromUserInput();
                    break;
                case 4:
                    displayMedicinesByImporterFromUserInput();
                    break;
                case 5:
                    displayAllImporters();
                    break;
                case 0:
                    System.out.println("Exiting the program...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }

            System.out.println();
        }
    }

    public void addMedicineFromUserInput() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter medicine name: ");
        String name = scanner.nextLine();
        System.out.print("Enter medicine price: ");
        double price = scanner.nextDouble();
        System.out.print("Enter medicine expiration date: ");
        String expirationDate = scanner.next();

        Medicine medicine = new Medicine(name, price, expirationDate);
        addMedicine(medicine);

        System.out.println("Medicine added successfully.");
    }

    public void displayMedicinesWithPriceBelowFromUserInput() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter maximum price: ");
        double maxPrice = scanner.nextDouble();

        System.out.println("Medicines with price below " + maxPrice + ":");
        displayMedicinesWithPriceBelow(maxPrice);
    }
    public void displayMedicinesByImporter(Importer importer) {
        List<Medicine> importerMedicines = new ArrayList<>();
        for (Medicine medicine : medicines) {
            if (medicine.getProvider() instanceof Importer) {
                Importer medicineImporter = (Importer) medicine.getProvider();
                if (medicineImporter.getName().equals(importer.getName())) {
                    importerMedicines.add(medicine);
                }
            }
        }

        if (!importerMedicines.isEmpty()) {
            System.out.println("Medicines by Importer: " + importer.getName());
            for (Medicine medicine : importerMedicines) {
                medicine.displayInfo();
                System.out.println();
            }
        } else {
            System.out.println("No medicines found for the specified importer.");
        }
    }

    public void displayMedicinesByImporterFromUserInput() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter importer name: ");
        String importerName = scanner.nextLine();

        Importer importer = findImporterByName(importerName);

        if (importer != null) {
            System.out.println("Medicines imported by " + importerName + ":");
            displayMedicinesByImporter(importer);
        } else {
            System.out.println("Importer not found.");
        }
    }

    public void displayAllImporters() {
        List<Importer> importers = getAllImporters();

        System.out.println("All importers:");
        for (Importer importer : importers) {
            importer.displayInfo();
            System.out.println();
        }
    }

    public Importer findImporterByName(String name) {
        List<Importer> importers = getAllImporters();

        for (Importer importer : importers) {
            if (importer.getName().equals(name)) {
                return importer;
            }
        }

        return null;
    }
}