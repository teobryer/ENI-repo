package reversi;

public enum Pion{
    LIBRE("."),
    BLANC("○"),
    NOIR("●");

    private String symbole ;
    private  int nombre = 2 ;

    private Pion(String symbole) {
        this.symbole = symbole ;

    }

    public String getSymbole() {
        return  this.symbole ;
    }

    public Pion autrePion() {
        if (this == NOIR) {
            return BLANC;
        }
        if (this == BLANC) {
            return NOIR;

        }
        return LIBRE;
    }

    public  void setNombre(int nombre) {
        this.nombre = nombre;
    }

    public  int getNombre() {
        return this.nombre;
    }

    public void setSymbole(String symbole) {
        this.symbole = symbole;
    }
}
