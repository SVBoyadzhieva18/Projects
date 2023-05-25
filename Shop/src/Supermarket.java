import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.Collections;
import java.util.Comparator;

public class Supermarket {
    private List<Product> deliveredProducts;

    public Supermarket() {
        deliveredProducts = new ArrayList<Product>();
    }

    public void addProduct(Product product) {
        deliveredProducts.add(product);
    }

    public void displayDeliveredProducts() {
        for (Product product : deliveredProducts) {
            product.toString();
            System.out.println("------------------");
        }
    }

    public void displayAllDeliveredProducts() {
        System.out.println("Delivered Product List:");
        for (Product product : deliveredProducts) {
            System.out.println("Product Number: " + product.getProductNumber());
            System.out.println("Name: " + product.getName());
            System.out.println("Price: " + product.getPrice());
            System.out.println("Quantity: " + product.getQuantity());
            System.out.println("Expiry Date: " + product.getExpiryDate());
            if (product.getManufacturer() != null) {
                System.out.println("Manufacturer Number: " + product.getManufacturer().getManufacturerNumber());
                System.out.println("Manufacturer Name: " + product.getManufacturer().getName());
                System.out.println("Manufacturer Address: " + product.getManufacturer().getAddress());
                System.out.println("Manufacturer Phone: " + product.getManufacturer().getPhone());
            }
        }
    }

    public void removeExpiredProducts() {
        Iterator<Product> iterator = deliveredProducts.iterator();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        while (iterator.hasNext()) {
            Product product = iterator.next();
            try {
                Date productDate = sdf.parse(product.getExpiryDate());
                Date today = new Date();
                if (productDate.before(today)) {
                    iterator.remove();
                }
            } catch (ParseException e) {
                e.printStackTrace();
            }
        }
    }

    public void displayProductsGreaterThanPrice(double price) {
        List<Product> filteredProducts = new ArrayList<>();
        for (Product product : deliveredProducts) {
            if (product.getPrice() > price) {
                filteredProducts.add(product);
            }
        }
        // sort the filtered products based on the price in ascending order
        Collections.sort(filteredProducts, new Comparator<Product>() {
            public int compare(Product product1, Product product2) {
                return Double.compare(product1.getPrice(), product2.getPrice());
            }
        });
        for (Product product : filteredProducts) {
            product.toString();
            System.out.println("------------------");
        }
    }

    public void displayManufacturerByProductNumber(int productNumber) {
        for (Product product : deliveredProducts) {
            if (product.getProductNumber() == productNumber) {
                Manufacturer manufacturer = product.getManufacturer();
                if (manufacturer != null) {
                    System.out.println("Manufacturer Number: " + manufacturer.getManufacturerNumber());
                    System.out.println("Manufacturer Name: " + manufacturer.getName());
                    System.out.println("Manufacturer Address: " + manufacturer.getAddress());
                    System.out.println("Manufacturer Phone: " + manufacturer.getPhone());
                } else {
                    System.out.println("Manufacturer not found");
                }
                break;
            }
        }
    }

    public List<Manufacturer> getManufacturersByPrice(double price) {
        List<Manufacturer> manufacturers = new ArrayList<Manufacturer>();
        for (Product product : deliveredProducts) {
            if (product.getPrice() < price) {
                Manufacturer manufacturer = product.getManufacturer();
                if (!manufacturers.contains(manufacturer)) {
                    manufacturers.add(manufacturer);
                }
            }
        }
        return manufacturers;
    }

    public void updateManufacturerPhone(int manufacturerNumber, String newPhone) {
        for (Product product : deliveredProducts) {
            Manufacturer manufacturer = product.getManufacturer();
            if (manufacturer.getManufacturerNumber() == manufacturerNumber) {
                manufacturer.setPhone(newPhone);
                break;
            }
        }
    }
}
