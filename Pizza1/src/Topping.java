public class Topping {
    private String toppingType;
    private double weight;

    public Topping(String toppingType, double weight) {
        this.setToppingType(toppingType);
        this.setWeight(weight);
    }

    private void setToppingType(String toppingType) {
        Validations.validateToppingType(toppingType);
        this.toppingType = toppingType;
    }

    private void setWeight(double weight) {
        Validations.validateToppingWeight(this.toppingType, weight);
        this.weight = weight;
    }

    public double calculateCalories() {
        double calories = this.weight * 2;

        switch (this.toppingType) {
            case "Meat" -> calories *= 1.2;
            case "Veggies" -> calories *= 0.8;
            case "Cheese" -> calories *= 1.1;
            case "Sauce" -> calories *= 0.9;
        }

        return calories;
    }
}