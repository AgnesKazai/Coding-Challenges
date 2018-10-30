public class Game {

    private Board board;

    public Game() {
    }

    public Game(int rows, int cols) {
        this.board = new Board(rows, cols);
        System.out.println("1. generation:");
        board.draw2DArray(board.getGrid());
        nextGeneration(board.getGrid(), board.getNextGrid());
    }

    public int countNeighbours(int[][] grid, int x, int y) {
        int sum = 0;
        for (int i = -1; i < 2; i++) {
            for (int j = -1; j < 2; j++) {
                int row = (x + i + board.getRows()) % board.getRows();
                int col = (y + j + board.getCols()) % board.getCols();
                sum += grid[row][col];
            }
        }
        sum -= grid[x][y];
        return sum;
    }
    public int[][] calculateNextGrid(int[][] grid, int[][] nextGrid) {
        for (int i = 0; i < board.getRows(); i++) {
            for (int j = 0; j < board.getCols(); j++) {
                int state = grid[i][j];
                int neighbours = countNeighbours(grid, i, j);
                if (state == 0 && neighbours == 3) {
                    nextGrid[i][j] = 1;
                } else if (state == 1 && (neighbours > 3 || neighbours < 2)) {
                    nextGrid[i][j] = 0;
                } else {
                    nextGrid[i][j] = state;
                }
            }
        }
        return nextGrid;
    }
    public void nextGeneration(int[][] grid, int[][] nextGrid) {
        boolean next = true;
        for (int i = 2; i < 5; i++) {
            if (next) {
                System.out.println(i + ". generation:");
                board.draw2DArray(calculateNextGrid(grid, nextGrid));
                next = false;
            } else {
                System.out.println(i + ". generation:");
                board.draw2DArray(calculateNextGrid(nextGrid, grid));
                next = true;
            }
        }
    }
}


