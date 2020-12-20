package gun45.tasks.task1;

import day45.tasks.task1.cat.Lion;
import day45.tasks.task1.cat.Tiger;

public class Zoo {

    public static void main(String[] args) {
        Tiger tiger = new Tiger(1,
                "Richard Parker",
                "gold/orange/black",
                3,
                Gender.MALE,
                "Bengal Tiger"
        );
        System.out.println(tiger);

        Lion lion = new Lion(2,
                "Aslan",
                "gold",
                5000,
                Gender.MALE,
                "Narnia"
        );
        System.out.println(lion);

    }
}
