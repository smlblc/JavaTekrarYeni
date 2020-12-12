package gun37.throwingException;

public class Ex1 {

    //application that check age
    //if your age is below 20, it is not valid
    public static void main(String[] args) {

        int age = 10;

        if(age < 20) {
//            System.out.println("Your age is not valid");
            RuntimeException ageIsNotValid = new RuntimeException("Age is not valid, your age should be above 19");
            throw ageIsNotValid;
        } else {
            System.out.println("Welcome to driver examination");
        }


    }
}
