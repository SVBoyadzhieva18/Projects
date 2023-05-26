
class Motorcycle extends Vehicle {
    private int motorcycleTireCount;
    private String motorcycleFuel;

    public Motorcycle(int VIN, String vehicleModel, String vehicleMake, int vehicleHorsePower, double vehiclePrice,
                      int motorcycleTireCount, String motorcycleFuel) {
        super(VIN, vehicleModel, vehicleMake, vehicleHorsePower, vehiclePrice);
        this.motorcycleTireCount = motorcycleTireCount;
        this.motorcycleFuel = motorcycleFuel;
    }

    public int getMotorcycleTireCount() {
        return motorcycleTireCount;
    }

    public void setMotorcycleTireCount(int motorcycleTireCount) {
        this.motorcycleTireCount = motorcycleTireCount;
    }

    public String getMotorcycleFuel() {
        return motorcycleFuel;
    }

    public void setMotorcycleFuel(String motorcycleFuel) {
        this.motorcycleFuel = motorcycleFuel;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Motorcycle Information:");
        System.out.println("Tire Count: " + motorcycleTireCount);
        System.out.println("Fuel: " + motorcycleFuel);
        System.out.println();
    }
}