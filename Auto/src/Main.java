import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Main {
    private static List<VehicleDealer> vehicleDealers = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        Dealer dealer1 = new Dealer(1, "Dealer Company 1", "John", "Doe");
        Dealer dealer2 = new Dealer(2, "Dealer Company 2", "Jane", "Smith");

        Vehicle car1 = new Car(101, "Model 1", "Make 1", 200, 25000, 4, "Petrol");
        Vehicle car2 = new Car(102, "Model 2", "Make 2", 180, 20000, 4, "Diesel");
        Vehicle motorcycle1 = new Motorcycle(201, "Model 3", "Make 3", 150, 15000, 2, "Petrol");

        VehicleDealer vehicleDealer1 = new VehicleDealer(dealer1);
        vehicleDealer1.addVehicle(car1);
        vehicleDealer1.addVehicle(motorcycle1);

        VehicleDealer vehicleDealer2 = new VehicleDealer(dealer2);
        vehicleDealer2.addVehicle(car2);

        vehicleDealers.add(vehicleDealer1);
        vehicleDealers.add(vehicleDealer2);

        boolean exit = false;
        while (!exit) {
            displayMenu();
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            switch (choice) {
                case 1:
                    addVehicleToDealer();
                    break;
                case 2:
                    displayAllVehicles();
                    break;
                case 3:
                    displayVehiclesByDealerId();
                    break;
                case 4:
                    removeVehicle();
                    break;
                case 5:
                    exit = true;
                    System.out.println("Exiting the program...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        }
    }

    public static void displayMenu() {
        System.out.println("Menu:");
        System.out.println("1. Add vehicle to dealer");
        System.out.println("2. Display all vehicles");
        System.out.println("3. Display vehicles by dealer ID");
        System.out.println("4. Remove vehicle");
        System.out.println("5. Exit");
        System.out.print("Enter your choice: ");
    }

    public static void addVehicleToDealer() {
        System.out.println("Enter dealer details:");
        System.out.print("Dealer ID: ");
        int dealerId = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character
        System.out.print("Company Name: ");
        String dealerCompanyName = scanner.nextLine();
        System.out.print("First Name: ");
        String dealerFirstName = scanner.nextLine();
        System.out.print("Last Name: ");
        String dealerLastName = scanner.nextLine();

        Dealer dealer = new Dealer(dealerId, dealerCompanyName, dealerFirstName, dealerLastName);
        VehicleDealer vehicleDealer = new VehicleDealer(dealer);

        System.out.println("Enter vehicle details:");
        System.out.print("VIN: ");
        int VIN = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character
        System.out.print("Model: ");
        String vehicleModel = scanner.nextLine();
        System.out.print("Make: ");
        String vehicleMake = scanner.nextLine();
        System.out.print("Horsepower: ");
        int vehicleHorsePower = scanner.nextInt();
        System.out.print("Price: ");
        double vehiclePrice = scanner.nextDouble();

        System.out.print("Vehicle Type (1 - Car, 2 - Motorcycle): ");
        int vehicleType = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        Vehicle vehicle;
        if (vehicleType == 1) {
            System.out.print("Tire Count: ");
            int carTireCount = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character
            System.out.print("Fuel: ");
            String carFuel = scanner.nextLine();
            vehicle = new Car(VIN, vehicleModel, vehicleMake, vehicleHorsePower, vehiclePrice, carTireCount, carFuel);
        } else if (vehicleType == 2) {
            System.out.print("Tire Count: ");
            int motorcycleTireCount = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character
            System.out.print("Fuel: ");
            String motorcycleFuel = scanner.nextLine();
            vehicle = new Motorcycle(VIN, vehicleModel, vehicleMake, vehicleHorsePower, vehiclePrice, motorcycleTireCount, motorcycleFuel);
        } else {
            System.out.println("Invalid vehicle type.");
            return;
        }

        vehicleDealer.addVehicle(vehicle);
        vehicleDealers.add(vehicleDealer);
        System.out.println("Vehicle added successfully.\n");
    }

    public static void displayAllVehicles() {
        System.out.println("All Vehicles:");
        for (VehicleDealer vehicleDealer : vehicleDealers) {
            vehicleDealer.displayAllVehicles();
        }
    }

    public static void displayVehiclesByDealerId() {
        System.out.print("Enter dealer ID: ");
        int dealerId = scanner.nextInt();
        System.out.println("Vehicles for Dealer ID: " + dealerId);
        for (VehicleDealer vehicleDealer : vehicleDealers) {
            vehicleDealer.displayVehiclesByDealerId(dealerId);
        }
    }

    public static void removeVehicle() {
        System.out.print("Enter VIN of the vehicle to remove: ");
        int VIN = scanner.nextInt();
        for (VehicleDealer vehicleDealer : vehicleDealers) {
            vehicleDealer.removeVehicle(VIN);
        }
        System.out.println("Vehicle removed successfully.\n");
    }
}