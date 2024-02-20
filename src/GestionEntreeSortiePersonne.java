public class GestionEntreeSortiePersonne {

    RegistrePersonnesInterface registrePersonnes;

    public GestionEntreeSortiePersonne(RegistrePersonnesInterface registrePersonnes){
        this.registrePersonnes = registrePersonnes;
    }

    public void personneQuiRentre(Personne personne){

        registrePersonnes.ajouterPersonne(personne);
    }

    public void personneQuiSort(Personne personne){
        registrePersonnes.supprimerPersonne(personne.getId());
    }

    public boolean resteTilUnePersonneDansLeBatiment(){
        return registrePersonnes.listePersonnes().size() > 0;
    }
}
