public class Product {
    private int productNumber;
    private String name;
    private double price;
    private int quantity;
    private String expiryDate;
    private Manufacturer manufacturer;


    public Product() {

        this.productNumber = 0;
        this.name = "";
        this.price = 0.0;
        this.quantity = 0;
        this.expiryDate = "";
        this.manufacturer = null;
    }

    public Product(int productNumber, String name, double price, int quantity, String expiryDate, Manufacturer manufacturer) {
        this.productNumber = productNumber;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.expiryDate = expiryDate;
        this.manufacturer = manufacturer;
    }

    public int getProductNumber() {
        return productNumber;
    }

    public void setProductNumber(int productNumber) {
        this.productNumber = productNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(String expiryDate) {
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
        return "Product" +
                "productNumber: " + productNumber +
                "name: " + name + '\'' +
                "price: " + price +
                "quantity: " + quantity +
                "expiryDate: '" + expiryDate + '\'' +
                "manufacturer: " + manufacturer;
    }
}
