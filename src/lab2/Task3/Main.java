package lab2.Task3;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(final String[] args) {
        final List<Subject> subjectList = new ArrayList<>();

        final Subject pe = new Subject("Physical Education");
        final Subject mathematics = new Subject("Mathematics");
        final Subject ukrlang = new Subject("Ukrainian language");

        subjectList.add(pe);
        subjectList.add(mathematics);
        subjectList.add(ukrlang);

        System.out.println(subjectList);

        final Student student = new Student("Roman Voloshyn", subjectList, addGrades(subjectList));
        System.out.println(student);

    }

    public static List<Grade> addGrades(final List<Subject> subjectList){
        final List<Grade> gradeList = new ArrayList<>();

        for (final Subject ignored : subjectList) {
            final Grade grade = new Grade();
            gradeList.add(grade);
        }

        return gradeList;
    }

}