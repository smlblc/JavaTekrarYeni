package gun29.tasks.task1;

public class Task1 {

    public static void main(String[] args) {

        Lesson math = createLesson("Math", 4, 96);
        Lesson physics = createLesson("Physics", 4, 95);
        Lesson science = createLesson("Science", 3, 100);
        Lesson computerScience = createLesson("Computer Science", 4, 100);
        Lesson chemistry = createLesson("Chemistry", 3, 95);


        Student student1 = new Student();
        student1.name = "John";
        student1.maxCredit = 5;
        student1.takeLesson(math);
        student1.takeLesson(physics);
        student1.takeLesson(computerScience);


        Student student2 = new Student();
        student2.name = "Max";
        student2.maxCredit = 7;
        student2.takeLesson(science);
        student2.takeLesson(chemistry);


    }

    public static Lesson createLesson(String name, int credit, double grade) {
        Lesson newLesson = new Lesson();
        newLesson.name = name;
        newLesson.credit = credit;
        newLesson.grade = grade;

        return newLesson;
    }
}
