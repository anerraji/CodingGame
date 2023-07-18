package treehouse;

/**
 * Calcule le nombre d'arbres visibles dans une grille.
 */

public class CalculVisibleTrees {
	
    /**
     * Calcule le nombre d'arbres visibles dans une grille donnée.
     *
     * @param grid La grille contenant les arbres.
     */

    public void CalculeVisibleTrees(Grid grid) {
        int nbVisibleTrees = grid.getNbVisibleTrees();
        int[][] map = grid.getMap();

        int numberOfRows = map.length; // Nombre de lignes
        int numberOfColumns = map[0].length; // Nombre de colonnes

        // Tous les arbres autour du bord de la grille sont visibles
        nbVisibleTrees = 2 * numberOfColumns + 2 * numberOfRows - 4;

        // Boucler sur tous les éléments de la matrice des arbres
        for (int i = 1; i < numberOfColumns - 1; i++) {
            for (int j = 1; j < numberOfRows - 1; j++) {
                int targetValue = map[i][j];

                // On boucle tant que l'arbre n'est pas visible d'un côté
                for (int p = 0; p < 4; p++) {
                    // Droite
                    int k = j + 1;
                    while (k < numberOfColumns && targetValue > map[i][k]) {
                        k++;
                    }

                    // Si l'arbre est visible
                    if (k == numberOfColumns) {
                        nbVisibleTrees++;
                        break; // On s'arrête car l'arbre est visible d'un côté
                    }

                    // Gauche
                    k = j - 1;
                    while (k >= 0 && targetValue > map[i][k]) {
                        k--;
                    }

                    // Si l'arbre est visible
                    if (k == -1) {
                        nbVisibleTrees++;
                        break;
                    }

                    // Bas
                    k = i + 1;
                    while (k < numberOfRows && targetValue > map[k][j]) {
                        k++;
                    }

                    // Si l'arbre est visible
                    if (k == numberOfRows) {
                        nbVisibleTrees++;
                        break;
                    }

                    // Haut
                    k = i - 1;
                    while (k >= 0 && targetValue > map[k][j]) {
                        k--;
                    }

                    // Si l'arbre est visible
                    if (k == -1) {
                        nbVisibleTrees++;
                        break;
                    }
                }
            }
        }

        grid.setNbVisibleTrees(nbVisibleTrees);
    }
}
