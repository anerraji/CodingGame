package treehouse;

import java.util.Arrays;

/**
 * Représente une grille de valeurs entières.
 */
public class Grid {

    int[][] map;
    int nbVisibleTrees;
    int highestScenicScore;

    /**
     * Constructeur par défaut de la grille.
     * Initialise la grille avec une taille de 0x0 et les valeurs par défaut des attributs.
     */
    public Grid() {
        this.map = new int[0][0];
        this.nbVisibleTrees = 0;
        this.highestScenicScore = 0;
    }

    /**
     * Constructeur de la grille avec la matrice donnée.
     *
     * @param map La matrice représentant la grille.
     */
    public Grid(int[][] map) {
        this.map = map;
        this.nbVisibleTrees = 0;
        this.highestScenicScore = 0;
    }

    /**
     * Constructeur de la grille avec la matrice et le nombre d'arbres visibles donnés.
     *
     * @param map             La matrice représentant la grille.
     * @param nbVisibleTrees  Le nombre d'arbres visibles dans la grille.
     */
    public Grid(int[][] map, int nbVisibleTrees) {
        this.map = map;
        this.nbVisibleTrees = nbVisibleTrees;
    }

    /**
     * Constructeur de la grille avec la matrice, le nombre d'arbres visibles et le score de paysage le plus élevé donnés.
     *
     * @param map                La matrice représentant la grille.
     * @param nbVisibleTrees     Le nombre d'arbres visibles dans la grille.
     * @param highestScenicScore Le score de paysage le plus élevé dans la grille.
     */
    public Grid(int[][] map, int nbVisibleTrees, int highestScenicScore) {
        this.map = map;
        this.nbVisibleTrees = nbVisibleTrees;
        this.highestScenicScore = highestScenicScore;
    }

    /**
     * Obtient la matrice représentant la grille.
     *
     * @return La matrice représentant la grille.
     */
    public int[][] getMap() {
        return map;
    }

    /**
     * Définit la matrice représentant la grille.
     *
     * @param map La matrice représentant la grille.
     */
    public void setMap(int[][] map) {
        this.map = map;
    }

    /**
     * Obtient le nombre d'arbres visibles dans la grille.
     *
     * @return Le nombre d'arbres visibles dans la grille.
     */
    public int getNbVisibleTrees() {
        return nbVisibleTrees;
    }

    /**
     * Définit le nombre d'arbres visibles dans la grille.
     *
     * @param nbVisibleTrees Le nombre d'arbres visibles dans la grille.
     */
    public void setNbVisibleTrees(int nbVisibleTrees) {
        this.nbVisibleTrees = nbVisibleTrees;
    }

    /**
     * Obtient le score de paysage le plus élevé dans la grille.
     *
     * @return Le score de paysage le plus élevé dans la grille.
     */
    public int getHighestScenicScore() {
        return highestScenicScore;
    }

    /**
     * Définit le score de paysage le plus élevé dans la grille.
     *
     * @param highestScenicScore Le score de paysage le plus élevé dans la grille.
     */
    public void setHighestScenicScore(int highestScenicScore) {
        this.highestScenicScore = highestScenicScore;
    }

    @Override
    public String toString() {
        return "Grid [map=" + Arrays.toString(map) + "]";
    }

}
