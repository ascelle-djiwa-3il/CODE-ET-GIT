public class FactureManager {
    /**
     * Calcul le total d'une facture
     * @param type le type du produit
     * @param type la quantite du produit
     * @param type le prix d'un produit
     */
    
    public double calculerFacture(String typeProduit, int quantite, double prixUnitaire) {
        double total = quantite * prixUnitaire;

        // reduction selon la catégorie
        if (typeProduit.equals("Alimentaire")) {
            total -= total * 0.05; // Réduction de 5%
        } else if (typeProduit.equals("Electronique")) {
            total -= total * 0.1; // Réduction de 10%
        } else if (typeProduit.equals("Luxe")) {
            total -= total * 0.15; // Réduction de 15%
        }

        // Reduction sur le total
        if (total > 1000) {
            total -= total * 0.05; // Réduction supplémentaire de 5% pour les gros montants
        }

        return total;
    }
}
