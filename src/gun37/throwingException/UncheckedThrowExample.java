package gun37.throwingException;

public class UncheckedThrowExample {

    //username should have at least length of 6
    public static void checkUsername(String username) {
        if(username == null) {
            throw new NullPointerException("username might not been initialized, please assign some value to it");
        }

        if(username.length() < 6) {
            throw new RuntimeException("username length is less than 6, please provide longer username");
        }
    }


    public static void main(String[] args) {
        String username = null;

        checkUsername(username);


        System.out.println("sign up successfully, you have good username");

    }
}
