public class Book {
    private Author author;
    private String title;
    private String isbn;

    public Book (Author author, String title, String isbn){
        this.author = author;
        this.title = title;
        this.isbn = isbn;
    }

    public Author getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public String getIsbn() {
        return isbn;
    }
}

