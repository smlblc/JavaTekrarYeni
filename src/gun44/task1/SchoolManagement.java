package gun44.task1;

import java.util.Scanner;

public class SchoolManagement {

    public static void main(String[] args) {
        School technoStudy = new School("TS", 1000);
        School artLyceum = new School("Art Lyceum", 50);

        //not the best way to assign school
        artLyceum.registerStudent(new Student("Samil", "OH 134", technoStudy, 5000));
        artLyceum.registerStudent(new Student("Yusuf", "Hazel 596", artLyceum, 4000));

        //better way to assign school
        artLyceum.registerEmployee(new Employee("Fetih", "High st 59", 90_000));
        artLyceum.registerEmployee(new Employee("Katya", "Mountain st 59", 100_000));


        System.out.println(artLyceum);


    }
}
