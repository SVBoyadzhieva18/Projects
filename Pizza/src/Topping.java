class Topping {
    private String toppingType;
    private int weightInGrams;

    public Topping(String toppingType, int weightInGrams) {
        this.toppingType = toppingType;
        this.weightInGrams = weightInGrams;
    }

    public String getToppingType() {
        return toppingType;
    }

    public void setToppingType(String toppingType) {
        this.toppingType = toppingType;
    }

    public int getWeightInGrams() {
        return weightInGrams;
    }

    public void setWeightInGrams(int weightInGrams) {
        this.weightInGrams = weightInGrams;
    }

    public void printInfo() {
        System.out.println("Topping: ");
        System.out.println(" - Type: " + toppingType);
        System.out.println(" - Weight: " + weightInGrams + " grams");
    }
}