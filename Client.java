import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket; 
import java.net.InetAddress; 
import java.net.SocketException; 

public class Client implements Role {
	private DatagramSocket socket;

//constructor for the client class. initializes socket as a new Datagram Socket
	   public Client() {
	   try {
		   socket = new DatagramSocket();
	   }
	   catch( SocketException socketException)
	   {
		   socketException.printStackTrace();
		   System.exit(1);
	   }
	   
	   }
//setup function for the client class, initializes socket as a new Datagram Socket
	   public  void setup(){
		   try {
			   socket = new DatagramSocket();
		   }
		   catch( SocketException socketException)
		   {
			   socketException.printStackTrace();
			   System.exit(1);
		   }
	   }

/*send info function. passes a String as a parameter and turns
 * the String into an array of bytes. Then a new DatagramPacket
 * is declared to send the bytes to the server
 * 
 */
	   public void sendInfo(String Message) throws IOException{
		   socket = new DatagramSocket();
		   byte[] data = Message.getBytes();
		   InetAddress ip = InetAddress.getByName("127.0.0.1");  
		   DatagramPacket sendPacket = new DatagramPacket(data, data.length, ip,5000);
		   socket.send(sendPacket);
		   socket.close();
	   }
	   
	   public String recieveInfo()throws IOException{
       DatagramSocket ds = new DatagramSocket(5001);
		  String message = " " ; 
	   ds.setSoTimeout(60000);
				byte[] data = new byte[100];
        DatagramPacket recievePacket = new DatagramPacket(data, data.length); 
        ds.receive(recievePacket);

        message = new String(recievePacket.getData(),0,recievePacket.getLength());
        ds.close();
		return message;
			 
		  }
		   
		 
	   
	   public void closeConnection(){
		   socket.close();
	   }
	   
	   
}
