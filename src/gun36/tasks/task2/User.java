package gun36.tasks.task2;

import java.time.LocalDateTime;

/*
1. create class User with 2 field: name and registration(LocalDateTime)
 */
public class User {
    public String name;
    public LocalDateTime registration;

    public User(String name) {
        this.name = name;
        this.registration = LocalDateTime.now();
    }

    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", registration=" + registration +
                '}';
    }
}
