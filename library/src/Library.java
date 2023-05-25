import java.util.ArrayList;
import java.util.Date;

class Library {
    private ArrayList<LendingRegistry> lendingRegistries = new ArrayList<>();

    public void addLendingRegistry(LendingRegistry lendingRegistry) {
        lendingRegistries.add(lendingRegistry);
    }
    //other methods

    public void displayAll() {
        for (LendingRegistry lendingRegistry : lendingRegistries) {
            lendingRegistry.display();
            System.out.println("-----------------------------");
        }
    }

    //other methods
    public void removeLendingRegistry(LendingRegistry lendingRegistry) {
        lendingRegistries.remove(lendingRegistry);
    }

    public void removeLendingRegistry(int regNum) {
        for (LendingRegistry lendingRegistry : lendingRegistries) {
            if (lendingRegistry.getRegNum() == regNum) {
                lendingRegistries.remove(lendingRegistry);
                return;
            }
        }
    }

    // other methods
    public void displayLateReaders() {
        for (LendingRegistry lendingRegistry : lendingRegistries) {
            if (lendingRegistry.isLate()) {
                System.out.println("Reader: " + lendingRegistry.getReader().getName());
                System.out.println("Book: " + lendingRegistry.getBook().getTitle());
                System.out.println("Due date: " + lendingRegistry.getDueDate());
                System.out.println("-----------------------------");
            }
        }
    }

    // other methods
    public ArrayList<Book> getLateBooks() {
        ArrayList<Book> lateBooks = new ArrayList<Book>();
        for (LendingRegistry lendingRegistry : lendingRegistries) {
            if (lendingRegistry.isLate()) {
                lateBooks.add(lendingRegistry.getBook());
            }
        }
        return lateBooks;
    }

    // other methods
    public ArrayList<String> getBooksByAuthor(String author) {
        ArrayList<String> booksByAuthor = new ArrayList<String>();
        Book[] books = new Book[0];
        for (Book book : books) {
            if (book.getAuthor().equals(author)) {
                booksByAuthor.add(book.getTitle());
            }
        }
        return booksByAuthor;
    }

    // other methods
    public ArrayList<Reader> getReadersWithBooksDueOnDate(Date date) {
        ArrayList<Reader> readersWithBooksDue = new ArrayList<Reader>();
        LendingRegistry[] lendings = new LendingRegistry[0];
        for (LendingRegistry lending : lendings) {
            if (lending.getReturnDate().equals(date)) {
                if (!readersWithBooksDue.contains(lending.getReader())) {
                    readersWithBooksDue.add(lending.getReader());
                }
            }
        }
        return readersWithBooksDue;
    }
}
