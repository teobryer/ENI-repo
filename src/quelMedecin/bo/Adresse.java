package quelMedecin.bo;

public class Adresse {

    private String mentionsComplementaires, typeEtNomDeVoie, ville, ajout;
    private int numero, codePostal;

    public Adresse(String mentionsComplementaires, int numero, String ajout, String typeEtNomDeVoie, int codePostal, String ville) {
        this.mentionsComplementaires = mentionsComplementaires;
        this.ajout = ajout;
        this.typeEtNomDeVoie = typeEtNomDeVoie;
        this.ville = ville;
        this.numero = numero;
        this.codePostal = codePostal;
    }

    public Adresse(int numero, String ajout, String typeEtNomDeVoie, int codePostal, String ville) {
        this.mentionsComplementaires = null;
        this.ajout = ajout;
        this.typeEtNomDeVoie = typeEtNomDeVoie;
        this.ville = ville;
        this.numero = numero;
        this.codePostal = codePostal;
    }

    public void afficher() {
        if (mentionsComplementaires != null) System.out.println(mentionsComplementaires);
        System.out.println(numero + (ajout != null ? ajout : "") + " " + typeEtNomDeVoie);
        System.out.println(codePostal + " " + ville);
    }
}