public class Manufacturer {
    private String name;
    private String address;
    private String phone;
    public Manufacturer(String name, String address, String phone) {
        this.name = name;
        this.address = address;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void displayInfo() {
        System.out.println("Manufacturer name: " + name);
        System.out.println("Manufacturer address: " + address);
        System.out.println("Manufacturer phone: " + phone);
    }
}
