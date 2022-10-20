import java.io.IOException;
import java.util.Scanner; 
public class ServerTest {

	public static void main(String[] args) throws IOException {
		Server app = new Server(); 
		Scanner myScan = new Scanner(System.in);
		String clientMessage = 	app.recieveInfo();
		System.out.println(clientMessage); 
		System.out.println("please print a message to the client"); 
		String hostMessage = myScan.nextLine();
		app.sendInfo(hostMessage);
	}

}
