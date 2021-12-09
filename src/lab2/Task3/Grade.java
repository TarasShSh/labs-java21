package lab2.Task3;

public class Grade {
    private int grade;
    public Grade() {
        setGrade();

    }
    public Grade(final int grade) {
        setGrade(grade);
    }

    public int getGrade() {
        return grade;
    }
    public void setGrade() {
        this.grade = ((int) (Math.random() * 100));
    }

    public void setGrade(final int grade) {
        this.grade = grade;
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) return true;

        if (o == null || getClass() != o.getClass()) return false;

        final Grade grade1 = (Grade) o;
        return getGrade() == grade1.getGrade();
    }

    @Override
    public int hashCode() {
        return 47 * this.getGrade();
    }

    @Override
    public String toString() {
        return "Grade: " + getGrade();
    }
}
