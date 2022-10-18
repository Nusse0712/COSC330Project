
public class Grid {
private char[][] grid;

public Grid() {
	grid = createGrid(); 
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
	for(int i = 0; i < 10; i++ ) {
		System.out.println(i+1);
		for(int j = 0; j < 10; j++){
			System.out.print(grid[i][j]+" ");
		}
		System.out.println(); 
	}
}

public void setGrid(char[][] grid){
	this.grid = grid; 
}

public char[][] getGrid(){
	return grid; 
}

}


