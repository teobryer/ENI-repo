package quelMedecin.bo;

import java.time.LocalTime;

public class Creneau {

    private LocalTime heureDebut;
    private int duree;
    private MedecinGeneraliste medecin;

    public Creneau(LocalTime heureDebut, int duree, MedecinGeneraliste medecin) {
        this.heureDebut = heureDebut;
        this.duree = duree;
        this.medecin = medecin;
        this.medecin.ajouterCreneau(this);
    }

    public void afficher() {
        System.out.println(heureDebut + " - " + heureDebut.plusMinutes(duree) + " (" + duree + " minutes)");
    }

    public MedecinGeneraliste getMedecin() {
        return medecin;
    }

    public LocalTime getHeureDebut() {
        return heureDebut;
    }

    public int getDuree() {
        return duree;
    }
}
