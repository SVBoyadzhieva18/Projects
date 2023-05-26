import java.util.ArrayList;
import java.util.List;

class VehicleDealer {
    private List<Vehicle> vehicles;
    private Dealer dealer;

    public VehicleDealer(Dealer dealer) {
        this.dealer = dealer;
        this.vehicles = new ArrayList<>();
    }

    public List<Vehicle> getVehicles() {
        return vehicles;
    }

    public Dealer getDealer() {
        return dealer;
    }

    public void addVehicle(Vehicle vehicle) {
        vehicles.add(vehicle);
    }

    public void removeVehicle(int VIN) {
        vehicles.removeIf(vehicle -> vehicle.getVIN() == VIN);
    }

    public void displayAllVehicles() {
        System.out.println("Dealer: " + dealer.getDealerCompanyName());
        System.out.println("All Vehicles:");
        for (Vehicle vehicle : vehicles) {
            vehicle.displayInfo();
        }
    }

    public void displayVehiclesByDealerId(int dealerId) {
        if (dealer.getDealerId() == dealerId) {
            System.out.println("Dealer: " + dealer.getDealerCompanyName());
            System.out.println("Vehicles:");
            for (Vehicle vehicle : vehicles) {
                vehicle.displayInfo();
            }
        }
    }
}
