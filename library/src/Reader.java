class Reader {
    private String name;
    private String address;
    private String idNum;

    public Reader(String name, String address, String idNum) {
        this.name = name;
        this.address = address;
        this.idNum = idNum;
    }

    public Reader(){
        this.name = "";
        this.address = "";
        this.idNum = "";
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

    public String getIdNum() {
        return idNum;
    }

    public void setIdNum(String idNum) {
        this.idNum = idNum;
    }

    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Address: " + address);
        System.out.println("ID Number: " + idNum);
    }
}