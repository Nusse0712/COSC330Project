import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket; 
//public class Server2 implements role 
public class Server2 implements Role {

	private ServerSocket server; 
	private Socket socket;
	private PrintWriter out;
	private BufferedReader reader;
	private int port;
	//constructor for the Server2. the port number is passed through
	public Server2(int port) {
	this.port = port;
	}
	//setup function. opens a new server socket and allows connections 
	public void setup()throws IOException{
		server = new ServerSocket(port);
		socket = server.accept();
		out = new PrintWriter(socket.getOutputStream(), true);
		reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
	}
	//function recieveInfo recieves a message from the reader and then returns the message 
	public String recieveInfo() throws IOException{
		
	String line = reader.readLine();
	return line;
	}
	//functon sendInfo sends the message passed in through the writer
	public void sendInfo(String msg) throws IOException {
       out.println(msg);
       
    }
	//function that closes the connection of the server
	public void closeConnection() throws IOException{
		reader.close();
		out.close();
		server.close();
	}
}
