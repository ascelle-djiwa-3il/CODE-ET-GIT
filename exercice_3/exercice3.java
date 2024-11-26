public class StockManager {

    /**Gere le stock
     * @param type le type de l'opération
     * @param type la dénomination du produit
     * @param type la quantité du produit commandée
     * @param type la quantité du produit en stock
     * */ 
    public void gererStock(String typeOperation, String produit, int quantite, int stock) {
        
        Switch (typeOperation){
            case "ajout": // Ajout au stock
                ajouterStock(stock,quantite);
                System.out.println("Produit : " + produit + ", Stock après ajout : " + stock);
            case "retrait": // Retrait du stock
                retraitStock(stock,quantite);
                System.out.println("Produit : " + produit + ", Stock après retrait : " + stock);
            default: // Si l'action est inconnu
                System.out.println("Opération inconnue.");
        }
        
    }

    /**Ajoute un produit au stock
     * @param type la quantité du produit en stock
     * @param type la quantité du produit commandée
     */ 
    public void ajouterStock(int stock, int quantite){
        stock += quantite;
    }


    /**Retire un produit du stock
     * @param type la quantité du produit en stock
     * @param type la quantité du produit commandée(à retirer)
     */ 
    public void retraitStock(int stock, int quantite){
        if(stock>=quantite){
            stock-=quantite;
        }else{
            System.out.println("Stock insuffisant!");
        }
    }


}

