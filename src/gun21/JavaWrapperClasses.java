package gun21;

public class JavaWrapperClasses {
    /*
byte
short
int
long
float
double
boolean
char
     */

    public static void main(String[] args) {
        // byte wrapper
        byte bytePrimitive = 15;
        Byte byteObject = bytePrimitive;

        //int wrapper
        int intPrimitive = 5;
        Integer integerObject = intPrimitive;
        integerObject = integerObject + 5;

        //short wrapper
        short shortPrimitive = 75;
        Short shortObject = shortPrimitive;

        //long wrapper
        long longPrimitive = 6L;
        Long longObject = longPrimitive;

        // float wrapper
        float floatPrimitive = 3.6f;
        Float floatObject = 3.6f;

        //  double wrapper
        double doublePrimitive = 6.3;
        Double doubleObject = 7.9;

        // boolean wrapper
        boolean booleanPrimitive = false;
        Boolean booleanObject = Boolean.TRUE;

        //  char wrapper
        char charPrimitive = 'A';
        Character characterObject = charPrimitive;

    }
}
