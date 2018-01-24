import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;


public class server {
static DataInputStream din;
static DataOutputStream dout;
static ServerSocket ss;
static Socket s;
	public static void main(String[] args) throws IOException {
	 ss=new ServerSocket(9876);
	 s=ss.accept();
	
	 
	 while(true){
		 
		 din=new DataInputStream(s.getInputStream());
		 System.out.println(din.readUTF());
		
	 }
		
	}

}
