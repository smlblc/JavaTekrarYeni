package gun47.tasks.task2;

import java.time.LocalDate;
import java.time.Month;

public class Zoo {

    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.setName("Petro");
        cat.setWild(false);
        cat.setDob(LocalDate.of(2018, Month.JUNE, 23));
        cat.setId(1);
        System.out.println(cat);

        Dog dog = new Dog();
        dog.setId(2);
        dog.setWild(false);
        dog.setDob(LocalDate.of(2015, 1,5));
        dog.setName("Haticko");
        System.out.println(dog);

    }
}
