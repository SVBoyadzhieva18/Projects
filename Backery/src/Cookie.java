class Cookie {
    private boolean cookieHasChocolateChips;
    private String cookieTexture;

    public Cookie(boolean cookieHasChocolateChips, String cookieTexture) {
        this.cookieHasChocolateChips = cookieHasChocolateChips;
        this.cookieTexture = cookieTexture;
    }

    public boolean isCookieHasChocolateChips() {
        return cookieHasChocolateChips;
    }

    public void setCookieHasChocolateChips(boolean cookieHasChocolateChips) {
        this.cookieHasChocolateChips = cookieHasChocolateChips;
    }

    public String getCookieTexture() {
        return cookieTexture;
    }

    public void setCookieTexture(String cookieTexture) {
        this.cookieTexture = cookieTexture;
    }

    public void displayCookieInfo() {
        System.out.println("Cookie Has Chocolate Chips: " + cookieHasChocolateChips);
        System.out.println("Cookie Texture: " + cookieTexture);
    }
}
