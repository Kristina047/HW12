import java.util.Objects;

public class Book {
    private String title;
    private Main.Author author;
    private int year;


    public Book(String title, Main.Author author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
    }

    public String getTitle() {
        return this.title;
    }

    public Main.Author getAuthor() {
        return this.author;
    }

    public int getYear() {
        return this.year;
    }

    public int setYear(int year) {
        this.year = year;
        return this.year;
    }
    @Override
    public String toString() {
        return "Название='" + title + " автор" + author + ", год публикации:" + year;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return title.equals(book.title) && author.equals(book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, author);
    }
}
