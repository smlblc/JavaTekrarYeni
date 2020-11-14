package gun29.tasks.task1;

import java.util.ArrayList;

public class Student {
    String name;
    int maxCredit;
    ArrayList<Lesson> lessons = new ArrayList<>();

    void takeLesson(Lesson lesson) {
        // calculate how many credits we have currently
        int currentTotalCredit = 0;
        for(Lesson lsn : lessons) {
            currentTotalCredit += lsn.credit;
        }

        // control maximum credit that student can have
        if(currentTotalCredit + lesson.credit <= maxCredit) {
            lessons.add(lesson);
        } else {
            System.out.println("You've already taken to many lessons!!! You cannot add "+lesson.name);
        }

    }

}
