import java.util.Scanner;

public class TopGridController {
	
	Grid topGrid = new Grid("Top Grid");
	Player player = new Player();
	Scanner keyboard = new Scanner(System.in);
	
	public TopGridController(Player p) {
		p.setTopGrid(topGrid);
	}
	
	public void displayGrid() {
		topGrid.displayGrid();
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
	
	//move this to player?
	public boolean checkShot(int x, int y, Player p) { //Opposing player  
		
		if(p.getBottomGrid().getPoint(x, y) != '~')
			return true;
		else
			return false;
	}
	
	public void shoot(int x, int y, Player p) {
		if(checkShot(x, y, p)) {
			topGrid.insertHitPoint(x, y);
		}else
			topGrid.addMissPoint(x, y);
		
	}
	
	
	public void sendShot(Player p) {
		
		
		String letter;
		char c;
		int row;
		int column;
		
			
			System.out.println("ENTER LETTER COLUMN TO SHOOT AT");
			
			do {
					letter = keyboard.next();
					c = letter.charAt(0);
						column = coordinateConvert(c);
						if(column == -1)
							System.out.print("Enter a valid column letter\n");
					}while(column == -1);
			
					
			System.out.println("ENTER NUMBER ROW TO SHOOT AT");
					do {
						
						row = keyboard.nextInt();
						
						if(row > 9 || row < 0)
							System.out.print("Enter a valid row number\n");
						
					}while(row > 9 || row < 0);
				
				shoot(row, column, p);
		
	}
	
}
