import java.util.ArrayList;

public class Player implements Subject {
	private ArrayList observers;
	private Ship[] ships; 
	private Ship battleship; 
	private Ship cruiser; 
	private Ship submarine; 
	private Ship destroyer;
	private int numberOfShips;
	private Grid topgrid; 
	private Grid bottomgrid;
	boolean changed = false;
	public Player(){
		ships = new Ship[5];
		
		ships[0] = new Ship("Carrier",5);
		ships[1] = new Ship("battleship",4); 
		ships[2] = new Ship("cruiser",3);
		ships[3] = new Ship("submarine",3);
		ships[4] = new Ship("destroyer",2); 
		
		numberOfShips = 5; 
		
		topgrid = new Grid(); 
		bottomgrid = new Grid(); 
		
		observers = new ArrayList();
		
		
	}
	
	
	public void registerObserver(Observer o){
		observers.add(o); 
	}
	
	public void removeObserver(Observer o){
		int i = observers.indexOf(o);
		if(i >= 0) {
			observers.remove(i);
		}
	}
	
	public void notifyObservers(Object arg){
		if(changed==true) {
		for(int i = 0; i < observers.size(); i++ ) {
			Observer observer = (Observer)observers.get(i);
			observer.update(this,arg);
		}
	}
		changed= false;
	}
	
	public void notifyObservers() {
		notifyObservers(null);
	}
	
	
	public void measurementsChanged(){
		changed = true;
	}
	
    
	
	

}
