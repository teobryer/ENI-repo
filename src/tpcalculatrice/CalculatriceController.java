package tpcalculatrice;

public class CalculatriceController {

    public static int addition (int a, int b) throws  DepassementCapaciteException{
        int result = a + b;
        if( result !=  (long)a + (long)b) {
            throw  new DepassementCapaciteException(result);
        }
        return result;
    }

}