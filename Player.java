
public class Player {
	private Ship[] ships; 
	private int numberOfShips;
	private Grid topgrid; 
	private Grid bottomgrid;
	//player model constructor
	public Player(){
		//intializing an array of Ship objects 
		ships = new Ship[5];
		//assigning each ship to the array 
		ships[0] = new Ship("Carrier",5,'%');
		ships[1] = new Ship("Battleship",4,'#'); 
		ships[2] = new Ship("Cruiser",3,'&');
		ships[3] = new Ship("Submarine",3,'!');
		ships[4] = new Ship("Destroyer",2,'?'); 
		
		numberOfShips = 5; 
		//initializing two grid objects for the grid
		topgrid = new Grid("Top Grid"); 
		bottomgrid = new Grid("Bottom Grid"); 
		
		
	}
	//function getHit calls the function getHit from the ship class based off of the 
	public void getHit(int shipIndex){
		ships[shipIndex].getHit();
	}
	//function that sets a particular ship based on the ships index 
	public void setShip(int i,Ship ship){
		this.ships[i] = ship;
	}
	
	//returns the ship array 
	public Ship[] getShip(){
		return ships;
	}
	
	//sets the topgrid 
	public void setTopGrid(Grid topgrid){
		this.topgrid = topgrid; 
	}
	//returns the topgrid
	public Grid getTopGrid(){
		return topgrid;
	}
	//sets the bottomgrid
	public void setBottomGrid(Grid bottomgrid){
		this.bottomgrid = bottomgrid; 
	}
	//returns the bottom grid
	public Grid getBottomGrid(){
		return bottomgrid;
	}
	//sets the number of ships 
	public void setNumberOfShips(int num){
		this.numberOfShips = num; 
	}
	//returns the number of ships
	public int getNumberOfShips(){
	  return numberOfShips;
	}
	
}
