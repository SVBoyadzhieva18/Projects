class Cake {
    private String cakeCrust;
    private boolean cakeMultipleLayers;

    public Cake(String cakeCrust, boolean cakeMultipleLayers) {
        this.cakeCrust = cakeCrust;
        this.cakeMultipleLayers = cakeMultipleLayers;
    }

    public String getCakeCrust() {
        return cakeCrust;
    }

    public void setCakeCrust(String cakeCrust) {
        this.cakeCrust = cakeCrust;
    }

    public boolean isCakeMultipleLayers() {
        return cakeMultipleLayers;
    }

    public void setCakeMultipleLayers(boolean cakeMultipleLayers) {
        this.cakeMultipleLayers = cakeMultipleLayers;
    }

    public void displayCakeInfo() {
        System.out.println("Cake Crust: " + cakeCrust);
        System.out.println("Cake Multiple Layers: " + cakeMultipleLayers);
    }
}