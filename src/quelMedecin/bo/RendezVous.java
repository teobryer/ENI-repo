package quelMedecin.bo;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class RendezVous {

    private Creneau creneau;
    private Patient patient;
    private LocalDate date;

    public RendezVous(Creneau creneau, Patient patient, LocalDate date) {
        this.creneau = creneau;
        this.patient = patient;
        this.date = date;
    }

    public void afficher() {
        System.out.println("Rendez-vous du " + this.date.format(DateTimeFormatter.ofPattern
                ("dd MMMM yyyy", Locale.FRENCH))
                + " " + this.creneau.getHeureDebut().
                format(DateTimeFormatter.ofPattern("hh'h'mm")) + "-" +
                this.creneau.getHeureDebut().plusMinutes(this.creneau.getDuree()).
                        format(DateTimeFormatter.ofPattern("hh'h'mm")) + "(" +
                this.creneau.getDuree() + " minutes)\n" +
                "avec le Docteur " + this.creneau.getMedecin().getNom() + "\n" +
                "pour ");
        this.patient.afficher();
    }
}