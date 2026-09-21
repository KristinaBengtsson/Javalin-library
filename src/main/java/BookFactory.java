import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class BookFactory {
    private final String[] firstNames = {"Anna", "Lars", "Sofie", "Mikkel", "Emma", "Jonas", "Clara", "Peter"};
    private final String[] lastNames = {"Hansen", "Nielsen", "Larsen", "Jensen", "Moller", "Andersen"};
    private final String[] adjectives = {"Silent", "Lost", "Golden", "Hidden", "Broken", "Endless"};
    private final String[] nouns = {"Forest", "Ocean", "Kingdom", "Secret", "Journey", "Night"};
    private final Random random = new Random();

    public List<Book> generateBooks(int count) {
        List<Author> authors = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            String name = pick(firstNames) + " " + pick(lastNames);
            authors.add(new Author(name));
        }

        List<Book> books = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            Author author = authors.get(random.nextInt(authors.size()));
            String title = "The " + pick(adjectives) + " " + pick(nouns);
            String isbn = "978" + String.format("%010d", i);
            books.add(new Book(author, title, isbn));
        }
        return books;
    }

    private String pick(String[] options) {
        return options[random.nextInt(options.length)];
    }
}