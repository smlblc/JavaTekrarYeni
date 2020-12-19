package gun42.task3;

import java.util.ArrayList;
import java.util.List;

/*
Create class MyNumber with one attributes List<Integer> evenNumbers,
and make it read-only
 */
public class MyNumber {
    private List<Integer> evenNumbers;

    public MyNumber(List<Integer> evenNumbers) {
        this.evenNumbers = evenNumbers;
    }

    public List<Integer> getEvenNumbers() {
        List<Integer> aNewCopy = new ArrayList<>(evenNumbers); // *** ONEMLI ***
        return aNewCopy;
    }

    @Override
    public String toString() {
        return "MyNumber{" +
                "evenNumbers=" + evenNumbers +
                '}';
    }
}
