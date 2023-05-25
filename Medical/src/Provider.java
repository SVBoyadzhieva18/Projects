public class Provider {
    private String name;
    private String address;
    private String phone;

    public Provider(){
        this.name = "";
        this.address = "";
        this.phone = "";
    }

    public Provider(String name, String address, String phone) {
        this.name = name;
        this.address = address;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void displayInfo() {
    }

    public String getAddress() {
        return null;
    }

    public String getPhone() {
        return null;
    }
}
