package gun42.task4;

import java.util.ArrayList;
import java.util.List;

//create class Student with five attributes(you can use student from task2)
//and extra three attributes as: List<Relative> relative, Status status, List<Lesson> lessons
public class Student {
    private String firstName;
    private String lastName;
    private List<Relative> relatives=new ArrayList<>();
    private Status status;
    private List<Lesson> lessons=new ArrayList<>();

    public Student(String firstName, String lastName, List<Relative> relatives, Status status, List<Lesson> lessons) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.relatives = relatives;
        this.status = status;
        this.lessons = lessons;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}