package locationcycle;

import java.sql.Date;
import java.time.LocalDate;
import java.util.Calendar;

public class Gyroroue extends CycleElectrique {

    private int autonomie;

    public Gyroroue(LocalDate dateAchat, String marque, String modele, int autonomie) {
        super(dateAchat, modele, marque, autonomie);
        super.setTarif(18.9);
    }

    @Override
    public String toString() {
        return "Gyroroue " + super.getMarque() + " " + getModele() + " "
                + "(" + LocalDate.now().minusYears(super.getDateAchat().getYear()).getYear() + " an) "
                + super.getAutonomie() + " kilomètres d'autonomie";
    }

    public int getAutonomie() {
        return autonomie;
    }
}
