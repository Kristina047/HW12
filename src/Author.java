import java.util.Objects;
public class Author {
    private String firstName;
    private String lastName;

    public Author (){
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
    public String toString() {
        return firstName + lastName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Author author = (Author) o;
        return Objects.equals(firstName,author.firstName) && Objects.equals (lastName, author.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName);
    }
}