class Dough {
    private String flourType;
    private String bakingTechnique;
    private int weightInGrams;

    public Dough(String flourType, String bakingTechnique, int weightInGrams) {
        this.flourType = flourType;
        this.bakingTechnique = bakingTechnique;
        this.weightInGrams = weightInGrams;
    }

    public String getFlourType() {
        return flourType;
    }

    public void setFlourType(String flourType) {
        this.flourType = flourType;
    }

    public String getBakingTechnique() {
        return bakingTechnique;
    }

    public void setBakingTechnique(String bakingTechnique) {
        this.bakingTechnique = bakingTechnique;
    }

    public int getWeightInGrams() {
        return weightInGrams;
    }

    public void setWeightInGrams(int weightInGrams) {
        this.weightInGrams = weightInGrams;
    }

    public void printInfo() {
        System.out.println("Dough: ");
        System.out.println(" - Flour type: " + flourType);
        System.out.println(" - Baking technique: " + bakingTechnique);
        System.out.println(" - Weight: " + weightInGrams + " grams");
    }
}