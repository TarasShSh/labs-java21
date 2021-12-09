package lab3.Task1;


import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class User {
    private Address address = new Address();
    private String name;
    private String email;
    private int age;
    private String password;

    public User(final String street, final int numberOfHouse, final String name, final String email, final int age, final String password) {
        this.address.setStreet(street);
        this.address.setNumberOfHouse(numberOfHouse);
        this.name = name;
        this.email = email;
        this.age = age;
        this.password = password;

        validate();
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(final Address address) {
        this.address = address;
        validate();
    }

    public String getName() {
        return name;
    }

    public void setFirstName(final String name) {
        this.name = name;
        validate();
    }
    public String getEmail() {
        return email;
    }

    public void setEmail(final String email) {
        this.email = email;
        validate();
    }

    public int getAge() {
        return age;
    }

    public void setAge(final int age) {
        this.age = age;
        validate();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(final String password) {
        this.password = password;
    }

    public void validate() {
        final List<String> exceptionsMessages = new ArrayList<>();

        if (getAddress().getStreet().contains(" ") || getAddress().getStreet().matches("(.*)\\d+(.*)")) {
            exceptionsMessages.add("Name of street can't contain numbers, spaces.");
        }

        if (getAddress().getNumberOfHouse() < 1 || getAddress().getNumberOfHouse() > 99 || getAddress().getNumberOfHouse() == 13) {
            exceptionsMessages.add("Number of house must be in in range from 1 to 99 and can't be thirteen.");
        }

        if (getName().contains(" ") || getName().matches("(.*)\\d+(.*)")) {
            exceptionsMessages.add("Name can't contain numbers, spaces.");
        }

        if (getEmail().contains(" ") || !getEmail().matches("^(.+)@(\\S+)$")) {
            exceptionsMessages.add("Email is not valid.'");
        }

        if (getAge() < 18) {
            exceptionsMessages.add("User must be adult.");
        }

        if (!exceptionsMessages.isEmpty()) {
            throw new UncheckedException(exceptionsMessages, NotValid.ERROR_400);
        }
    }

    @Override
    public boolean equals(final Object o) {

        if (this == o) return true;

        if (o == null || getClass() != o.getClass()) return false;

        final User user = (User) o;
        return age == user.age && Objects.equals(address, user.address) && Objects.equals(name, user.name)
                        && Objects.equals(email, user.email) && Objects.equals(password, user.password);
    }

    @Override
    public int hashCode() {
        return Objects.hash(address, name, email, age, password);
    }

    @Override
    public String toString() {
        return "User information:" + '\n' +
                "Name: " + getName()+ " " +'\n' +
                getAddress().toString() + '\n' +
                "Age: " + getAge() + '\n' +
                "E-mail: " + getEmail() + '\n' +
                "Password: " + getPassword();
    }
}