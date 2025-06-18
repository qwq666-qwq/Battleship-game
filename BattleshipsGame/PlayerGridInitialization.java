public class PlayerGridInitialization {
   static final int ROWS = 10;
   static final int COLS = 10;
   
   public static void mai(String[] args) {
       char [][] player1Grid = createGrid();
       char [][] player2Grid = createGrid();
       
       System.out.println("Player 1 Grid:");
       printGrid(player1Grid);
       
       System.out.println("\nPlayer 2 Grid:");
        printGrid(player2Grid);
   }
   public static char [][] createGrid() {
       char[][] grid = new char[ROWS][COLS];
        for (int i = 0; i < ROWS; i++) {
            for (int j = 0; j < COLS; j++) {
                grid[i][j] = '~';
            }
   }
   return grid;
}
public static void printGrid(char[][] grid) {
    System.out.print("  ");
        for (int i = 0; i < COLS; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i = 0; i < ROWS; i++) {
            System.out.print(i + " ");
            for (int j = 0; j < COLS; j++) {
                System.out.print(grid[i][j] + " ");
            }
            System.out.println();
        }
    }
}