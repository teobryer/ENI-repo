package reversi;

public class PlateauReversi {

    private Pion caze[][] =  new Pion[8][8];
    public PlateauReversi() {
        for (int i=1 ; i<=8 ; i++) {
            for (int j=1 ; j<=8 ; j++) {
                caze[i-1][j-1] = Pion.LIBRE;
            }
        }
        caze[3][4] = Pion.NOIR;
        caze[4][3] = Pion.NOIR;
        caze[3][3] = Pion.BLANC;
        caze[4][4] = Pion.BLANC;
    }
    public void afficher() {
        System.out.println(Pion.BLANC.getNombre() + " " + Pion.BLANC.getSymbole());
        System.out.println(Pion.NOIR.getNombre() + " " + Pion.NOIR.getSymbole());

        System.out.println("  1 2 3 4 5 6 7 8");
        for (int i=1 ; i<=8 ; i++) {
            System.out.print(i + " ");
            for (int j=1 ; j<=8 ; j++) {
                System.out.print(this.caze[i-1][j-1].getSymbole() + " ");
            }
            System.out.println();
        }
    }

}
