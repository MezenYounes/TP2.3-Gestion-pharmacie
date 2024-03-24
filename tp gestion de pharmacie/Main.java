import java.util.Collection;
public class Main {
    public static void main(String[] args) {
    
        DossierPharmacie pharmacie = new DossierPharmacie("MaPharmacie");

        pharmacie.nouveauPatient("Mezen", new String[]{"Paracetamol", "Aspirine"});
        pharmacie.nouveauPatient("aziz", new String[]{"Ibuprofene"});
        pharmacie.nouveauPatient("mayssem", new String[]{"Paracetamol", "Aspirine", "Ibuprofene"});

        pharmacie.affiche();

        System.out.println("Ajout de médicament à sahar: " + pharmacie.ajoutMedicament("sahar", "Vitamine C"));
        System.out.println("Ajout de médicament à karem (patient inexistant): " + pharmacie.ajoutMedicament("karem", "Vitamine C"));

        pharmacie.affiche();

        System.out.println("Patients prenant du Paracetamol: " + pharmacie.affichePatientAvecMedicament("Paracetamol"));
    }
}
