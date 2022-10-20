import java.util.Scanner;

public class BottomGridController {
	
	Grid bottomGrid = new Grid("Bottom Grid");
	Scanner keyboard = new Scanner(System.in);
	Player player = new Player();
	
	boolean ready = false;
	
	public BottomGridController(Player p) {

		p.setBottomGrid(bottomGrid);

	}
		
	public int coordinateConvert(char c) {
		if(c == 'A')
			return 0;
		if(c == 'B')
			return 1;
		if(c == 'C')
			return 2;
		if(c == 'D')
			return 3;
		if(c == 'E')
			return 4;
		if(c == 'F')
			return 5;
		if(c == 'G')
			return 6;
		if(c == 'H')
			return 7;
		if(c == 'I')
			return 8;
		if(c == 'J')
			return 9;
		else 
			return -1;
	}
	
	
	public void insertShipPoint(int x, int y, char c) {
		bottomGrid.addShipPoint(x,y, c);
	}
	
	public void displayGrid(){
		bottomGrid.displayGrid();
	}
	
	
	public void setShips(Player p) {
		String letter;
		String direction;
		char c;
		int row;
		int column;
		
		int size;
		String name = " "; 
		char id;
		
		for(int j = 0; j < p.getNumberOfShips(); ++j) {
			
			size = p.getShip(j).getNumHoles();
			name = p.getShip(j).getBoatname();
			id = p.getShip(j).getShipID();
			p.getShip(j).setShipID(id);
			
			
			System.out.println("ENTER LETTER COLUMN TO PLACE " + name + " (size " + size + ")");
			
			do {
					letter = keyboard.next();
					c = letter.charAt(0);
						column = coordinateConvert(c);
						if(column == -1)
							System.out.print("Enter a valid column letter\n");
					}while(column == -1);
			
					
			System.out.println("ENTER ROW TO PLACE " + name);
					do {
						
						row = keyboard.nextInt();
						
						if(row > 9 || row < 0)
							System.out.print("Enter a valid row number\n");
						
					}while(row > 9 || row < 0);
					
			System.out.println("ENTER ORIENTATION. VERTICAL('V') or HORIZONTAL('H')");
					
					direction = keyboard.next();
					c = direction.charAt(0);
					
					
					if(c == 'V') {
						
						for(int i = 0; i < size; ++i) {
							insertShipPoint(row,column, id);
							if(row < size)
								row++;
							else
								row--;
							
						}
					}
					
					if(c == 'H') {
						//column = column - (size - i);
						
						for(int i = 0; i < size; ++i) {
						insertShipPoint(row, column, id);
							
						
						if(column < size)
							++column;
						else
							--column;
						
						}
					}
					
		}// end of for loop
		
		ready = true;
	}
	
	public void setShipCoords() {
			setShips(player);
		}
	
	
	public void initialize() {
		setShipCoords();
	}
	
	
}
