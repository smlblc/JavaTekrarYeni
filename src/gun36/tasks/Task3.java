package gun36.tasks;

public class Task3 {
    //given array of {"Hi", "Hello", null}
    //print last letter of each word

    public static void main(String[] args) {
        String[] words = {"Hi", "Hello", null, "Techno", "Study", "Idea"};

        for(String word : words) {
            try {
                System.out.println(word.substring(word.length() - 1));
            } catch(Exception ex) {
                System.out.println("You have null in your array");
            }
        }
    }
}
