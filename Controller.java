import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Controller {
	private Player player; 
	private Role role1; 
	private int xShot;
	private int yShot;
	private int port;
	
	Scanner keyboard = new Scanner(System.in); 
	
	//constructor for the controller 
	public Controller(String choice, int port, String address){
		player = new Player(); 
		
		if(choice.equalsIgnoreCase("Server")){
			role1 = new Server2(port); 
		}else {
			role1 = new Client2(port,address);
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
		displayShips(); 
	}
	//set Ships function. just sets the ships 
	public void setShips() throws IOException{
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
			displayTopGrid();	
			displayBottomGrid(); 
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
				try {
				Originalrow = keyboard.nextInt();
				
				
				}catch(InputMismatchException e){
					System.out.println("Please enter a valid number"); 
				    keyboard.next();
				    Originalrow = keyboard.nextInt();
				}
				
				
			}while((Originalrow > 9 || Originalrow < 0));
		
		    while(true) {
			System.out.println("ENTER ORIENTATION. V for VERTICAL or H for Horizontal"); 
			direction = keyboard.next(); 
			c = direction.charAt(0); 
			if(c == 'V' || c=='H' || c=='h'|| c=='v'){
				break;
			}
			
		    }
			if(c=='V' || c =='v'){
				row = Originalrow;
				for(int i = 0; i < size; ++i ){
					if(row > 9){
						row = Originalrow - (size - i);
					}
					insertShipPoint(row,Originalcolumn,tempShips[j].getShipID());
					
						row++;
					
				}
				
			}
			if(c=='H' || c=='h') {
				column = Originalcolumn;
				for(int i = 0; i < size; ++i ){
					if(column > 9){
						column = Originalcolumn - (size - i);
					}
					insertShipPoint(Originalrow,column,tempShips[j].getShipID());
					
				    column++;
					
				}
				
			}
			
			
		}
		this.setReady();
	}
	
	
	public void insertShipPoint(int x, int y, char c){
		char[][] tempGrid = player.getBottomGrid().getGrid();
		tempGrid[x][y] = c;
		player.getBottomGrid().setGrid(tempGrid);
	}
	
	public int coordinateConvert(char c) {
		if(c == 'A' || c == 'a')
			return 0;
		if(c == 'B' || c =='A')
			return 1;
		if(c == 'C' || c =='c')
			return 2;
		if(c == 'D' || c =='d')
			return 3;
		if(c == 'E' || c == 'e')
			return 4;
		if(c == 'F' || c == 'f')
			return 5;
		if(c == 'G' || c == 'g')
			return 6;
		if(c == 'H' || c == 'h')
			return 7;
		if(c == 'I' || c=='i')
			return 8;
		if(c == 'J' || c =='j')
			return 9;
		else 
			return -1;
	}
	
public boolean checkShot(int x, int y) throws IOException { //Opposing player  
	Ship[] tempShip = player.getShip();
		for(int i = 0; i < 5; i++) {
		if(player.getBottomGrid().getPoint(y, x) == tempShip[i].getShipID()) {
			tempShip[i].getHit();
			return true;
		}
		
	}
		
		return false;
}

public void getShot() throws IOException{
	System.out.println("WAITING FOR OTHER PLAYERS SHOT...");
	String shot = role1.recieveInfo();
	int shotIntForm = Integer.parseInt(shot);
	System.out.println(shotIntForm);
	int y = shotIntForm % 10; 
	shotIntForm = shotIntForm - y; 
	int x = shotIntForm / 10;
	System.out.println("X value: " +x); 
	System.out.println("Y value: "+ y);
	if(checkShot(x,y)==true) {
		System.out.println("ITS A HIT");
		role1.sendInfo("H");
		player.getBottomGrid().insertHitPoint(y, x);
	}else {
		System.out.println("ITS A MISS"); 
		role1.sendInfo("M");
		player.getBottomGrid().insertMissPoint(y, x);
	}
}

public void recieveVerdict() throws IOException{
	String shot = role1.recieveInfo(); 
	char c = shot.charAt(0); 
	System.out.println(this.getXshot()); 
	System.out.println(this.getYshot());
	if(c =='H') {
		System.out.println("YOU HIT A SHIP");
		player.getTopGrid().insertHitPoint(this.getYshot(), this.getXshot());
	}
	if(c=='M') {
		System.out.println("YOU MISSED");
		player.getTopGrid().insertMissPoint(this.getYshot(), this.getXshot());
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
	do {
	System.out.println("please enter the row you are firing");
	try {
	y = keyboard.nextInt(); 
	}catch(InputMismatchException e){
		System.out.println("Please enter a valid row number");
		keyboard.next();
	}
	}while(y < 0 || y > 9);
	this.setXshot(x);
	this.setYshot(y); 
	
	String message = x +""+y;
	System.out.println(message);
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
    	 role1.closeConnection();
    	 System.exit(-1);
    	 
     }
}

public void setup() throws IOException{
	role1.setup();
}

public void closeConnection() throws IOException{
	role1.closeConnection();
}

public void displayShips() {
	Ship[] tempShip = player.getShip();
	
	int originalVal[] = new int[5]; 
	
	for(int i = 0; i < player.getNumberOfShips(); ++i) {
		originalVal[i] = tempShip[i].getNumHoles();
	}
	
	
	System.out.println("_____________________");
	System.out.println("    SHIP STATUS                           Cole Nussear and George Fotiou");
	System.out.println("_____________________");
	 for(int i = 0; i < 5; ++i) {
			 
		 System.out.print(tempShip[i].getBoatname() + "(" +tempShip[i].getShipID() + "): ");
		 
		 if(tempShip[i].getHolesLeft() == 0) {
			 System.out.print("SUNKED");
		 }else { 
			 
		 	for(int j = 0; j < tempShip[i].getHolesLeft(); ++j) {
		 		System.out.print("\u2665 ");
		 	}
		 	
		 	
		 	for(int h = 0; h < (originalVal[i] - tempShip[i].getHolesLeft()); ++h) {
		 		
		 		if(originalVal[i] > tempShip[i].getHolesLeft()) {
		 			System.out.print("\u2661 ");
		 		}
		 	}
		 }	
		 	System.out.println();
		 	System.out.println("_____________________");
	 }
}








	

}
