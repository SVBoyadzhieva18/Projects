import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static List<Product> inventory = new ArrayList<>();
    public static List<Manufacturer> manufacturers=new ArrayList<>();

    public static void mainMenu(){
        System.out.println("--------------MENU--------------");
        System.out.println("|     1. Add new product       |");
        System.out.println("|    2. Print all products     |");
        System.out.println("|   3. Add new manufacturer    |");
        System.out.println("|  4. Print all manufacturer   |");
        System.out.println("|           9. Exit            |");
        System.out.println("--------------------------------");
        System.out.print("Enter your choice: ");
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        manufacturers.add(new Manufacturer(1, "Fetko", "Devin Street 21", "+359 345 351 345"));
        manufacturers.add(new Manufacturer(2, "Chio", "Sofia Czar Boris III 45", "+359 345 351 345"));
        manufacturers.add(new Manufacturer(3, "PepsiCo", "Washington Street John W. 23", "+1 484 345 234"));

        inventory.add(new Product(1, "chips", 19.09, 100, LocalDate.of(1999, 12, 31), manufacturers.get(1)));
        inventory.add(new Product(2, "biskviti", 1.09, 100, LocalDate.of(1999, 12, 31), manufacturers.get(1)));
        inventory.add(new Product(3, "bql hlqb", 20.87, 100, LocalDate.of(1999, 12, 31), manufacturers.get(1)));
        int choice = 0;
        while (choice != 9) {

            Main.mainMenu();
            choice = input.nextInt();

            switch (choice) {
                case 1:
                    Product.addNewProduct();
                    break;
                case 2:
                    for (Product i : inventory) {
                        System.out.println(i.toString());
                    }
                    break;
                case 3:
                    Manufacturer.addNewManufacturer();
                    break;
                case 4:
                    for (Manufacturer i : manufacturers) {
                        System.out.println(i.toString());
                    }
                    break;
                default:
                    break;
            }
        }
    }
}