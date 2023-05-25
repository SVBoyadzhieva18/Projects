import java.util.ArrayList;
import java.util.List;

class Pastry {
    private int pastryId;
    private String pastryName;
    private String pastryFrosting;
    private double pastryWeight;

    public Pastry(int pastryId, String pastryName, String pastryFrosting, double pastryWeight) {
        this.pastryId = pastryId;
        this.pastryName = pastryName;
        this.pastryFrosting = pastryFrosting;
        this.pastryWeight = pastryWeight;
    }

    public int getPastryId() {
        return pastryId;
    }

    public void setPastryId(int pastryId) {
        this.pastryId = pastryId;
    }

    public String getPastryName() {
        return pastryName;
    }

    public void setPastryName(String pastryName) {
        this.pastryName = pastryName;
    }

    public String getPastryFrosting() {
        return pastryFrosting;
    }

    public void setPastryFrosting(String pastryFrosting) {
        this.pastryFrosting = pastryFrosting;
    }

    public double getPastryWeight() {
        return pastryWeight;
    }

    public void setPastryWeight(double pastryWeight) {
        this.pastryWeight = pastryWeight;
    }

    public void displayPastryInfo() {
        System.out.println("Pastry ID: " + pastryId);
        System.out.println("Pastry Name: " + pastryName);
        System.out.println("Pastry Frosting: " + pastryFrosting);
        System.out.println("Pastry Weight: " + pastryWeight);
    }
}