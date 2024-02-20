public class Employe extends Personne {

    private String numeroSecuriteSociale;
    private String diplome;



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
        return "Employe : "+ "numeero secu: "+this.numeroSecuriteSociale
                + "diplome: "+ this.diplome
                + super.toString();
    }
}
