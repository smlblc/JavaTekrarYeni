package gun31.tasks.task2;

public class Task2 {

    public static void main(String[] args) {
        Student student1 = new Student("John", 20);
        // cannot change private field from different class
        //student1.name = "Max";
        System.out.println("Student1 before name update: " + student1);
        student1.updateName("Max");
        System.out.println("Student1 after name update: " + student1);

        Student student2 = new Student("Alice", 18);
        System.out.println(student2);
    }
}
