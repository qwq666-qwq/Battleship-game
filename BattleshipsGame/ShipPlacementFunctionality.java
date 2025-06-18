import java.util.Scanner;

/**
 * Write a description of class ShipPlacementFunctionality here.
 * 
 * @author (Zoia Ilina) 
 * @version (19.06.2025)
 */

public class ShipPlacementFunctionality {

    static final int GRID_SIZE = 10;
    static final char WATER = '~';
    static final char SHIP = 'S';
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        char[][] playerGrid = initializeGrid();

        System.out.println("Battleship Ship Placement");
        
        placeShipManually(playerGrid, 5);
        placeShipManually(playerGrid, 4); 
        placeShipManually(playerGrid, 3);

        System.out.println("=Final Grid=");
        printGrid(playerGrid);
    }
