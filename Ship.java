public class Ship {
	private String boatName;  
	private int numHoles; 
	private int countOfHoles; 
	private char boatStatus; 
	private Coordinate[] posistion;
	
	public Ship(String boatName,int numHoles){
	   this.boatName = boatName; 
	   this.numHoles = numHoles; 
	   this.countOfHoles = numHoles;
	   this.boatStatus = 'U' ; 
	   posistion = new Coordinate[this.numHoles];
	   
	}

	public int getNumHoles(){
		return numHoles;
	}
	
	public void getHit(){
		countOfHoles--;
	}
	
	public int getHolesLeft(){
		return countOfHoles; 
	}
	
	public String getBoatname(){
		return boatName;
	}
	
	public void setPosistion(Coordinate[] posistion){
		
		this.posistion = posistion;	
	}
	public Coordinate[] getPosistion() {
		return posistion;
	}
	
	
	public void checkboatStatus(){
		if(countOfHoles == numHoles ){
			boatStatus = 'U';
		}else 
			if(countOfHoles < numHoles) {
			boatStatus = 'H';
			}else 
				if(countOfHoles == 0) {
			      boatStatus = 'S';
				}
	}
	
	public char getBoatStatus(){
		return boatStatus; 
	}
	
	
	
	

}
