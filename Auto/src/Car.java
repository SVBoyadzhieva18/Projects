class Car extends Vehicle {
    private int carTireCount;
    private String carFuel;

    public Car(int VIN, String vehicleModel, String vehicleMake, int vehicleHorsePower, double vehiclePrice,
               int carTireCount, String carFuel) {
        super(VIN, vehicleModel, vehicleMake, vehicleHorsePower, vehiclePrice);
        this.carTireCount = carTireCount;
        this.carFuel = carFuel;
    }

    public int getCarTireCount() {
        return carTireCount;
    }

    public void setCarTireCount(int carTireCount) {
        this.carTireCount = carTireCount;
    }

    public String getCarFuel() {
        return carFuel;
    }

    public void setCarFuel(String carFuel) {
        this.carFuel = carFuel;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Car Information:");
        System.out.println("Tire Count: " + carTireCount);
        System.out.println("Fuel: " + carFuel);
        System.out.println();
    }
}