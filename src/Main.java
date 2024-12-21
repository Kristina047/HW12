import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

public class Main {
    public static void main(String[] args) {

        Author pushkin = new Author("Александр", " Пушкин");
        Author turgenev = new Author("Иван", " Тургенев");


        Book book1 = new Book("Сказка о царе Салтане", pushkin, 1831);
        book1.setYear(1832);

        System.out.println(book1.title);
        System.out.println(book1.author);
        System.out.println(book1.getYear() + " год");
        System.out.println();

        Book book2 = new Book("Записки охотника", turgenev, 1852);
        System.out.println(tur.title);
        System.out.println(tur.author);
        System.out.println(tur.year + " год");
    }


    public static class Author {
        private String firstName;
        private String lastName;

        public String toString() {
            return firstName + lastName;
        }

        public String getName() {
            return this.firstName;
        }

        public String getAge() {
            return this.lastName;
        }

        public Author(String firstname, String lastname) {
            this.firstName = firstname;
            this.lastName = lastname;
        }
        @Override
        public boolean equals(Object o) {
            if (this == o)
                return true;
            if (o == null || getClass() != o.getClass())
                return false;
            Author author = (Author) o;
            return firstName.equals(author.firstName) && lastName.equals(author.lastName);
        }
        @Override
        public int hashCode() {
            return Objects.hash(firstName, lastName);
        }


    }

    public static class Book {
        private String title;
        private Author author;
        private int year;

        public String toString() {
            return "Название='" + title + " автор" + author + ", год публикации:" + year;
        }

        public Book(String title, Author author, int year) {
            this.title = title;
            this.author = author;
            this.year = year;
        }

        public String getTitle() {
            return this.title;
        }

        public Author getAuthor() {
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
}
