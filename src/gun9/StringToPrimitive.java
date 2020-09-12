package gun9;

public class StringToPrimitive {

    public static void main(String[] args) {
        // string to double
        double d1 = Double.parseDouble( "10.22" );
        double d2 = Double.valueOf( "10.22" );
        System.out.println( "doubles: " + (d1 == d2) );

        // string to float
        float f1 = Float.parseFloat( "8.99" );
        float f2 = Float.valueOf( "8.99" );
        System.out.println( "floats: " + (f1 == f2) );

        // string to integer
        int i1 = Integer.parseInt( "65" );
        int i2 = Integer.valueOf( "65" );
        System.out.println( "integers: " + (i1 == i2) );

        // string to boolean
        boolean b1 = Boolean.parseBoolean( "true" ); // true
        boolean b2 = Boolean.valueOf( "TrUe" );  // true
        System.out.println( "booleans: " + (b1 == b2) );

    }

}
