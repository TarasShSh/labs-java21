package lab2.Task3;

import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.TreeMap;

public class Student {
    private String name;
    private int id;
    private static int count = 1;
    private List<Subject> subjects;
    private List<Grade> grades;

    public Student(final String name, final List<Subject> subjects, final List<Grade> grades) {
        setName(name);
        setId(count++);
        setSubjects(subjects);
        setGrades(grades);
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

    public List<Subject> getSubjects() {
        return subjects;
    }

    public void setSubjects(final List<Subject> subjects) {
        this.subjects = subjects;
    }

    public void addSubject(final Subject subject) {
        this.getSubjects().add(subject);
    }

    public List<Grade> getGrades() {
        return grades;
    }

    public void setGrades(final List<Grade> grades) {
        this.grades = grades;
    }


    public void addGrade(final Grade grade) {
        this.getGrades().add(grade);
    }
    public void addGrade(final int num) {
        final Grade grade = new Grade(num);
        this.getGrades().add(grade);
    }
    public void addGrade() {
        final Grade grade = new Grade();
        this.getGrades().add(grade);
    }

    public void printGrades() {
        System.out.println(this.getGrades());
    }

    public void printMap(final Subject subject) {
        final Map<Integer, Grade> studentMap = new TreeMap<>();
        final int indexOfGrade = this.getSubjects().indexOf(subject);
        studentMap.put(this.getId(), this.getGrades().get(indexOfGrade));
        System.out.println(studentMap);
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) return true;

        if (o == null || getClass() != o.getClass()) return false;

        final Student student = (Student) o;
        return getId() == student.getId() && Objects.equals(getName(), student.getName())
                && Objects.equals(getSubjects(), student.getSubjects()) && Objects.equals(getGrades(), student.getGrades());
    }

    @Override
    public int hashCode() {
        return (47 * this.getName().hashCode()) +
                (47 * this.getId()) +
                (47 * this.getSubjects().hashCode()) +
                (47 * this.getGrades().hashCode());
    }

    @Override
    public String toString() {
        return "Student{" + '\n' +
                "Name: " + getName() + '\n' +
                "Unique ID: " + getId() + '\n' +
                getSubjects().toString() + '\n' +
                getGrades().toString() + '\n' +
                "}";
    }
}