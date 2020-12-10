package quelMedecin.bo;

public class MedecinSpecialiste extends MedecinGeneraliste {

    private String specialite;
    private float tarif;

    public MedecinSpecialiste(String nom, String prenom, String numeroDeTelephone, String specialite, float tarif) {
        super(nom, prenom, numeroDeTelephone);
        this.specialite = specialite;
        this.tarif = tarif;
    }

    public MedecinSpecialiste(String nom, String prenom, String numeroDeTelephone, Adresse adresse, String specialite, float tarif) {
        super(nom, prenom, numeroDeTelephone, adresse);
        this.specialite = specialite;
        this.tarif = tarif;
    }

    public MedecinSpecialiste(String nom, String prenom, String numeroDeTelephone, Adresse adresse, Creneau[] creneaux, String specialite, float tarif) {
        super(nom, prenom, numeroDeTelephone, adresse, creneaux);
        this.specialite = specialite;
        this.tarif = tarif;
    }

    public void afficher() {
        System.out.println(super.getNom() + " " + super.getPrenom() + "\n" +
                "Téléphone : " + super.getNumeroDeTelephone() +"\n" +
                "Spécialité : " + getSpecialite() + "\n" +
                "Tarif : " + this.tarif + "€");
        super.afficherAdresse();
        super.afficherCreneaux();
    }

    public String getSpecialite() {
        return specialite;
    }
}
