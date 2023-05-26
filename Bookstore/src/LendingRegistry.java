import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class LendingRegistry {
    private List<Book> books;
    private List<Reader> readers;
    private List<Date> returnDates;

    public LendingRegistry() {
        books = new ArrayList<>();
        readers = new ArrayList<>();
        returnDates = new ArrayList<>();
    }

    public void addBookToReader(Book book, Reader reader, Date returnDate) {
        books.add(book);
        readers.add(reader);
        returnDates.add(returnDate);
    }

    public void displayAllData() {
        for (int i = 0; i < books.size(); i++) {
            System.out.println("Book Information:");
            books.get(i).displayInfo();
            System.out.println("Reader Information:");
            readers.get(i).displayInfo();
            System.out.println("Return Date: " + returnDates.get(i));
            System.out.println("--------------------");
        }
    }

    public void removeReturnedBook(int index) {
        books.remove(index);
        readers.remove(index);
        returnDates.remove(index);
    }

    public void displayLateReaders() {
        Date currentDate = new Date();
        for (int i = 0; i < returnDates.size(); i++) {
            if (returnDates.get(i).before(currentDate)) {
                System.out.println("Late Reader Information:");
                readers.get(i).displayInfo();
                System.out.println("Return Date: " + returnDates.get(i));
                System.out.println("--------------------");
            }
        }
    }

    public void displayLateBooks() {
        Date currentDate = new Date();
        for (int i = 0; i < returnDates.size(); i++) {
            if (returnDates.get(i).before(currentDate)) {
                System.out.println("Late Book Information:");
                books.get(i).displayInfo();
                System.out.println("Return Date: " + returnDates.get(i));
                System.out.println("--------------------");
            }
        }
    }

    public void displayBooksByAuthor(String author) {
        for (int i = 0; i < books.size(); i++) {
            if (books.get(i).getAuthor().equalsIgnoreCase(author)) {
                System.out.println("Book Information:");
                books.get(i).displayInfo();
                System.out.println("Reader Information:");
                readers.get(i).displayInfo();
                System.out.println("Return Date: " + returnDates.get(i));
                System.out.println("--------------------");
            }
        }
    }

    public void displayReadersByDate(Date date) {
        for (int i = 0; i < returnDates.size(); i++) {
            if (returnDates.get(i).equals(date)) {
                System.out.println("Reader Information:");
                readers.get(i).displayInfo();
                System.out.println("Return Date: " + returnDates.get(i));
                System.out.println("--------------------");
            }
        }
    }
}