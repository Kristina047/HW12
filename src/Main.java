
public class Main {
    public static void main(String[] args) {

        Author pushkin = new Author(": Александр", " Пушкин");
        Author turgenev = new Author(": Иван", " Тургенев");

        Book book1 = new Book("Сказка о царе Салтане,",pushkin, 1831);
        book1.setYear(1832);

        System.out.println(book1);
        System.out.println();

        Book book2 = new Book("Записки охотника,", turgenev, 1852);
        System.out.println(book2);
    }
}








