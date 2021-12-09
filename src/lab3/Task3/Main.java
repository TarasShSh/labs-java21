package lab3.Task3;

import lab2.Task3.*;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(final String[] args) {
        final List<Subject> subjectList = new ArrayList<>();
        
        final Subject english = new Subject("English");
        final Subject mathematics = new Subject("Mathematics");
        final Subject physics = new Subject("Physics");
        final Subject geography = new Subject("Geography");

        subjectList.add(mathematics);
        subjectList.add(physics);
        subjectList.add(english);
        subjectList.add(geography);

        System.out.println(subjectList);

        final List<Student> studentList = new ArrayList<>();

        final Student student1 = new Student("Roman Voloshyn", subjectList, randomGrades(subjectList));
        final Student student2 = new Student("Taras Shevchenko", subjectList, randomGrades(subjectList));
        final Student student3 = new Student("Victor Hryhorovych", subjectList, randomGrades(subjectList));

        studentList.add(student1);
        studentList.add(student2);
        studentList.add(student3);

        System.out.println(studentList);

        System.out.println(casting(studentList));

        System.out.println(deleteAver(studentList));

        System.out.println(sorting(studentList));

        System.out.println(addLineToName(studentList));

        System.out.println(printEnglishGrades(studentList));

        System.out.println(findBest(studentList));
    }

    public static List<StudentSimple> casting(final List<Student> studentList) {
        return studentList.stream()
                .map(student -> new StudentSimple(student.getName(), student.getName(), student.getId()))
                .collect(Collectors.toList());
    }

    public static List<Student> deleteAver(final List<Student> studentList) {
        return studentList.stream()
                .filter(student -> (student.getGrades().stream()
                        .mapToInt(Grade::getGrade)).average().orElse(0) > 3)
                .collect(Collectors.toList());
    }

    public static List<Grade> printEnglishGrades(final List<Student> studentList) {
        return studentList.stream()
                .map(student -> student.getGrades().get((student.getSubjects().stream()
                        .map(Subject::getName)
                        .collect(Collectors.toList()).indexOf("English"))))
                .collect(Collectors.toList());
    }

    public static List<Student> sorting(final List<Student> studentList) {
        return studentList.stream()
                .sorted(Comparator.comparing(Student::getName))
                .collect(Collectors.toList());
    }

    public static Student findBest(final List<Student> studentList) {
        return studentList.stream()
                .max(Comparator.comparingDouble(student -> student.getGrades().stream()
                        .mapToInt(Grade::getGrade).average().getAsDouble())).get();
    }

    public static List<String> addLineToName(final List<Student> studentList) {
        return studentList.stream()
                .map(Student::getName)
                .reduce((a, b) -> a + "-" + b)
                .stream().toList();
    }

    public static List<Grade> randomGrades(final List<Subject> subjectList){
        final List<Grade> gradeList = new ArrayList<>();

        for (final Subject ignored : subjectList) {
            final Grade grade = new Grade();
            gradeList.add(grade);
        }

        return gradeList;
    }
}