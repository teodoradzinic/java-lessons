import java.util.Random;
import java.util.Scanner;

public class GameOfLife {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("The grid of the NxN size will be created. Insert the value of the N dimension:");
		int n = scan.nextInt();			//Width and length of the grid
		
		int grid[][] = new int[n][n];   //Creating an 2D array of the size NxN where the values of the original generation will be stored
		
		System.out.println("How many next generations should be created? Type the number:");
		int numGen = scan.nextInt();  	// Number of times a method should be repeated
		
		int genCount = 2; //Generation counter
		Random random = new Random();
		
		//Giving random values to the 0nth generation
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				float x = random.nextFloat();
				if (x <= 0.15f)
					grid[i][j] = 1;
				else
					grid[i][j] = 0;
			}
		}
		
		//Printing 0nth generation on the console
		System.out.println("First Generation");
		fillGrid(grid, n);
		
		//Method for creating next generation according to the rules
		nextGeneration(grid, n, numGen, genCount);
	}

	public static void fillGrid(int grid[][], int n) { //Method for printing a grid according to the values in the array
		for (int i = 0; i < n; i++) {
			System.out.print("|");
			for (int j = 0; j < n; j++) {

				if (grid[i][j] == 0) {
					System.out.print("   ");
				} else {
					System.out.print(" # ");
				}
			}
			System.out.println("|");
		}
	}

	public static void nextGeneration(int grid[][], int n, int numGen, int genCount) {
		if (numGen == 0) { //Exiting a program after the wanted number of generations is created
			System.exit(0);
		}
		int[][] futureGen = new int[n][n]; //New array for storing next generation

		//Loop through every cell in the grid
		for (int x = 0; x < n; x++) {
			for (int y = 0; y < n; y++) {
				// Finding number of neighbors that are alive
				int aliveNeighbors = countingNeighbors(grid, x, y, n);
				
				//Implementing the rules of life
				//Lonely -> dies
				if ((grid[x][y] == 1) && (aliveNeighbors < 2)) {
					futureGen[x][y] = 0;
				}
				//Overpopulation -> dies
				else if ((grid[x][y] == 1) && (aliveNeighbors > 3)) {
					futureGen[x][y] = 0;
				}
				//3 neighbors -> born new
				else if ((grid[x][y] == 0) && (aliveNeighbors == 3)) {
					futureGen[x][y] = 1;
				}
				//Remains the same
				else {
					futureGen[x][y] = grid[x][y];
				}
			}
		}
		//Printing a new generation
		System.out.println("Generation Number: " + genCount);
		fillGrid(futureGen, n);
		
		//Recursively obtaining new generations
		nextGeneration(futureGen, n, numGen - 1, genCount + 1);

	}
		//Method for counting the neighbors
	public static int countingNeighbors(int grid[][], int x, int y, int n) {
		int aliveNeighbors = 0; //Defining an variable for number of alive neighbors
		for (int i = -1; i < 2; i++) {  //Obtaining values from the 8 surrounding elements of a cell  //-1.-1  -1.0  -1.1
			for (int j = -1; j < 2; j++) {															  // 0.-1   0.0   0.1 
																									  // 1.-1   1.0   1.1
				//Calculation for the inclusion of all elements including also edge elements
				int col = (x + i + n) % n; 			//(0 - 1 + 10) % 10 = 9 -> Element with index 0 instead of going out of bound(-1) gets index 9
				int row = (y + j + n) % n;          //(9 + 1 + 10) % 10 = 0 -> Element with index 9 instead of going out of bound(10) gets index 0 
				
				//Getting a value from the cells
				aliveNeighbors += grid[col][row];	 
			}
		}
		//Subtraction of the middle cell
		aliveNeighbors -= grid[x][y];
		//Returning a value
		return aliveNeighbors;
	}
}
