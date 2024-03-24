import java.util.*;

class Patient {
    private String nom;
    private Set<String> ordonnance;

    public Patient(String n) {
        nom = n.toLowerCase();
        ordonnance = new HashSet<>();
    }

    public String getNom() {
        return nom;
    }

    public boolean ordonnanceVide() {
        return ordonnance.isEmpty();
    }

    public void ajoutMedicament(String m) {
        ordonnance.add(m.toLowerCase());
    }

    public void affiche() {
        System.out.println("Nom du patient: " + nom);
        System.out.println("Ordonnance du patient: " + ordonnance);
    }

    public boolean contientMedicament(String m) {
        return ordonnance.contains(m.toLowerCase());
    }

    public void trieOrdonnance() {
        List<String> sortedList = new ArrayList<>(ordonnance);
        Collections.sort(sortedList);
        ordonnance = new LinkedHashSet<>(sortedList);
    }
}