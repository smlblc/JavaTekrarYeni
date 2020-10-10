package gun13;

public class Task3 {
    // Write a java program which prints alphabet
    // constraints: lowercase letters // kisitlama: kucuk harfleri kullanalim
    // abcde... to z

    public static void main(String[] args) {
        // iterate a->z
        char letter = 'a';

        while(letter <= 'z') {
            System.out.print( letter );
            letter++;
        }

    }

}
