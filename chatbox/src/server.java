import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;


public class server {
	static DataInputStream din;
	static DataOutputStream dout;
	static ServerSocket ss;
	static Socket s;
	static JTextField tf1;
	static JTextArea ta1;
	static JButton b1,r;
	
	
	public static void main(String[] args)throws Exception {
	
		JFrame f = new JFrame("server");
		
		tf1=new JTextField(" ",20);
		ta1=new JTextArea("",20,20);
		ta1.setEditable(false);
		b1=new JButton("send");
		r=new JButton("refresh");
		f.setLayout(new FlowLayout());
		f.add(ta1,"east");
		f.add(tf1,"south");
		f.add(b1);
		f.add(r,"west");
		f.setSize(400,425);
		f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
		f.setVisible(true);
		
	ss=new ServerSocket(9876);
	 s=ss.accept();
	 din=new DataInputStream(s.getInputStream());
	b1.addActionListener(new ActionListener(){
		
		@Override
		public void actionPerformed(ActionEvent e){
			try {
				dout=new DataOutputStream(s.getOutputStream());
				dout.writeUTF(tf1.getText());
				tf1.setText("");
				
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
			
		}
	});
	r.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e2) {
			try {
			 String dat = din.readUTF();
			 ta1.setText(ta1.getText()+ "\n"+ dat);
			 
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		try{	String bc=" ";
			bc=din.readUTF();
			dout.writeUTF(bc);
		}catch (Exception e4){System.out.println("oops you got an error");
			
			
			
		}
			
		}
	});
	
	 
	

	}




}
