package lab2.Task4;

import lab2.Task3.*;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(final String[] args) {

        final Subject physics = new Subject("Physics");
        final Subject mathematics = new Subject("Mathematics");
        final Subject english = new Subject("English");

        final List<Subject> subjectList = new ArrayList<>();
        final List<Subject> subjectList2 = new ArrayList<>();
        final List<Subject> subjectList3 = new ArrayList<>();
        subjectList.add(physics);
        subjectList.add(mathematics);
        subjectList.add(english);
        subjectList2.add(physics);
        subjectList2.add(mathematics);
        subjectList2.add(english);
        subjectList3.add(physics);
        subjectList3.add(mathematics);
        subjectList3.add(english);

        final List<Student> studentList = new ArrayList<>();
        final Student student1 = new Student("Taras Shevchenko", subjectList, addGrades(subjectList));
        final Student student2 = new Student("Andrii Shevchenko", subjectList2, addGrades(subjectList));
        final Student student3 = new Student("Victor Hryhorovych", subjectList3, addGrades(subjectList));

        studentList.add(student1);
        studentList.add(student2);
        studentList.add(student3);

        printAllStudents(studentList);


        final Subject history = new Subject("History");
        addSubjectToAllStudents(studentList, history);

        for (final Student student : studentList) {
            student.addGrade();
        }

        printAllStudents(studentList);

        for (final Student student : studentList) {
            student.printMap(history);
        }

        printBestStudent(studentList);
    }


    public static void printAllStudents(final List<Student> studentList) {
        for (final Student student : studentList) {
            System.out.println(student);
        }
    }

    public static void addSubjectToAllStudents(final List<Student> studentList, final Subject subject) {
         List<Subject> subjects = new ArrayList<>();
        for (final Student student : studentList) {
            student.addSubject(subject);
        }
    }
        public static List<Grade> addGrades(final List<Subject> subjectList){
            final List<Grade> gradeList = new ArrayList<>();

            for (final Subject ignored : subjectList) {
                final Grade grade = new Grade();
                gradeList.add(grade);
            }

            return gradeList;
        }

        public static void printBestStudent(final List<Student> studentList) {
            final var arr = new ArrayList<Double>(studentList.size());
            double averageGrade = 0.0;
            for (final Student student : studentList) {
                for (final Grade grade : student.getGrades()) {
                    averageGrade += grade.getGrade();
                }

                averageGrade /= student.getGrades().size();
                arr.add(averageGrade);
            }

            System.out.println(studentList.get(arr.indexOf(averageGrade)));
        }
    }
