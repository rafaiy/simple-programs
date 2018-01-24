import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;


public class client {

	 static DataInputStream din;
	 static DataOutputStream dout;

	 static Socket s;
	public static void main(String[] args) throws Exception, IOException {
		s=new Socket("DESKTOP-RFRBH6N",9876);
		dout=new DataOutputStream(s.getOutputStream());

		while(true){
			System.out.println("server: "+s);
			 dout.writeUTF("rafaiy");
			
			
		}
	}

}
