import java.time.LocalDate;

public class DemoDates {

    LocalDate anniversaire;

    public void initialiser(){
        // obtenir la date de maintenant
        anniversaire = LocalDate.now();
        anniversaire = LocalDate.of(2023, 12, 30);
    }

}
