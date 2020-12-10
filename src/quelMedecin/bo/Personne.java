package quelMedecin.bo;

public class Personne{

    private String nom, prenom, numeroDeTelephone;
    private Adresse adresse;

    public Personne(String nom, String prenom, String numeroDeTelephone) {
        this.nom = nom;
        this.prenom = prenom;
        this.numeroDeTelephone = numeroDeTelephone;
    }

    public Personne(String nom, String prenom, String numeroDeTelephone, Adresse adresse) {
        this.nom = nom;
        this.prenom = prenom;
        this.numeroDeTelephone = numeroDeTelephone;
        this.adresse = adresse;
    }

    public void afficher() {
        System.out.println(this.nom + " " + this.prenom + "\n" + "Numéro de téléphone : " + this.numeroDeTelephone);
    }

    public void afficherAdresse() {
        if (this.adresse != null) {
            System.out.println("Adresse :");
            this.adresse.afficher();
        }
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public String getNumeroDeTelephone() {
        return numeroDeTelephone;
    }

    public void setNumeroDeTelephone(String numeroDeTelephone) {
        this.numeroDeTelephone = numeroDeTelephone;
    }

    public Adresse getAdresse() {
        return adresse;
    }

    public void setAdresse(Adresse adresse) {
        this.adresse = adresse;
    }
}
