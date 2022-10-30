import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
//public class client2 implements Role 
public class Client2 implements Role {
 
	private Socket socket;
	private PrintWriter out;
	private BufferedReader reader;
	private InetAddress host;
	private String address; 
	private int port; 
	//contructor for the Client2 class, passes in the port number and the address, if address is empty, localhost is used
	public Client2(int port, String address){
		this.port = port; 
		this.address = address; 
		if(this.address.isEmpty()) {
			this.address = "localhost";
		}
	}
	//setup function that connects to the server and sets up the reader and the writer
	public void setup() throws IOException {
			host = InetAddress.getByName(address); 
			socket = new Socket(host,port);
			out = new PrintWriter(socket.getOutputStream(), true);
			reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));	
		}
	//function recieveInfo reads the message from the reader and returns it
	public String recieveInfo() throws IOException{
		
		String line = reader.readLine();
		return line;
		}
	//Function sendInfo sends the message passed in the function through the writer
	public void sendInfo(String msg) throws IOException {
	       out.println(msg);
	       
	    }
	//Function that closes the connection
	public void closeConnection() throws IOException{
		reader.close();
		out.close();
		socket.close();
	}
		
	}
	
	


