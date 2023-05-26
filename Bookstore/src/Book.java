public class Book {
    private int invNumber;
    private String author;
    private String title;
    private double price;

    public Book(){
        this.invNumber=1;
        this.author="Chris";
        this.title="Otpred";
        this.price=19.99;
    }

    public Book(int invNumber, String author, String title, double price) {
        this.invNumber = invNumber;
        this.author = author;
        this.title = title;
        this.price = price;
    }

    public int getInvNumber() {
        return invNumber;
    }

    public void setInvNumber(int invNumber) {
        this.invNumber = invNumber;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void displayInfo(){
        System.out.println();
        System.out.println("Inv Numver: "+invNumber+"\nAuthor: "+author+"\nTitle: "+title+"\nPrice: "+price);
        System.out.println();
    }
}
