import java.util.ArrayList;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        /*
        System.out.println("Hello world!");


        char uneLettre = 'b';

        char[] phrase = new char[10];
        phrase[0] = 'b';


        */

        Personne alain; // déclaration variable de type Objet. Par défaut valeur null
        alain = new Personne();
        alain.setAge(50);
        alain.setPrenom("Alain");
        alain.setNom("Dupont");
        System.out.println(alain.getNom());
        alain.feterAnniversaire();
        System.out.println(alain.getAge());

        Personne marie = new Personne();
        System.out.println(marie);
        marie.setPrenom("Marie");
        marie.setNom("Dufour"); ;
        marie.setAge(25);


        Personne alain2 = alain;
        alain = marie;

        System.out.println(alain.getPrenom());
        System.out.println(alain2.getPrenom());

        marie.setPrenom("Maria");
        System.out.println(marie.getPrenom());

        marie.setAge(-3);
        System.out.println(marie.getAge());

        String prenom = "Jean";
        System.out.println(prenom.length());

        // tableau
        Personne[] annuaire = new Personne[2];
        annuaire[0] = marie;
        annuaire[1] = alain;

        // liste : garantie l'ordre et accepte les doublons
        ArrayList<Personne> personnes = new ArrayList();
        personnes.add(alain);
        personnes.add(alain);
        System.out.println(personnes.size());

        // Set : pas de doublons, ordre non garantie
        HashSet<Personne> personneSet = new HashSet<>();
        personneSet.add(alain);
        personneSet.add(alain);
        System.out.println(personneSet.size());


        // exemple constructeur avec parametres
        Personne jean = new Personne("Jean", "Dominguez");
        System.out.println(jean.getPrenom() + " " + jean.getNom());

        // toString() est appellé automatiquement quand on execute un println()
        System.out.println(jean);
        System.out.println(jean.toString());

        Employe employe1 = new Employe();
        employe1.setPrenom("Toto");
        employe1.setDiplome("Ingénieur logiciel");

        System.out.println(employe1);
    }
}