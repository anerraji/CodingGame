package treehouse;

import java.io.IOException;


public class Main {

	public static void main(String[] args) 
	{
		// Création d'une instance de MatrixFileReader
	    MatrixFileReader reader = new MatrixFileReader();
	    
	    // Spécification du chemin du fichier contenant la matrice à lire
	    String filePath = "ressources/matrice.txt";
	    
	    try {
	        // Lecture de la matrice à partir du fichier en utilisant MatrixFileReader
	        int[][] map = reader.readMatrixFromFile(filePath);
	        
	        // Création d'un nouvel objet Grid avec la matrice d'arbres lue
	        Grid grid = new Grid(map, 0, 0);
	    	
	    	// Création d'une instance de CalculVisibleTrees
	    	CalculVisibleTrees calcul = new CalculVisibleTrees();
	    	
	    	// Calcul des arbres visibles dans la grille
	    	calcul.CalculeVisibleTrees(grid);
	    	
	    	// Affichage du nombre d'arbres visibles
	    	System.out.println("Nombre d'arbres visibles : " + grid.getNbVisibleTrees());
	    	
	    	// Création d'une instance de CalculHighestScenicScore
	    	CalculHighestScenicScore calculScore = new CalculHighestScenicScore();
	    	
	    	// Calcul du score de paysage le plus élevé dans la grille
	    	calculScore.CalculHighestScenicScore(grid);
	    	
	    	// Affichage du score de paysage le plus élevé
	    	System.out.println("Score panoramique le plus élevé : " + grid.highestScenicScore);

	    } catch (IOException e) {
	        e.printStackTrace();
	    }

	}

}
