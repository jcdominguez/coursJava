import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

public class RegistrePersonnesMap implements RegistrePersonnesInterface {

    private HashMap<Integer, Personne> personnes = new HashMap<>();
    private int compteurId;

    @Override
    public void ajouterPersonne(Personne personne) {
        compteurId++;
        personne.setId(compteurId);
        personnes.put(personne.getId(), personne);
    }

    @Override
    public List<Personne> listePersonnes() {
        return personnes.values().stream().collect(Collectors.toList());
    }

    @Override
    public void supprimerPersonne(int id) {
            personnes.remove(id);
    }
}
