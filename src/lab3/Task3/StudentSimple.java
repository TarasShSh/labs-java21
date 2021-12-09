package lab3.Task3;


import java.util.Objects;

public class StudentSimple {
    private String name;
    private int id;
    private static int count = 1;

    public StudentSimple(final String name, final String lastName, final int id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(final int id) {
        this.id = id;
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) return true;

        if (o == null || getClass() != o.getClass()) return false;

        final StudentSimple that = (StudentSimple) o;
        return id == that.id && Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, id);
    }

    @Override
    public String toString() {
        return "Student{" + '\n' +
                "Name: " + getName() + '\n'+
                "Unique ID: " + getId() + '\n';
    }
}
