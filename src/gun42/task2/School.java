package gun42.task2;

import java.util.ArrayList;
import java.util.List;

/*
Create class School with 5 attributes
and with extra one attribute as List<Student> students(which means you need to create class Student)
 */
public class School {

    private String name;
    private String phoneNumber;
    private String email;
    private String address;
    private String principal;
    private int schoolSize;
    private List<Student> students;

    public School(String name, String phoneNumber, String email, String address, String principal, int schoolSize) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.address = address;
        this.principal = principal;
        this.schoolSize = schoolSize;
        this.students = new ArrayList<>();
    }

    public School(String name, String phoneNumber, String email, String address, String principal, List<Student> students) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.address = address;
        this.principal = principal;
        this.students = students;
    }

    public School(String name, String phoneNumber, String email, String address, String principal, int schoolSize, List<Student> students) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.address = address;
        this.principal = principal;
        this.schoolSize = schoolSize;
        this.students = students;
    }

    public int getSchoolSize() {
        return schoolSize;
    }

    public void setSchoolSize(int schoolSize) {
        this.schoolSize = schoolSize;
    }

    public void registerStudent(Student student) {
//        if(students.size() < getSchoolSize()) {
//            students.add(student);
//        }else {
//            throw new RuntimeException("You exceed student limit, cant register more students");
//        }
        if(students.size() >= getSchoolSize()) {
            throw new RuntimeException("You exceed student limit, cant register more students");
        }
        students.add(student);
    }

    public String toString() {
        return "School{" +
                "name='" + name + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", email='" + email + '\'' +
                ", address='" + address + '\'' +
                ", principal='" + principal + '\'' +
                ", students=" + students +
                '}';
    }
}
