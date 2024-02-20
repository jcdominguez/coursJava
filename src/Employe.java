public class Employe extends Personne {

    private String numeroSecuriteSociale;
    private String diplome;

    public Employe(String prenom, String nom) {
        super(prenom, nom);
    }

    public Employe() {
    }

    public Employe(String prenom, String nom, String numeroSecuriteSociale, String diplome){
        super(prenom, nom);

        this.numeroSecuriteSociale = numeroSecuriteSociale;
        this.diplome = diplome;
    }

    public String getNumeroSecuriteSociale() {
        return numeroSecuriteSociale;
    }

    public void setNumeroSecuriteSociale(String numeroSecuriteSociale) {
        this.numeroSecuriteSociale = numeroSecuriteSociale;
    }

    public String getDiplome() {
        return diplome;
    }

    public void setDiplome(String diplome) {
        this.diplome = diplome;
    }

    @Override
    public String toString(){
        return "Employe : "+ "numero secu: "+this.numeroSecuriteSociale
                + "diplome: "+ this.diplome
                + super.toString();
    }

    public void declinerIdentite(){
        System.out.println("Je suis un employé. je m'appelle "+getPrenom()+" "+getNom());
    }
}
