import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class select extends JFrame implements ActionListener {
	JButton client;
	JButton server;
	JLabel l;
	public select(){
		
		super("select");
		setLayout(new FlowLayout());
  client=new JButton("client");
  server=new JButton("server");
  add(client);
  add(server);
  client.addActionListener(this);
  server.addActionListener(this);
  
}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==client){
			this.setVisible(false);
			clientfrm cfrm=new clientfrm();
			cfrm.setSize(500,425);
			cfrm.setDefaultCloseOperation(cfrm.EXIT_ON_CLOSE);
			cfrm.setVisible(true);
			
			
		}
		else if (e.getSource()==server) {
			this.setVisible(false);
			server sfrm=new server();
			sfrm.setSize(500,425);
			sfrm.setDefaultCloseOperation(sfrm.EXIT_ON_CLOSE);
			sfrm.setVisible(true);
			
		}
		// TODO Auto-generated method stub
		
	}
}