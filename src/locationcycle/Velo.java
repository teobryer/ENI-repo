package locationcycle;

import java.time.LocalDate;

public class Velo extends Cycle {

    private int nbVitesses;

    public Velo(LocalDate dateAchat, String marque, String modele, int nbVitesses) {
        super(dateAchat, modele, marque);
        this.nbVitesses = nbVitesses;
        super.setTarif(4.90);
    }

    @Override
    public String toString() {
        return "Vélo " + super.getMarque() + " " + getModele() + " "
                + "(" + LocalDate.now().minusYears(super.getDateAchat().getYear()).getYear() + " an) "
                + getNbVitesses() + " vitesses";
    }

    public int getNbVitesses() {
        return nbVitesses;
    }
}
