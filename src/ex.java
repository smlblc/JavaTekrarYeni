import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ex {


    static List<Integer> getIntListA(int[] ints){
        return Arrays.stream(ints).boxed().collect(Collectors.toList());
    }

    static ArrayList<Integer> getIntListB(int[] ints){
        return (ArrayList<Integer>) IntStream.of(ints).boxed().collect(Collectors.toList());
    }

    public static void main(String[] args) {
        System.out.println(getIntListA(new int[]{1,2,3,4,5}));
        System.out.println(getIntListB(new int[]{1,2,3,4,5}));
    }


}
