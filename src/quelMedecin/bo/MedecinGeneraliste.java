package quelMedecin.bo;

public class MedecinGeneraliste extends Personne {

    private static float tarif = 25;
    private Creneau creneaux[] = new Creneau[15];

    public MedecinGeneraliste(String nom, String prenom, String numeroDeTelephone) {
        super(nom, prenom, numeroDeTelephone);
    }

    public MedecinGeneraliste(String nom, String prenom, String numeroDeTelephone, Adresse adresse) {
        super(nom, prenom, numeroDeTelephone, adresse);
    }

    public MedecinGeneraliste(String nom, String prenom, String numeroDeTelephone, Adresse adresse, Creneau[] creneaux) {
        super(nom, prenom, numeroDeTelephone, adresse);
        this.creneaux = creneaux;
    }

    public void afficher() {
        super.afficher();
        System.out.println("Tarif : " + tarif + "€");
        if (super.getAdresse() != null) super.getAdresse().afficher();
        this.afficherCreneaux();
        super.afficherAdresse();
    }

    public void afficherCreneaux() {
        int i=0;
        while (i < this.creneaux.length && this.creneaux[i] != null) {
            creneaux[i].afficher();
            i++;
        }
    }

    public Object ajouterCreneau(Creneau creneau) {
        int i=0;
        while (this.creneaux[i] != null && i<this.creneaux.length) {
            i++;
        }
        this.creneaux[i] = creneau;
        return null;
    }

    public static void setTarif(float tarif) {
        MedecinGeneraliste.tarif = tarif;
    }
}
