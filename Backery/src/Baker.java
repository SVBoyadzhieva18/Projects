class Baker {
    private int bakerId;
    private String bakerCompanyName;
    private String bakerCountry;
    private String bakerWorkTime;

    public Baker(int bakerId, String bakerCompanyName, String bakerCountry, String bakerWorkTime) {
        this.bakerId = bakerId;
        this.bakerCompanyName = bakerCompanyName;
        this.bakerCountry = bakerCountry;
        this.bakerWorkTime = bakerWorkTime;
    }

    public int getBakerId() {
        return bakerId;
    }

    public void setBakerId(int bakerId) {
        this.bakerId = bakerId;
    }

    public String getBakerCompanyName() {
        return bakerCompanyName;
    }

    public void setBakerCompanyName(String bakerCompanyName) {
        this.bakerCompanyName = bakerCompanyName;
    }

    public String getBakerCountry() {
        return bakerCountry;
    }

    public void setBakerCountry(String bakerCountry) {
        this.bakerCountry = bakerCountry;
    }

    public String getBakerWorkTime() {
        return bakerWorkTime;
    }

    public void setBakerWorkTime(String bakerWorkTime) {
        this.bakerWorkTime = bakerWorkTime;
    }

    public void displayBakerInfo() {
        System.out.println("Baker ID: " + bakerId);
        System.out.println("Baker Company Name: " + bakerCompanyName);
        System.out.println("Baker Country: " + bakerCountry);
        System.out.println("Baker Work Time: " + bakerWorkTime);
    }
}
