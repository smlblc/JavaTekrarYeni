package gun30.tasks.task2;

import java.util.ArrayList;

/*
***part1***
create class Numbers
create method named as "checkEvenNumber"
which returns true if provided integer is even
 */
public class Numbers {

    public boolean checkEvenNumber(int number) {
        return number % 2 == 0;
    }

    /*
    ***part2***
    create method "evenNumbers" which will
    return all even number between 0 and 20
     */
    public ArrayList<Integer> evenNumbers() {
        ArrayList<Integer> result = new ArrayList<>();

        for(int i = 0; i <= 20; i++) {
            if(checkEvenNumber(i)) {
                result.add(i);
            }
        }

        return result;
    }
}
