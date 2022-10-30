public class Ship {
	private String boatName;  
	private int numHoles; 
	private int countOfHoles; 
	private char boatStatus; 
	private char shipID;
	//constructor for the Ship class
	public Ship(String boatName,int numHoles, char shipID){
	   this.boatName = boatName; 
	   this.numHoles = numHoles; 
	   this.countOfHoles = numHoles;
	   this.boatStatus = 'U' ; 
	   this.shipID = shipID;
	   
	}
    //returns the number of holes
	public int getNumHoles(){
		return numHoles;
	}
	//get hit function decrements the countOfHoles by 1 and then calls the checkBoatStatus Function to automatically update the boat status
	public void getHit(){
		countOfHoles--;
		checkboatStatus();
	}
	//function that returns the amount of holes left
	public int getHolesLeft(){
		return countOfHoles; 
	}
	//returns the name of the boat
	public String getBoatname(){
		return boatName;
	}
	
	
	
	//Function that checks the boat status 
	public void checkboatStatus(){
		//if the count of holes is 0, then the boatStatus is S for Sunk 
		if(countOfHoles == 0) {
			  boatStatus = 'S';
			}
		//if the count of holes equals the number of holes then the boatStatus is U for unsunk 
		if(countOfHoles == numHoles ){
			boatStatus = 'U';
		}else 
			//if the count of holes is less than the number of holes but greater than 0, then the boatStatus is H for Hit 
			if(countOfHoles < numHoles && countOfHoles > 0) {
			boatStatus = 'H';
			}
			
	}
	//returns the boatStatus
	public char getBoatStatus(){
		return boatStatus; 
	}
	//sets the ShipId 
	public void setShipID(char shipID){
		this.shipID = shipID;
	
		
	}
	//returns the Ship Id
	public char getShipID() {
		return shipID; 
	}
	
	
	
}
