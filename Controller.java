import java.io.IOException;
import java.util.Scanner;

public class Controller {
	private Player player; 
	private Role role1; 
	private int xShot;
	private int yShot;
	
	Scanner keyboard = new Scanner(System.in); 
	
	//constructor for the controller 
	public Controller(String choice){
		player = new Player(); 
		
		if(choice.equalsIgnoreCase("Server")){
			role1 = new Server(); 
		}else {
			role1 = new Client();
		}
		
	}
	
	public void displayBottomGrid(){
		Grid tempGrid = player.getBottomGrid(); 
		tempGrid.displayGrid();
	}
	
	public void displayTopGrid() {
		Grid tempGrid = player.getTopGrid();
		tempGrid.displayGrid();
	}
	
	public void display(){
		displayTopGrid(); 
		displayBottomGrid(); 
	}
	//set Ships function. just sets the ships 
	public void setShips(){
		String letter; 
		String direction; 
		char c; 
		int row; 
		int Originalrow = -1; 
		int Originalcolumn = -1; 
		int column = -1;
		
		int size; 
		String name = " "; 
		char id; 
		Ship[] tempShips = player.getShip();
		for(int j = 0; j < player.getNumberOfShips();j++){
			size = tempShips[j].getNumHoles(); 
			name = tempShips[j].getBoatname(); 
			id = tempShips[j].getShipID(); 
			
			System.out.println("ENTER A COLUMN TO PLACE "+name+" (size: "+size+")"); 
			do {
				letter = keyboard.next(); 
				c = letter.charAt(0); 
				Originalcolumn = coordinateConvert(c); 
				if(Originalcolumn == -1) {
					System.out.println("ENTER A VALID COLUMN LETTER");
				}
				
			}while((Originalcolumn == -1));
			System.out.println("ENTER A ROW "); 
			do {
				Originalrow = keyboard.nextInt(); 
				
				if(Originalrow > 9 || Originalrow <0){
					System.out.println("Please print a valid row"); 
				}
				
				
			}while((Originalrow > 9 || Originalrow < 0));
			
			System.out.println("ENTER ORIENTATION. V for VERTICAL or H for Horizontal"); 
			
			direction = keyboard.next(); 
			c = direction.charAt(0); 
			
			if(c=='V'){
				row = Originalrow;
				for(int i = 0; i < size; ++i ){
					if(row > 9){
						row = Originalrow - (size - i);
					}
					insertShipPoint(row,Originalcolumn,tempShips[j].getShipID());
					
						row++;
					
				}
				
			}
			if(c=='H') {
				column = Originalcolumn;
				for(int i = 0; i < size; ++i ){
					if(column > 9){
						column = Originalcolumn - (size - i);
					}
					insertShipPoint(Originalrow,column,tempShips[j].getShipID());
					
				    column++;
					
				}
				
			}
			
			
		display();	
		}
		//needs a function to tell the other roll they are ready 
	}
	
	
	public void insertShipPoint(int x, int y, char c){
		char[][] tempGrid = player.getBottomGrid().getGrid();
		tempGrid[x][y] = c;
		player.getBottomGrid().setGrid(tempGrid);
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
	
public boolean checkShot(int x, int y) throws IOException { //Opposing player  
	Ship[] tempShip = player.getShip();
		for(int i = 0; i < 5; i++) {
		if(player.getBottomGrid().getPoint(x, y) == tempShip[i].getShipID()) {
			tempShip[i].getHit();
			return true;
		}
		
	}
		
		return false;
}

public void getShot() throws IOException{
	String shot = role1.recieveInfo();
	int shotIntForm = Integer.parseInt(shot); 
	int y = shotIntForm % 10; 
	shotIntForm = shotIntForm - y; 
	int x = shotIntForm / 10;
	if(checkShot(x,y)==true) {
		role1.sendInfo("H");
		player.getBottomGrid().insertHitPoint(x, y);
	}else {
		role1.sendInfo("M");
	}
}

public void recieveVerdict() throws IOException{
	String shot = role1.recieveInfo(); 
	char c = shot.charAt(0); 
	
	if(c =='H') {
		player.getTopGrid().insertHitPoint(this.getXshot(), this.getYshot());
	}
	if(c=='M') {
		player.getTopGrid().insertMissPoint(this.getXshot(), this.getYshot());
	}
	setXshot(-1); 
	setYshot(-1);
	
}

public void takeShot() throws IOException{
	int x = -1;
	int y = -1;
	System.out.println("YOUR TURN");
	while(x == -1) {
	System.out.println("please enter the column your are firing into");
	String row = keyboard.next();
	char c = row.charAt(0); 
     x = coordinateConvert(c);
     if(x==-1){
    	 System.out.println("please print a valid column number");
     }
	}
	System.out.println("please enter the row you are firing");
	y = keyboard.nextInt(); 
	
	this.setXshot(x);
	this.setYshot(y); 
	
	String message = x +""+y;
	role1.sendInfo(message);
}



public void setXshot(int x){
	this.xShot = x; 
}
public int getXshot(){
	return xShot;
}
public void setYshot(int y){
	this.yShot = y;
}

public int getYshot() {
	return yShot;
}

public void setReady() throws IOException{
	String mess = "Ready";
	role1.sendInfo(mess);
}

public boolean checkReady() throws IOException{
	String mess = role1.recieveInfo();
	if(mess.equalsIgnoreCase("Ready")) {
		return true;
	}else
		return false;
}

public void checkWinner() throws IOException {
	String message = " "; 
	int sunkCount = 0; 
	Ship[] tempShips = player.getShip();
	for(int i = 0; i < 5; i++){
		if(tempShips[i].getBoatStatus()=='S') {
			sunkCount++;
		}
	}
	if(sunkCount == 5) {
		message = "LOSER";
		role1.sendInfo(message);
		System.out.println("YOU LOST :( ");
	}else{
		message ="Still";
		role1.sendInfo(message);
	}
	   
}

public void getWinner() throws IOException{
     String message = role1.recieveInfo(); 
     if(message.equalsIgnoreCase("LOSER")) {
    	 System.out.println("YOU ARE A WINNER");
    	 System.exit(-1);
     }
}







	

}
