package gun33.javaEnum.ex1;

public class Ex1 {

    // There's a enum keyword and Enum class. They both appeared in Java 5.
    //September 30, 2004
    //J2SE 5.0. The release on September 30, 2004 was originally numbered 1.5, which is still used as the internal version number.


    public static void main(String[] args) {
        User user1 = new User();
        user1.role = Role.ADMIN;
        user1.status = Status.ACTIVE;
    }
}
