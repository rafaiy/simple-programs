import java.awt.FlowLayout;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;


public class clientfrm extends JFrame implements ActionListener {
	private JTextArea chatarea;
	private JButton send,refresh;
	private JTextField ctf,ip;
	private JLabel l;
    private String holdip;
    static DataInputStream din;
    static DataOutputStream dout;
    static Socket s;
	
	int flag =0;
	
	
	clientfrm() {
		super("client ");
		setLayout(new FlowLayout());
		l= new JLabel("ip address");
		ip=new JTextField("192.168.1.103");
		ctf=new JTextField("",20);
		send=new JButton("send");
		refresh=new JButton("refresh");
		chatarea=new JTextArea(" \n \n \n \n \n \n ",20,20);
		chatarea.setEditable(false);
		
	
		try{
			s=new Socket("192.168.1.103",9876);
			din = new DataInputStream(s.getInputStream());
			dout = new DataOutputStream(s.getOutputStream());
			/*while(true){
				String text;
			text = din.readUTF();
			chatarea.setText("server"+ text);
			}
			*/
		}catch(Exception e){
			
			System.out.println(e.getMessage()+ "  opps");
			
		}
		add(l,"west");
		add(ip,"east");
		add(chatarea,"east");
		add(ctf,"south");
		add(send);
		add(refresh);
		send.addActionListener(this);
		refresh.addActionListener(this);		
		
	}	
		
	
	
	
	

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==send){
			try{
				String msgout=" ";
				msgout=ctf.getText().trim();
				dout.writeUTF(msgout);
				
				
			}catch(Exception x){
				System.out.println(x.getMessage()+"message out ");
			}
			}
		else if(e.getSource()==refresh){
			
			
			try {String text=" ";
				text = din.readUTF();
				chatarea.setText("server"+ text);
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
			
		}
	}

}
