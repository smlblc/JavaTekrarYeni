package gun4;

public class JavaNarrowingCasting {
    //JavaCinsDaraltma
    //Narrowing Casting (Manual-elle) Genis bir Cinsi Kucuk Bir cinse cevirme
    //double -> float -> long -> int -> char -> short -> byte
    public static void main(String[] args) {
        double ondalikliSayi = 1.9;
        int tamSayi = (int) ondalikliSayi;
        System.out.println(ondalikliSayi);
        System.out.println(tamSayi);


    }
}
