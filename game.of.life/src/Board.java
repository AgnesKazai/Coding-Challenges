/*Rules: 0 --> 3 live --> 1
         1 --> <2 or >3 --> */

import java.util.Random;

public class Board {

    private int rows;
    private int cols;
    private int[][] grid;
    private int[][] nextGrid;

    public Board() {
    }

    public Board(int rows, int cols) {
        this.rows = rows;
        this.cols = cols;
        make2DArrayWithRandomOneOrZero(rows, cols);
        nextGrid = new int[rows][cols];
    }

    public int getRows() {
        return rows;
    }

    public int getCols() {
        return cols;
    }

    public void setCols(int cols) {
        this.cols = cols;
    }

    public int[][] getGrid() {
        return grid;
    }

    public void setGrid(int[][] grid) {
        this.grid = grid;
    }

    public int[][] getNextGrid() {
        return nextGrid;
    }

    public void setNextGrid(int[][] nextGrid) {
        this.nextGrid = nextGrid;
    }

    public int[][] make2DArrayWithRandomOneOrZero(int rows, int cols) {
        grid = new int[rows][cols];
        Random rnd = new Random();
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                grid[i][j] = rnd.nextInt(2);
            }
        }
        return grid;
    }

    public void draw2DArray(int[][] matrix) {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }
    }
}