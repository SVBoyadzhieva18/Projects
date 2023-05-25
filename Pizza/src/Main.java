import java.util.Scanner;

class PizzaApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] pizzaInfo = scanner.nextLine().split("\\s+");
        String pizzaName = pizzaInfo[1];
        int numberOfToppings = Integer.parseInt(pizzaInfo[2]);

        Pizza pizza = new Pizza(pizzaName, numberOfToppings);

        String[] doughInfo = scanner.nextLine().split("\\s+");
        String flourType = doughInfo[1];
        String bakingTechnique = doughInfo[2];
        int doughWeight = Integer.parseInt(doughInfo[3]);

        if (!Validations.isValidFlourType(flourType)) {
            System.out.println("Invalid flour type!");
            return;
        }

        if (!Validations.isValidDoughWeight(doughWeight)) {
            System.out.println("Invalid dough weight!");
            return;
        }

        Dough dough = new Dough(flourType, bakingTechnique, doughWeight);
        pizza.setDough(dough);

        for (int i = 0; i < numberOfToppings; i++) {
            String[] toppingInfo = scanner.nextLine().split("\\s+");
            String toppingType = toppingInfo[1];
            int toppingWeight = Integer.parseInt(toppingInfo[2]);

            if (!Validations.isValidToppingType(toppingType)) {
                System.out.println("Invalid topping type!");
                return;
            }

            Topping topping = new Topping(toppingType, toppingWeight);
            pizza.addTopping(topping);
        }

        pizza.printInfo();
    }
}