public class Delegate {
    private String name;
    private String EGN;
    private String hometown;
    private double travelExpenses;

    public Delegate(){
        this.name = "";
        this.EGN = "";
        this.hometown = "";
        this.travelExpenses = 0.0;
    }

    public Delegate(String name, String EGN, String hometown, double travelExpenses) {
        this.name = name;
        this.EGN = EGN;
        this.hometown = hometown;
        this.travelExpenses = travelExpenses;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEGN() {
        return EGN;
    }

    public void setEGN(String EGN) {
        this.EGN = EGN;
    }

    public String getHometown() {
        return hometown;
    }

    public void setHometown(String hometown) {
        this.hometown = hometown;
    }

    public double getTravelExpenses() {
        return travelExpenses;
    }

    public void setTravelExpenses(double travelExpenses) {
        this.travelExpenses = travelExpenses;
    }

    @Override
    public String toString() {
        return "Delegate " +
                "name: " + name + '\'' +
                "EGN: " + EGN + '\'' +
                "hometown: " + hometown + '\'' +
                "travelExpenses: " + travelExpenses;
    }
}