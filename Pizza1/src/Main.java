import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Pizza: ");
        String pizza = scanner.nextLine();
        String[] arrayPizza = pizza.split(" ");
        Pizza realPizza = new Pizza(arrayPizza[0], Integer.parseInt(arrayPizza[1]));

        System.out.println("Dough(Wholegrain, Crispy, Chewy, Homemade): ");
        String dough = scanner.nextLine();
        String[] arrayDough= dough.split(" ");
        Dough realDough = new Dough(arrayDough[0], arrayDough[1], Double.parseDouble(arrayDough[2]));
        realPizza.setDough(realDough);

        for (int i = 0; i < Integer.parseInt(arrayPizza[1]); i++){
            System.out.println((i+1) + " Topping(Meat, Veggies, Cheese, Sauce): ");
            String topping = scanner.nextLine();
            String[] arrayToppings = topping.split(" ");
            Topping realTopping = new Topping(arrayToppings[0], Double.parseDouble(arrayToppings[1]));
            realPizza.addTopping(realTopping);
        }

        System.out.println(realPizza);
    }
}