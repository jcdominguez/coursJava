import java.util.ArrayList;
import java.util.List;

public interface RegistrePersonnesInterface {

    public void ajouterPersonne(Personne personne);
    public List<Personne> listePersonnes();

    public void supprimerPersonne(int id);
}
