import java.util.Date;

class LendingRegistry {
    private int regNum;
    private Date returnDate;
    private Book book;
    private Reader reader;

    public LendingRegistry() {
        this.regNum = regNum;
        this.returnDate = returnDate;
        this.book = book;
        this.reader = reader;
    }

    public int getRegNum() {
        return regNum;
    }

    public void setRegNum(int regNum) {
        this.regNum = regNum;
    }

    public Date getReturnDate() {
        return returnDate;
    }
    public void setReturnDate(Date returnDate) {
        this.returnDate = returnDate;
    }
    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public Reader getReader() {
        return reader;
    }

    public void setReader(Reader reader) {
        this.reader = reader;
    }

    public void display() {
        System.out.println("Registration Number: " + regNum);
        System.out.println("Return Date: " + returnDate);
        System.out.println("Book: ");
        book.display();
        System.out.println("Reader: ");
        reader.display();
    }

    public boolean isLate() {
        return false;
    }

    public String getDueDate() {
        return null;
    }

    public void displayListOfReadersWhoHaveToReturnBooksOnSpecificDate(String date) {
    }

    public void addBookToLendingRegistry() {
    }

    public void displayAllDataInLendingRegistry() {
    }

    public void returnBook() {
    }

    public void displayListOfBooksNotReturnedOnTime() {
    }

    public void displayListOfReadersWhoHaventReturnedBooksOnTime() {
    }

    public void displayListOfBookTitlesByAuthor(String author) {
    }
}
