public class Manufacturer {
    private int manufacturerNumber;
    private String name;
    private String address;
    private String phone;


    public Manufacturer() {
        this.manufacturerNumber = 0;
        this.name = "";
        this.address = "";
        this.phone = "";
    }

    public Manufacturer(int manufacturerNumber, String name, String address, String phone) {
        this.manufacturerNumber = manufacturerNumber;
        this.name = name;
        this.address = address;
        this.phone = phone;
    }

    public int getManufacturerNumber() {
        return manufacturerNumber;
    }

    public void setManufacturerNumber(int manufacturerNumber) {
        this.manufacturerNumber = manufacturerNumber;
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

    @Override
    public String toString() {
        return "Manufacturer " +
                "manufacturerNumber: " + manufacturerNumber +
                "name: " + name + '\'' +
                "address: " + address + '\'' +
                "phone: " + phone + '\'';
    }
}
