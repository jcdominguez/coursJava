public class IntervenantExterne extends Personne {

    private String societeSousTraitante;

    public String getSocieteSousTraitante() {
        return societeSousTraitante;
    }

    public void setSocieteSousTraitante(String societeSousTraitante) {
        this.societeSousTraitante = societeSousTraitante;
    }

    public void declinerIdentite(){
        System.out.println("Je suis un intervenant externe. je m'appelle "+getPrenom()+" "+getNom()
                + " je travaille pour "+societeSousTraitante);
    }
}
