public class GestionnaireNotes {

    /** Affiche note et moyennes
     * @param type le nom de l'étudiant
     * @param type les notes de l'étudiant sous forme de tableau
     */ 
    public void afficherNotesEtMoyenne(String nomEtudiant, int[] notes) {
        
        afficherNote(nomEtudiant, notes);
        
        // Calcul de la somme des notes
           int somme = sommeNote(notes);
        

        // Affichage de la moyenne
        double moyenne = moyenneNote(somme, notes);
        
        //Affichage de la moyenne
            System.out.println("Moyenne: "+ moyenne);
    }



    /** Affiche la note
     * @param type le nom de l'étudiant
     * @param type les notes de l'étudiant sous forme de tableau
*/ 
public void afficherNote(String nomEtudiant, int[] notes){
            // Affichage des notes
        System.out.println("Notes de " + nomEtudiant + ":");
        for (int note : notes) {
            System.out.println("- " + note);
        }

}

/**Calcule la somme
  * @param type les notes de l'étudiant sous forme de tableau
  */ 
public int sommeNote(int[] notes){
            int somme = 0;
            for (int note: notes){
                somme+=note;
            }
        return somme;
}

/**Calcule la moyenne
  *@param type la somme des notes 
  * @param type les notes de l'étudiant sous forme de tableau
  */ 
public double moyenneNote(int somme, int[] notes){
            double moyenne=(double)somme /notes.length;
        return moyenne;
}






}

