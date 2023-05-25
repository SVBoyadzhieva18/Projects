class Book {
    private String invNum;
    private String author;
    private String title;
    private double price;

    public Book(String invNum, String author, String title, double price) {
        this.invNum = invNum;
        this.author = author;
        this.title = title;
        this.price = price;
    }
    public Book() {
        this.invNum = "";
        this.author = "";
        this.title = "";
    }

    public String getInvNum() {
        return invNum;
    }

    public void setInvNum(String invNum) {
        this.invNum = invNum;
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

    public void display() {
        System.out.println("Inventory Number: " + invNum);
        System.out.println("Author: " + author);
        System.out.println("Title: " + title);
        System.out.println("Price: " + price);
    }
}