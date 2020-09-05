package gun6;


public class StringSubstring {
    /*
    substring()

    Extracts the characters from a string,
    beginning at a specified start position,
    and through the specified number of character

    Altdiziyi cikarmak icin kullanilir altdizinin ilk indexi ve altdixinin son karakterinin indexini belirtmemiz gerekir.
    Altdizyi string olarak geri verir.

    String
    */

    public static void main(String[] args) {
        String text = "Hello World";

        String lloTxt = text.substring ( 2, 5 );
        System.out.println( lloTxt );

        // Hello World
        // 01234567890

        String worldTxt = text.substring( 6 );
        System.out.println( worldTxt );
    }
}
