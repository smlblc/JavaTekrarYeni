package gun19;

public class Task2 {
    // create a method which checks if length of string is at least 8 characters
    public static boolean checkLength(String str) {
        return str.length() >= 8;
    }

    // create a method which checks if character is letter
    public static boolean isLetter(char character) {
        character = Character.toLowerCase(character);
        return character >= 'a' && character <= 'z';
    }

    // create a method which counts letters in given string
    public static int letterCount(String str) {
        int counter = 0;

        char[] chars = str.toCharArray();
        for(char aChar : chars) {
            if(isLetter(aChar)) {
                counter++;
            }
        }

        return counter;
    }

//    public static int _letterCount(String str){
//        int counter = 0;
//        char[] chars = str.toCharArray();
//        for (char aChar : chars) {
//            if(isLetter(aChar)){
//                counter++;
//            }
//        }
//        return counter;
//    }

    // create a method which checks if character is digit
    public static boolean isDigit(char character) {
        return character >= '0' && character <= '9';
    }

    // create a method which counts digits in given string
    public static int digitCount(String str) {
        int counter = 0;

        char[] chars = str.toCharArray();
        for(char aChar : chars) {
            if(isDigit(aChar)) {
                counter++;
            }
        }

        return counter;
    }

//    Write a Java method to check whether a string is a valid password.
////    Password rules:
////    A password must have at least ten characters.
////    A password consists of only letters and digits.
////    A password must contain at least two digits.

    public static boolean validLength(String str, int minLength) {
        return str.length() >= minLength;
    }

    public static boolean isValidPassword(String password) {
        //    A password must have at least ten characters.
        if(!validLength(password, 10)) {
            return false;// if length is not valid return false
        }

        int length = password.length();

        int letterCount = letterCount(password);
        int digitCount = digitCount(password);

        //    A password must contain at least two digits.
        if(digitCount < 2) {
            return false; // if password has less than 2 digit
        }

        //    A password consists of only letters and digits.
        if(length != (letterCount + digitCount)) {
            return false;// if password contains something which is not letter of digit
        }

        return true; // if it passes through all conditions it means it's valid password
    }

    public static boolean isValid(String password) {
        return validLength(password, 10)
                && digitCount(password) >= 2
                && (password.length() == (digitCount(password) + letterCount(password)));
    }

    public static void main(String[] args) {

        System.out.println(isValidPassword("I1234LoveJava"));
        System.out.println(isValid("I1234LoveJava"));

    }
}
