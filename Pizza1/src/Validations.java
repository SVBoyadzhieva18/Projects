import java.util.Arrays;

public class Validations {
    public static void validatePizzaName(String name) {
        if (name.length() < 1 || name.trim().length() > 15) {
            System.out.println("Pizza name should be between 1 and 15 symbols.");
        }
    }

    public static void validateNumberOfToppings(int numberOfToppings) {
        if (numberOfToppings < 1 || numberOfToppings > 10) {
            System.out.println("Number of toppings should be in range [0..10].");
        }
    }

    public static void validateFlourType(String type) {
        if (!"White".equalsIgnoreCase(type) && !"Wholegrain".equalsIgnoreCase(type)) {
            System.out.println("Invalid type of dough.");
        }
    }

    public static void validateDoughWeight(double weight) {
        if (weight < 1 || weight > 200) {
            System.out.println("Dough weight should be in the range [1..200].");
        }
    }

    public static void validateBakingTechnique(String bakingTechnique) {
        if (!"Crispy".equalsIgnoreCase(bakingTechnique) && !"Chewy".equalsIgnoreCase(bakingTechnique)
                && !"Homemade".equalsIgnoreCase(bakingTechnique)) {
            System.out.println("Invalid type of dough.");
        }
    }

    public static void validateToppingWeight(String toppingType, double weight) {
        if (weight < 1 || weight > 50) {
            System.out.println(toppingType + " weight should be in the range [1..50].");
        }
    }

    public static void validateToppingType(String toppingType) {
        String[] listOfValidToppings = {"Meat", "Veggies", "Cheese", "Sauce"};
        boolean flag = true;
        for(int i = 0; i < 3; i++) {
            if(listOfValidToppings[i] == toppingType) {
                flag = false;
            }
        }

        if(flag) {
            System.out.println("Cannot place " + toppingType + " on top of your pizza.");
        }
    }
}