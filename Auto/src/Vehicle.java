import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Vehicle {
    private int VIN;
    private String vehicleModel;
    private String vehicleMake;
    private int vehicleHorsePower;
    private double vehiclePrice;

    public Vehicle(int VIN, String vehicleModel, String vehicleMake, int vehicleHorsePower, double vehiclePrice) {
        this.VIN = VIN;
        this.vehicleModel = vehicleModel;
        this.vehicleMake = vehicleMake;
        this.vehicleHorsePower = vehicleHorsePower;
        this.vehiclePrice = vehiclePrice;
    }

    public int getVIN() {
        return VIN;
    }

    public void setVIN(int VIN) {
        this.VIN = VIN;
    }

    public String getVehicleModel() {
        return vehicleModel;
    }

    public void setVehicleModel(String vehicleModel) {
        this.vehicleModel = vehicleModel;
    }

    public String getVehicleMake() {
        return vehicleMake;
    }

    public void setVehicleMake(String vehicleMake) {
        this.vehicleMake = vehicleMake;
    }

    public int getVehicleHorsePower() {
        return vehicleHorsePower;
    }

    public void setVehicleHorsePower(int vehicleHorsePower) {
        this.vehicleHorsePower = vehicleHorsePower;
    }

    public double getVehiclePrice() {
        return vehiclePrice;
    }

    public void setVehiclePrice(double vehiclePrice) {
        this.vehiclePrice = vehiclePrice;
    }

    public void displayInfo() {
        System.out.println("Vehicle Information:");
        System.out.println("VIN: " + VIN);
        System.out.println("Model: " + vehicleModel);
        System.out.println("Make: " + vehicleMake);
        System.out.println("Horsepower: " + vehicleHorsePower);
        System.out.println("Price: " + vehiclePrice);
        System.out.println();
    }
}