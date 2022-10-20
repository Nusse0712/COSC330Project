import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket; 
import java.net.InetAddress; 
import java.net.SocketException; 

public class Server implements Role {
	private DatagramSocket socket;
	
	public Server() {
		try {
			socket = new DatagramSocket(5000);
		}catch( SocketException socketException){
			socketException.printStackTrace();
			System.exit(1);
		}
		}
	
	public void setup(){
		try {
			socket = new DatagramSocket(5000);
		}catch( SocketException socketException){
			socketException.printStackTrace();
			System.exit(1);
		}
	}
	
	public String recieveInfo() throws IOException{
		       socket.setSoTimeout(60000);
		       String message;
				byte[] data = new byte[ 100 ];
				DatagramPacket recievePacket = new DatagramPacket(data,data.length);
				socket.receive(recievePacket);
				message = new String(recievePacket.getData(),0,recievePacket.getLength());
				socket.close();
				return message;

		
		
	}
	
	public void sendInfo(String Message) throws IOException{
		 DatagramSocket ds = new DatagramSocket();
			   byte[] data = Message.getBytes();
			   InetAddress ip = InetAddress.getByName("127.0.0.1");  
			   DatagramPacket sendPacket = new DatagramPacket(data, data.length,ip,5001);
			   ds.send(sendPacket);
			   ds.close();
			  
	}
	
	 public void closeConnection(){
		   socket.close();
	   }
	}
	


