//Grid object is a 10 by 10 char grid that simulates the grid used in battleship 
public class Grid {
private char[][] grid;
String name; 
//constructor for grid calls the member function createGrid
public Grid(String name) {
	grid = createGrid(); 
	this.name = name; 
}


public char[][] createGrid(){
	char grid[][] = new char[10][10]; 
	for(int i = 0; i < 10; i++) {
		for(int j = 0; j < 10; j++) {
			grid[i][j] = '~'; 
		}
	}
	 return grid; 
}

public void displayGrid(){
	if(name != " ") {
		System.out.println("      "+name);
	}
	System.out.println("  A B C D E F G H I J");
	for(int i = 0; i < 10; i++) {
		System.out.print(i+ " ");
		for(int j = 0; j < 10; j++){
			System.out.print(grid[i][j]+" ");
		}
		System.out.println();
	}
}
public char getPoint(int x, int y) {
	return grid[x][y];
}

public void setGrid(char[][] grid){
	this.grid = grid; 
}

public char[][] getGrid(){
	return grid; 
}

public void insertHitPoint(int x, int y){
	grid[x][y] = 'H';
}

public void insertMissPoint(int x, int y) {
	grid[x][y] = 'M';
}

}


