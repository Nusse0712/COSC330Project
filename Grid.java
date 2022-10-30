//Grid object is a 10 by 10 char grid that simulates the grid used in battleship 
public class Grid {
private char[][] grid;
String name; 
//constructor for grid calls the member function createGrid
public Grid(String name) {
	grid = createGrid(); 
	this.name = name; 
}

//function that creates the grid
public char[][] createGrid(){
	char grid[][] = new char[10][10]; 
	for(int i = 0; i < 10; i++) {
		for(int j = 0; j < 10; j++) {
			grid[i][j] = '~'; 
		}
	}
	 return grid; 
}
//fucntion that displays the grid
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
//function that returns the character based off the x and y values
public char getPoint(int x, int y) {
	return grid[x][y];
}
//function that sets the grid
public void setGrid(char[][] grid){
	this.grid = grid; 
}
//Function that returns the grid
public char[][] getGrid(){
	return grid; 
}
//Function that adds a H to the grid based of the x and y values
public void insertHitPoint(int x, int y){

	
	grid[x][y] = 'H';
}
//function that adds a M to the grid based off the x and y values 
public void insertMissPoint(int x, int y) {
	
	
	grid[x][y] = 'M';
}

}


