package gun14;

public class Task5 {
    // Given a string print every character in new line
    // 01234
    // str = "Hello"
    // length = 5
    // H
    // e
    // l
    // l
    // o

    public static void main(String[] args) {
        String str = "Ola amigo";

        //        HARD CODE
//        System.out.println(str.charAt( 0 ));
//        System.out.println(str.charAt( 1 ));
//        System.out.println(str.charAt( 2 ));
//        System.out.println(str.charAt( 3 ));
//        System.out.println(str.charAt( 4 ));


        for(int index = 0; index < str.length(); index++) {
            System.out.println( str.charAt( index ) );
        }

    }

    // Scanner sc = new Scanner(System.in);
    //        System.out.print("String giriniz : ");
    //        String str = sc.nextLine();
    //
    //        System.out.println("String uzunlugu : " + str.length());
    //
    //        for (int i = 0; i < str.length(); i++) {
    //
    //            System.out.println(str.charAt(i));
    //
    //        }
}
