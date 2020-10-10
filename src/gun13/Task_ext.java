package gun13;

public class Task_ext {
    public static void main(String[] args) {
        int random = (int) (Math.random() * ((122-97)+1)) + 97;

        char harf =(char) random;

        System.out.println("harf : " +harf);
    }
}
