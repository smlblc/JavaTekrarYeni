package gun10;

import java.util.Scanner;

public class ElseStatement {
        /*
            Else if  -->> When your if statement is false then JAVA will look for the first else if statement
                    when your first else if is also false then JAVA will look next else if statement.
                    // if`in icindeki durum yanlis ise Java ilk else if statement`a bakar.
                    // Eger ilk else if statement dogru ise o ksiim calisir yanlis ise digerlerine bakar.

                    When the condition is correct JAVA will not look other else statements
                    // if`in icindeki durum dogru ise java baska yere bakmaz.

         */
    // NOTE you can have else if statement as much as you want
    // Istegimiz kadar else if kullanabiliriz.


    // JAVA WILL PRINT ALL THE CONDITIONS BECAUSE OF ALL OF THEM ARE TRUE

    public static void main(String[] args) {

        Scanner input = new Scanner( System.in );

        System.out.println( "enter name" );

        String name1 = input.nextLine();

        System.out.println( "enter name" );

        String name2 = input.nextLine();

        int total = name1.length() + name2.length();

        boolean anahtar = true;


        if(total > 15 && anahtar) { // && ve baglacimiz, 1 && 1 dogru, 1 && 0 , 0 && 1 veya 0 && 0 yanlis.

            System.out.println( "your string is too long ve anahtar dogrudur." );

        } else if(total > 10 || !anahtar) { // || veya baglaci. 0 || 1 , 1 || 0, 1 || 1 dogru - 0 || 0 yanlistir.)

            System.out.println( "Your string is okay veya anahtar yanlistir." );

        } else if(total > 5) {

            System.out.println( "your string is too short" );
        }

    }
}
