class PastryBaker {
    private Pastry pastry;
    private Baker baker;

    public PastryBaker(Pastry pastry, Baker baker) {
        this.pastry = pastry;
        this.baker = baker;
    }

    public Pastry getPastry() {
        return pastry;
    }

    public void setPastry(Pastry pastry) {
        this.pastry = pastry;
    }

    public Baker getBaker() {
        return baker;
    }

    public void setBaker(Baker baker) {
        this.baker = baker;
    }

    public void displayPastryBakerInfo() {
        System.out.println("Pastry Information:");
        pastry.displayPastryInfo();
        System.out.println("Baker Information:");
        baker.displayBakerInfo();
    }
}