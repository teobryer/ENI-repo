package locationcycle;

import java.time.LocalDate;

public abstract class CycleElectrique extends Cycle {

    private int autonomie;

    public CycleElectrique(LocalDate dateAchat, String marque, String modele, int autonomie) {
        super(dateAchat, marque, modele);
        this.autonomie = autonomie;
    }

    public abstract String toString();

    public int getAutonomie() {
        return autonomie;
    }
}
