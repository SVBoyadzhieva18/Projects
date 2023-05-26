class Dealer {
    private int dealerId;
    private String dealerCompanyName;
    private String dealerFirstName;
    private String dealerLastName;

    public Dealer(int dealerId, String dealerCompanyName, String dealerFirstName, String dealerLastName) {
        this.dealerId = dealerId;
        this.dealerCompanyName = dealerCompanyName;
        this.dealerFirstName = dealerFirstName;
        this.dealerLastName = dealerLastName;
    }

    public int getDealerId() {
        return dealerId;
    }

    public void setDealerId(int dealerId) {
        this.dealerId = dealerId;
    }

    public String getDealerCompanyName() {
        return dealerCompanyName;
    }

    public void setDealerCompanyName(String dealerCompanyName) {
        this.dealerCompanyName = dealerCompanyName;
    }

    public String getDealerFirstName() {
        return dealerFirstName;
    }

    public void setDealerFirstName(String dealerFirstName) {
        this.dealerFirstName = dealerFirstName;
    }

    public String getDealerLastName() {
        return dealerLastName;
    }

    public void setDealerLastName(String dealerLastName) {
        this.dealerLastName = dealerLastName;
    }

    public void displayInfo() {
        System.out.println("Dealer Information:");
        System.out.println("ID: " + dealerId);
        System.out.println("Company Name: " + dealerCompanyName);
        System.out.println("First Name: " + dealerFirstName);
        System.out.println("Last Name: " + dealerLastName);
        System.out.println();
    }
}
