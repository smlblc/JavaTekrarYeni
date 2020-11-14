package gun27.tasks.task1;

import java.util.ArrayList;

// create class student with fields:
// string name, double grade
class Student {
    String name;
    double grade;
}

public class Task1 {
    // create 3 objects of student class and print them

    public static void main(String[] args) {
//        //1. way create three objects in main
//        Student student1 = new Student();
//        student1.name = "John";
//        student1.grade = 69;
//        System.out.println(student1.name + ": " + student1.grade);
//
//        Student student2 = new Student();
//        student2.name = "Marta";
//        student2.grade = 99.5;
//        System.out.println(student2.name + ": " + student2.grade);
//
//        Student student3 = new Student();
//        student3.name = "Alice";
//        student3.grade = 78;
//        System.out.println(student3.name + ": " + student3.grade);

        // 3. way store them in List
        ArrayList<Student> students = new ArrayList<>();
        students.add(createStudent("John", 69));
        students.add(createStudent("Marta", 99.5));
        students.add(createStudent("Alice", 78));

        for(Student student : students) {
            printStudent(student);
        }

        double gradeAverage = getGradeAverage(students);

        System.out.println("Average of " + students.size() +" student" +" is " + String.format("%.2f", gradeAverage));
    }

    // 2. way create objects in method
    public static Student createStudent(String name, double grade) {
        Student student = new Student();
        student.name = name;
        student.grade = grade;

        return student;
    }

    public static void printStudent(Student student) {
        System.out.println(student.name + ": " + student.grade);
    }

    // create a method that will get an average of three students grade
    public static double getGradeAverage(ArrayList<Student> students) {
        double sum = 0;
        for(Student student : students) {
            sum += student.grade;
        }

        double average = sum / students.size();

        return average;
    }


}









