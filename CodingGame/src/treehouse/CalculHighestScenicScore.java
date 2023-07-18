package treehouse;


/**
 * Calcule le score panoramique le plus élevé dans une grille d'arbres.
 */

public class CalculHighestScenicScore {
	
    /**
     * Calcule le score panoramique le plus élevé dans une grille donnée.
     *
     * @param grid La grille d'arbres.
     */

    public void CalculHighestScenicScore(Grid grid) {
        int[][] map = grid.getMap();
        int highestScenicScore = grid.getHighestScenicScore();

        int numberOfRows = map.length; // Nombre de lignes
        int numberOfColumns = map[0].length; // Nombre de colonnes
        int scenicGauche = 0, scenicDroite = 0, scenicHaut = 0, scenicBas = 0;
        int tempScenic;

        // Boucler sur tous les éléments de la matrice des arbres sauf les éléments
        // dans les côtés car ils ont 0 comme scenic score
        for (int i = 1; i < numberOfColumns - 1; i++) {
            for (int j = 1; j < numberOfRows - 1; j++) {
                int targetValue = map[i][j];

                // Droite
                int k = j + 1;
                while (k < numberOfColumns && targetValue > map[i][k]) {
                    scenicDroite++;
                    k++;
                }

                if (k < numberOfColumns)
                    scenicDroite++;

                // Gauche
                k = j - 1;
                while (k >= 0 && targetValue > map[i][k]) {
                    scenicGauche++;
                    k--;
                }

                if (k >= 0)
                    scenicGauche++;

                // Bas
                k = i + 1;
                while (k < numberOfRows && targetValue > map[k][j]) {
                    scenicBas++;
                    k++;
                }

                if (k < numberOfRows)
                    scenicBas++;

                // Haut
                k = i - 1;
                while (k >= 0 && targetValue > map[k][j]) {
                    scenicHaut++;
                    k--;
                }

                if (k >= 0)
                    scenicHaut++;

                // Affectation du scenic score
                tempScenic = scenicDroite * scenicGauche * scenicBas * scenicHaut;
                if (highestScenicScore < tempScenic)
                    highestScenicScore = tempScenic;

                // Réinitialisation des variables
                scenicDroite = 0;
                scenicGauche = 0;
                scenicBas = 0;
                scenicHaut = 0;
            }
        }

        grid.setHighestScenicScore(highestScenicScore);
    }
}
