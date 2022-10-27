import java.io.IOException;
import java.util.Scanner;

public class gameTest {

	public static void main(String[] args) throws IOException {
		Scanner keyboard = new Scanner(System.in); 
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
		String choice = args[0];
		Controller controller1;
	
		if(choice.equalsIgnoreCase("Client")){
			String inetAdress; 
			System.out.println("Please print the IP address of the Server you are connecting to"); 
			inetAdress = keyboard.nextLine();
			if(inetAdress.isEmpty()){
				inetAdress ="localhost";
			}
		}
		
		if(choice.equalsIgnoreCase("server")) {
			controller1 = new Controller("Server",4022,"localhost");
			controller1.setup();
			controller1.setShips();
			System.out.println("Waiting for the other player to finish setting their ships...");
			if(controller1.checkReady()==true){
				System.out.println("The Game is ready to Start!");
				while(true) {
				controller1.takeShot();
				controller1.recieveVerdict();
				controller1.display();
				controller1.getShot();
				controller1.display();
				controller1.checkWinner(); 
				controller1.getWinner();
				}
			}
			
		}
		
		if(choice.equalsIgnoreCase("client")){
			controller1 = new Controller("Client",4022,"localhost");
			controller1.setup();
			controller1.setShips();
			if(controller1.checkReady()==true){
				System.out.println("The Game is ready to Start!");
				while(true) {
				controller1.getShot();
				controller1.display();
				controller1.takeShot();
				controller1.recieveVerdict();
				controller1.display();
				controller1.checkWinner(); 
				controller1.getWinner();
				}
			}
		}
		
		
		
		
		
		
		
		
		
	}

}
