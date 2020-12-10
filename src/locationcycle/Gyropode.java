package locationcycle;

import java.time.LocalDate;

public class Gyropode extends CycleElectrique {

    private int autonomie, tailleMinimale;

    public Gyropode(LocalDate dateAchat, String marque, String modele, int autonomie, int tailleMinimale) {
        super(dateAchat, modele, marque, autonomie);
        this.tailleMinimale = tailleMinimale;
        super.setTarif(29.9);
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + " " + super.getMarque() + " " + super.getModele()
                + " (" + LocalDate.now().minusYears(super.getDateAchat().getYear()).getYear() + " an)"
                + " " + this.autonomie + " kilomètres d'autonomie";
    }

    public int getAutonomie() {
        return autonomie;
    }

    public int getTailleMinimale() {
        return tailleMinimale;
    }
}
