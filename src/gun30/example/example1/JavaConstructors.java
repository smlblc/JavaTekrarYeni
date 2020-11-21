package gun30.example.example1;

class Student {
    String firstName;
    String lastName;
    double examResult;

    //constructors: are special methods, which creates an object of class
    //default constructor
    public Student() {
        firstName = "John";
        lastName = "Black";
        examResult = 95.7;
    }

    public static final void student(){

    }

    //overloaded constructor
    public Student(String fname, String lname, double result) {
        firstName = fname;
        lastName = lname;
        examResult = result;
    }

    //overloaded constructor
    public Student(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String toString() {
        return "\nFirstName: " + this.firstName +"\nLastName: " +this.lastName +"\nExamResult: "+ this.examResult;

    }
}

public class JavaConstructors {

    public static void main(String[] args) {
        Student student1 = new Student("Max", "White", 10.0);
        System.out.println(student1);

        Student student2 = new Student();
        System.out.println(student2);
    }

}
