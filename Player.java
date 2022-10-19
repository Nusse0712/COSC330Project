import java.util.ArrayList;

public class Player {
	private Ship[] ships; 
	private int numberOfShips;
	private Grid topgrid; 
	private Grid bottomgrid;
	public Player(){
		ships = new Ship[5];
		
		ships[0] = new Ship("Carrier",5,'%');
		ships[1] = new Ship("battleship",4,'#'); 
		ships[2] = new Ship("cruiser",3,'&');
		ships[3] = new Ship("submarine",3,'!');
		ships[4] = new Ship("destroyer",2,'?'); 
		
		numberOfShips = 5; 
		
		topgrid = new Grid(); 
		bottomgrid = new Grid(); 
		
		
	}
	
	public void getHit(int shipIndex){
		ships[shipIndex].getHit();
	}
	public void setShip(int i,Ship ship){
		this.ships[i] = ship;
	}
	
	public Ship getShip(int i){
		return ships[i];
	}
	
	public void setTopGrid(Grid topgrid){
		this.topgrid = topgrid; 
	}
	
	public Grid getTopGrid(){
		return topgrid;
	}
	
	public void setBottomGrid(Grid bottomgrid){
		this.bottomgrid = bottomgrid; 
	}
	
	public Grid getBottomGrid(){
		return bottomgrid;
	}
	
	public void setNumberOfShips(int num){
		this.numberOfShips = num; 
	}
	
	public int getNumberOfShips(){
	  return numberOfShips;
	}
	
	
	
	
	
	

}
