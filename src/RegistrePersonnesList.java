import java.util.ArrayList;
import java.util.List;

public class RegistrePersonnesList implements RegistrePersonnesInterface {

    private ArrayList<Personne> personnes = new ArrayList<>();
    private int compteurId;

    @Override
    public void ajouterPersonne(Personne personne) {
        compteurId++;
        personne.setId(compteurId);
        personnes.add(personne);
    }

    @Override
    public ArrayList<Personne> listePersonnes() {
        return personnes;
    }

    @Override
    public void supprimerPersonne(int id) {
        for(Personne personne : personnes){
            if(personne.getId() == id){
                personnes.remove(personne);
                break;
            }
        }
    }
}
