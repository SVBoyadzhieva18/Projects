public class Medicine {
    private String name;
    private double price;
    private int expirationDate;
    private Provider provider;
    private Manufacturer manufacturer;
    private Importer importer;

    public Medicine(String name, double price, int expirationDate, Provider provider, Manufacturer manufacturer, Importer importer) {
        this.name = name;
        this.price = price;
        this.expirationDate = expirationDate;
        this.provider = provider;
    }

    public Medicine(String name, double price, int expirationDate, Manufacturer manufacturer) {
        this.name = name;
        this.price = price;
        this.expirationDate = expirationDate;
        this.manufacturer = manufacturer;
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

    public int getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(int expirationDate) {
        this.expirationDate = expirationDate;
    }

    public Provider getProvider() {
        return provider;
    }

    public void setProvider(Provider provider) {
        this.provider = provider;
    }

    public Manufacturer getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(Manufacturer manufacturer) {
        this.manufacturer = manufacturer;
    }

    public Importer getImporter() {
        return importer;
    }

    public void setImporter(Importer importer) {
        this.importer = importer;
    }

    public void displayInfo() {
        System.out.println("Medicine name: " + name);
        System.out.println("Price: " + price);
        System.out.println("Expiration date: " + expirationDate);
        if (provider != null) {
            System.out.println("Provider name: " + provider.getName());
            System.out.println("Provider address: " + provider.getAddress());
            System.out.println("Provider phone: " + provider.getPhone());
        }
        if (manufacturer != null) {
            System.out.println("Manufacturer name: " + manufacturer.getName());
            System.out.println("Manufacturer address: " + manufacturer.getAddress());
            System.out.println("Manufacturer phone: " + manufacturer.getPhone());
        }
        if (importer != null) {
            System.out.println("Importer name: " + importer.getName());
            System.out.println("Importer address: " + importer.getAddress());
            System.out.println("Importer phone: " + importer.getPhone());
        }
    }
}
