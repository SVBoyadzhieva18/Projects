public class Reader {
    private String name;
    private String address;
    private String egn;

    public Reader(){
        this.name="";
        this.address="";
        this.egn="";
    }

    public Reader(String name, String address, String egn) {
        this.name = name;
        this.address = address;
        this.egn = egn;
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

    public String getEgn() {
        return egn;
    }

    public void setEgn(String egn) {
        this.egn = egn;
    }

    public void displayInfo(){
        System.out.println();
        System.out.println("Name: "+name+"\nAddress: "+address+"\nEGN: "+egn);
        System.out.println();
    }
}
