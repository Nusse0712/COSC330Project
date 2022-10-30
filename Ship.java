public class Ship {
	private String boatName;  
	private int numHoles; 
	private int countOfHoles; 
	private char boatStatus; 
	private char shipID;
	
	public Ship(String boatName,int numHoles, char shipID){
	   this.boatName = boatName; 
	   this.numHoles = numHoles; 
	   this.countOfHoles = numHoles;
	   this.boatStatus = 'U' ; 
	   this.shipID = shipID;
	   
	}

	public int getNumHoles(){
		return numHoles;
	}
	
	public void getHit(){
		countOfHoles--;
		checkboatStatus();
	}
	
	public int getHolesLeft(){
		return countOfHoles; 
	}
	
	public String getBoatname(){
		return boatName;
	}
	
	
	
	
	public void checkboatStatus(){
		if(countOfHoles == 0) {
			  boatStatus = 'S';
			}
		if(countOfHoles == numHoles ){
			boatStatus = 'U';
		}else 
			if(countOfHoles < numHoles && countOfHoles > 0) {
			boatStatus = 'H';
			}
			
	}
	
	public char getBoatStatus(){
		return boatStatus; 
	}
	
	public void setShipID(char shipID){
		this.shipID = shipID;
	
		
	}
	
	public char getShipID() {
		return shipID; 
	}
	
	
	
}
