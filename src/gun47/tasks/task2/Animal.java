package gun47.tasks.task2;

import java.time.LocalDate;
import java.time.Period;

public abstract class Animal {
    private long id;
    private String name;
    private boolean wild;
    private LocalDate dob;

    //what is favorite meal
    public abstract String food();

    //how many kg does animal eats
    public abstract double eat();

    //how long does animal sleep
    public abstract int sleep();

    //what sound does animal produce
    public abstract String greeting();

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isWild() {
        return wild;
    }

    public void setWild(boolean wild) {
        this.wild = wild;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    public int getAge() {
        return Period.between(dob, LocalDate.now()).getYears();
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() +
                "\nid=" + id +
                "\nname=" + name +
                "\nwild=" + wild +
                "\ndob=" + dob +
                "\nage=" + getAge();
    }
}
