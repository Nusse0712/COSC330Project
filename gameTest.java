import java.io.IOException;
import java.util.Scanner;

public class gameTest {

	public static void main(String[] args) throws IOException {
		Scanner keyboard = new Scanner(System.in); 
		//title for the ship
		System.out.print("\r\n"
				+ "██████╗  █████╗ ████████╗████████╗██╗     ███████╗███████╗██╗  ██╗██╗██████╗ \r\n"
				+ "██╔══██╗██╔══██╗╚══██╔══╝╚══██╔══╝██║     ██╔════╝██╔════╝██║  ██║██║██╔══██╗\r\n"
				+ "██████╔╝███████║   ██║      ██║   ██║     █████╗  ███████╗███████║██║██████╔╝\r\n"
				+ "██╔══██╗██╔══██║   ██║      ██║   ██║     ██╔══╝  ╚════██║██╔══██║██║██╔═══╝ \r\n"
				+ "██████╔╝██║  ██║   ██║      ██║   ███████╗███████╗███████║██║  ██║██║██║     \r\n"
				+ "╚═════╝ ╚═╝  ╚═╝   ╚═╝      ╚═╝   ╚══════╝╚══════╝╚══════╝╚═╝  ╚═╝╚═╝╚═╝     \r\n"
				+ "                                                                             \r\n"
				+ "\n");
		System.out.println("WELCOME TO BATTLESHIP"); 
		//choice is the command line argument, determines whether the controller is a server or client
		String choice = args[0];
		Controller controller1;
		String inetAdress ="";
		//if choice equals the client, then it prompts the user to enter the InetAdress of the server, if left blank localhost is used
		if(choice.equalsIgnoreCase("Client")){
			 
			System.out.println("Please print the IP address of the Server you are connecting to"); 
			System.out.println("Or press enter to use localhost");
			inetAdress = keyboard.nextLine();
			if(inetAdress.isEmpty()){
				System.out.println("localhost is used");
				inetAdress ="localhost";
			}
		}
		//if choice equals server 
		if(choice.equalsIgnoreCase("server")) {
			//the controller object is assigned as a server object 
			controller1 = new Controller("Server",4022, inetAdress);
			System.out.println("Waiting for the other player to finish setting up...");
			//the server sets up the connection 
			controller1.setup();
			//sets the ships and checks if the other player is ready to play 
			controller1.setShips();
			//if the function checkReady equals true, the game is ready to begin 
			if(controller1.checkReady()==true){
				System.out.println("The Game is ready to Start!");
				//infinite while loop that will break when checkWinner decides the winner
				while(true) {
				//server takes the shot while the client listens 
				controller1.takeShot();
				//server listens as the client recieves the verdict and updates board
				controller1.recieveVerdict();
				//the game checks if there is awinner after every shot taken
				controller1.checkWinner(); 
				controller1.getWinner();
				//display function is called
				controller1.display();
				//listens to the other player as their making their shot
				controller1.getShot();
				//checks the winner again
				controller1.checkWinner(); 
				controller1.getWinner();
				//displats the function
				controller1.display();
				
				}
			}
			
		}
		//if the choice equals client
		if(choice.equalsIgnoreCase("client")){
			//sets up a new client controller 
			controller1 = new Controller("Client",4022,inetAdress);
			System.out.println("Waiting for the other player to finish setting up...");
			//sets up the connection and has the player set ships 
			controller1.setup();
			controller1.setShips();
			//the player will wait for the other player to set the ships through the use of the checkReady function
			if(controller1.checkReady()==true){
				//if checkReady is true, then the game is ready to start
				System.out.println("The Game is ready to Start!");
				while(true) {
				//client listens to the shot as the server is shooting
				controller1.getShot();
				//checks the winner after every shot taken 
				controller1.checkWinner(); 
				controller1.getWinner();
				//display the current view 
				controller1.display();
				//client takes the shot as the server is listening 
				controller1.takeShot();
				//Receives the verdict from the other player
				controller1.recieveVerdict();
				//checks for a winner after every shot
				controller1.checkWinner(); 
				controller1.getWinner();
				//displays the current view 
				controller1.display();
				}
			}
		}
		
		
		
		
		
		
		
		
		
	}

}
