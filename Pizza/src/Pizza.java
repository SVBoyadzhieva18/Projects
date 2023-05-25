import java.util.ArrayList;
import java.util.List;

class Pizza {
    private String pizzaName;
    private int numberOfToppings;
    private Dough dough;
    private List<Topping> toppings;

    public Pizza(String pizzaName, int numberOfToppings) {
        this.pizzaName = pizzaName;
        this.numberOfToppings = numberOfToppings;
        this.toppings = new ArrayList<>();
    }

    public String getPizzaName() {
        return pizzaName;
    }

    public void setPizzaName(String pizzaName) {
        this.pizzaName = pizzaName;
    }

    public int getNumberOfToppings() {
        return numberOfToppings;
    }

    public void setNumberOfToppings(int numberOfToppings) {
        this.numberOfToppings = numberOfToppings;
    }

    public Dough getDough() {
        return dough;
    }

    public void setDough(Dough dough) {
        this.dough = dough;
    }

    public List<Topping> getToppings() {
        return toppings;
    }

    public void addTopping(Topping topping) {
        this.toppings.add(topping);
    }

    public void printInfo() {
        System.out.println("Pizza: " + pizzaName);
        System.out.println("Number of toppings: " + numberOfToppings);
        dough.printInfo();
        System.out.println("Toppings:");
        for (Topping topping : toppings) {
            topping.printInfo();
        }
    }
}