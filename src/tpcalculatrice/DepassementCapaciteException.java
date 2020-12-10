package tpcalculatrice;

public class DepassementCapaciteException  extends Exception{
    public DepassementCapaciteException(long result) {
        super(result +" dépasse la capacité d'un int");
    }
}
