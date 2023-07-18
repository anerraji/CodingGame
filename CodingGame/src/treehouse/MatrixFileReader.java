package treehouse;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * Lit une matrice à partir d'un fichier.
 */

public class MatrixFileReader {
	
    /**
     * Lit une matrice à partir d'un fichier spécifié.
     *
     * @param filePath Le chemin du fichier contenant la matrice.
     * @return Une matrice d'entiers représentant les données lues à partir du fichier.
     * @throws IOException Si une erreur se produit lors de la lecture du fichier.
     */
	
    public static int[][] readMatrixFromFile(String filePath) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(filePath));
        
        // Compter le nombre de lignes et de colonnes
        int numRows = 0;
        int numCols = 0;
        
        String line;
        while ((line = reader.readLine()) != null) {
            numRows++;
            numCols = line.length();
        }
        
        // Réinitialiser le lecteur de fichier
        reader.close();
        reader = new BufferedReader(new FileReader(filePath));
        
        // Créer la matrice
        int[][] matrix = new int[numRows][numCols];
        
        // Lire les données du fichier et les stocker dans la matrice
        int row = 0;
        while ((line = reader.readLine()) != null) {
            for (int col = 0; col < numCols; col++) {
                char c = line.charAt(col);
                matrix[row][col] = Character.getNumericValue(c);
            }
            row++;
        }
        
        // Fermer le lecteur de fichier
        reader.close();
        
        return matrix;
    }
    
}
