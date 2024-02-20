public abstract class Personne { // extends Object

    private int age;
    private String prenom;
    private String nom;


    public Personne(){
        System.out.println("constructeur sans parametres");
    }

    public Personne(String prenom, String nom){
        this.prenom = prenom;
        this.nom = nom;
    }

    public void feterAnniversaire(){
        age = age + 1;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age > 0)
            this.age = age;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    @Override
    public String toString() {
        return "Personne{" +
                "age=" + age +
                ", prenom='" + prenom + '\'' +
                ", nom='" + nom + '\'' +
                '}';
    }
}
