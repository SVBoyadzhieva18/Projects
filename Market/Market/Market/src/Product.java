import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

class Product {
    private int id;
    private String name;
    private double price;
    private int quantity;
    private LocalDate expiryDate;
    private Manufacturer manufacturer;
    private static int productId=4;
    public Product(int id, String name, double price, int quantity, LocalDate expiryDate, Manufacturer manufacturer) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.quantity=quantity;
        this.expiryDate = expiryDate;
        this.manufacturer = manufacturer;
    }
    public Product(int id, String milk, double price, int quantity, LocalDate expiryDate) {
    }
    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public double getPrice() {
        return price;
    }
    public int getQuantity() {
        return quantity;
    }
    public LocalDate getExpiryDate() {
        return expiryDate;
    }
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }


    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setExpiryDate(LocalDate expiryDate) {
        this.expiryDate = expiryDate;
    }

    public Manufacturer getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(Manufacturer manufacturer) {
        this.manufacturer = manufacturer;
    }

    @Override
    public String toString() {
        return this.id + " , " + this.name + " , " + this.price+" , "+this.quantity+" , "+this.expiryDate+" , "+this.manufacturer.getFirmName();
    }

    public static void addNewProduct(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter product name: ");
        String productName=input.next();
        System.out.print("Enter product price: ");
        double productPrice=input.nextDouble();
        System.out.print("Enter product quantity: ");
        int productQuantity=input.nextInt();
        System.out.print("Enter product expiration date (1999-12-31): ");
        String expDate=input.next();
        System.out.println("Choose manufacturer:");
        System.out.println("-------------------------------------");
        for (Manufacturer i: Main.manufacturers){
            System.out.println(i.toString());
        }
        System.out.println("-------------------------------------");
        System.out.print("Enter the id: ");
        int manufacturerId=input.nextInt();
        Main.inventory.add(new Product(productId, productName, productPrice, productQuantity, LocalDate.parse(expDate), Main.manufacturers.get(manufacturerId-1)));
        productId++;
    }


}