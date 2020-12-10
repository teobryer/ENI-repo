package locationcycle;

import java.time.LocalDate;

public abstract class Cycle {

    private String marque, modele;
    private LocalDate dateAchat;
    private double tarif;

    public Cycle(LocalDate dateAchat, String marque, String modele) {
        this.marque = marque;
        this.modele = modele;
        this.dateAchat = dateAchat;
    }

    public String getMarque() {
        return marque;
    }

    public String getModele() {
        return modele;
    }

    public LocalDate getDateAchat() {
        return dateAchat;
    }

    public  double getTarif() {
        return tarif;
    }

    public  void setTarif(double tarif) {
        this.tarif = tarif;
    }

    public abstract String toString();
}
