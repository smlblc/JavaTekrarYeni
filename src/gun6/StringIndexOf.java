package gun6;

public class StringIndexOf {

    /*
    indexOf()

    Returns the position of the first found
    occurrence of
    specified characters in a string

    String icerisinde aradigimiz bir karakterin ilk pozisyonunu verir.

    int
    */
    public static void main(String[] args) {
        String t1 = "Hello";
        System.out.println(t1.indexOf( 'l' ));

        String t2 = "Hello lol";
        System.out.println(t2.indexOf( 'l',4 ));

        String t3 = "Good morning mor!!!";
        System.out.println( t3.indexOf( "mor" ) );

        String t4 = "Good morning mor!!!";
        System.out.println( t4.indexOf( "mor", 7 ) );

        String t5 = "Good morning mor!!!";
        System.out.println( t5.indexOf( "mom", 7 ) ); // -1 bulamadi.

        String t6 = "Good morning Mor!!!";
        System.out.println( t6.indexOf( "Mo", 7 ) ); // 13
    }
}







