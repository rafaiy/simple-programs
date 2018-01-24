import java.awt.FlowLayout;
import java.io.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class server extends JFrame implements ActionListener{
	private JTextArea chatarea;
	private JButton send,refresh;
	private JTextField ctf,ip;
	private JLabel l;
    static ServerSocket ss;
    static Socket s;
    static DataInputStream din;
    static DataOutputStream dout;
   
	
	server() {
		super("Server");
		setLayout(new FlowLayout());
		refresh=new JButton("refresh");
		l= new JLabel("start ip");
		ip=new JTextField(" ",10);
		ip.setToolTipText("ip address to start server on port no :8085");
		ctf=new JTextField(" ",20);
		send=new JButton("send");
		chatarea=new JTextArea(" \n \n \n \n \n \n ",20,20);
		chatarea.setEditable(false);
		try{
		
			ss=new ServerSocket(9876);
			s = ss.accept();
			din = new DataInputStream(s.getInputStream());
			dout = new DataOutputStream(s.getOutputStream());			
			
		/*	while(true){
				String text=" ";
				text = din.readUTF();

				chatarea.setText(chatarea.getText()+"\n"+ text);
				System.out.print(text);
			}*/
			
		}catch(Exception e){
			JOptionPane.showMessageDialog(null, "ooops!!! you got an error  "+ e.getMessage());
			
		}
		
		add(l,"west");
		add(ip,"east");
		add(chatarea,"east");
		add(ctf,"south");
		add(send);
		add(refresh);
		refresh.addActionListener(this);		
		send.addActionListener(this);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==send){			
		try{	
	    String msgout=" ";
	   msgout = ctf.getText();
	    dout.writeUTF(msgout);
		}catch(Exception ex){
			System.out.println(ex.getMessage());
		}
		}
		else if(e.getSource()==refresh){
			
			try{
				String text=" ";
				text = din.readUTF();
                chatarea.setText(chatarea.getText()+"\n"+ text);
				System.out.print(text);
			}catch(Exception e1){ System.out.println(e1.getMessage());}
		}
		
	}
	}
