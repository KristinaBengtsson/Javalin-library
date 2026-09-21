import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book>books;
    private List<User>users;
    private List<Loan>loans;

    public Library(){
        this.books = new ArrayList<>();
        this.users = new ArrayList<>();
        this.loans = new ArrayList<>();
    }

    public List<Book> getBooks() {
        return books;
    }

    public List<User> getUsers() {
        return users;
    }

    public List<Loan> getLoans() {
        return loans;
    }
}
