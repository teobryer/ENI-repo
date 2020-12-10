package tpcalculatrice;

public class Operation {

    public static int addition(int a, int b) throws DepassementCapaciteException {
        int result = a + b;
        if (result != (long) a + (long) b) {
            throw new DepassementCapaciteException((long) a + (long) b);
        }
        return result;
    }

    public static int soustraction(int a, int b) throws DepassementCapaciteException {
        int result = a - b;
        if (result != (long) a - (long) b) {
            throw new DepassementCapaciteException((long) a - (long) b);
        }
        return result;
    }

    public static int mutliplication(int a, int b) throws DepassementCapaciteException {
        int result = a * b;
        if (result != (long) a * (long) b) {
            throw new DepassementCapaciteException((long) a * (long) b);
        }
        return result;
    }

    public static int division(int a, int b){
        int result = a / b;

        return result;
    }

    public static int reste(int a, int b){
        int result = a % b;

        return result;
    }


}
