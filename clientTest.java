import java.io.IOException;
import java.util.Scanner;

public class clientTest {

	public static void main(String[] args) throws IOException {
		Client client = new Client(); 
		String hostMessage;
		Scanner myScan = new Scanner(System.in); 
		System.out.println("please print a message to send to Server");
		String Message = myScan.nextLine();
        client.sendInfo(Message);
       String serverMessage = client.recieveInfo();
       System.out.println(serverMessage);
       client.closeConnection();
	}

}
