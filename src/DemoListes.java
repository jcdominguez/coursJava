import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class DemoListes {

    List<Employe> employes = new LinkedList<>();

    public void addFichePersonnel(Employe employe){
            employes.add(employe);
    }

    public List<Employe> lireListeEmployes(){
            return employes;
    }
}
