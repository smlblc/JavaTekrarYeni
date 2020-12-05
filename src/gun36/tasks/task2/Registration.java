package gun36.tasks.task2;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Scanner;

//2. create class Registration, use Scanner to create users
public class Registration {

    public ArrayList<User> register() {
        ArrayList<User> users = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Provide name to register:");
        String name = scanner.nextLine();
        //3. add as many users as you want until you enter word "exit"
        while(!name.equalsIgnoreCase("exit")) {
            User user = new User(name);
            users.add(user);

            name = scanner.nextLine();
        }

        return users;
    }

    //4. print users who registered at first 10 seconds of any minute(Hint: sec <= 10)
    public void printHappyUsers(ArrayList<User> users) {
        System.out.println("Happy users, that receive giveaways are:");
        for(User user : users) {
            LocalDateTime registration = user.registration;
            if(registration.getSecond() <= 10) {
                System.out.println(user);
            }
        }
    }

}
