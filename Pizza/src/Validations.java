class Validations {
    public static boolean isValidFlourType(String flourType) {
        return flourType.equals("white") || flourType.equals("wholegrain");
    }

    public static boolean isValidDoughWeight(int weightInGrams) {
        return weightInGrams >= 1 && weightInGrams <= 200;
    }

    public static boolean isValidToppingType(String toppingType) {
        String[] validToppings = {"meat", "vegetables", "cheese", "sauce"};
        for (String validTopping : validToppings) {
            if (validTopping.equals(toppingType)) {
                return true;
            }
        }
        return false;
    }

    public static boolean isValidPizzaName(String pizzaName) {
        return !pizzaName.isEmpty() && pizzaName.length() <= 15;
    }

    public static boolean isValidNumberOfToppings(int numberOfToppings) {
        return numberOfToppings >= 1 && numberOfToppings <= 15;
    }
}
