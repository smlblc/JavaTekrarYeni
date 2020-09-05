package gun6;

public class StringConcat {
    // bir string baska bir stringe eklenir
    public static void main(String[] args) {
        String isim = "Can";

        // isim.concat( " " ).concat( "other string" ); putting space

        System.out.println( isim.concat( " mukemmel biridir." ) );

        System.out.println(
                isim + " is awesome!!!"
        );

    }
}
