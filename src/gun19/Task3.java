package gun19;

public class Task3 {
    // create method that calculate sum of array
    public static int sumArrayValues(int[] array) {
        int result = 0;
        for(int number : array) {
            result += number;
        }
        return result;
    }

    //create method that calculate average of numbers in int array
    public static double averageArrayValue(int[] array) {
        int sum = sumArrayValues(array);
        int count = array.length;

        double average = (double) sum / count;
        return average;
    }

    //2. way
    public static double averageArrayValue2(int[] array) {
        return (double) sumArrayValues(array) / array.length;
    }
}
