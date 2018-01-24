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


public class client extends JFrame{
	static DataInputStream din;
	static DataOutputStream dout;
	static Socket s;
	static JTextField tf1;
	static JTextArea ta1;
	static JButton b1,r;
	
public static void main(String args[]) throws IOException{
	
	JFrame f = new JFrame("client");
	
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
	s=new Socket("DESKTOP-RFRBH6N",9876);
	dout=new DataOutputStream(s.getOutputStream());
	din=new DataInputStream(s.getInputStream());
	
	b1.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e){
			try{
				String data;
				data=tf1.getText();
			dout.writeUTF(data);
			
			}catch(Exception e1){}			
		}
		});
	r.addActionListener(new ActionListener(){
		
		public void actionPerformed(ActionEvent e2){
			try{
				String dat;
				dat=din.readUTF();
				ta1.setText(ta1.getText()+"\n"+dat);
				
				
				
			}catch(Exception e3){}
			
		}
		
		
	});
	
}
}
