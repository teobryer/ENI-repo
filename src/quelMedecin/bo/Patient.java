package quelMedecin.bo;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Patient extends Personne {
    private char sexe;
    private long numeroSecuriteSociale;
    private LocalDate dateDeNaissance;
    private String commentaire;

    public Patient(String nom, String prenom, String numeroDeTelephone, char sexe, long numeroSecuriteSociale, LocalDate dateDeNaissance, String commentaire) {
        super(nom, prenom, numeroDeTelephone);
        this.sexe = sexe;
        this.numeroSecuriteSociale = numeroSecuriteSociale;
        this.dateDeNaissance = dateDeNaissance;
        if (commentaire != null)
            this.commentaire = commentaire;
        else
            this.commentaire = "[Pas de commentaires]";
    }

    public Patient(String nom, String prenom, String numeroDeTelephone, char sexe, long numeroSecuriteSociale, LocalDate dateDeNaissance, String commentaire, Adresse adresse) {
        super(nom, prenom, numeroDeTelephone, adresse);
        this.sexe = sexe;
        this.numeroSecuriteSociale = numeroSecuriteSociale;
        this.dateDeNaissance = dateDeNaissance;
        if (commentaire != null)
            this.commentaire = commentaire;
        else
            this.commentaire = "[Pas de commentaires]";
    }

    public void afficher() {
        System.out.println(super.getNom() + " " + super.getPrenom() + "\n" +
                "Numéro de téléphone : " + super.getNumeroDeTelephone());
        System.out.println("Sexe : " + sexe + "\n" +
                "Numéro de sécurité sociale : " + numeroSecuriteSociale + "\n" +
                "Date de naissance : " + dateDeNaissance.format(DateTimeFormatter.ofPattern("dd MMMM yyyy", Locale.FRENCH)) + "\n" +
                "Commentaires : " + commentaire);
        super.afficherAdresse();
    }
}
