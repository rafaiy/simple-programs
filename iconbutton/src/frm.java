import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class frm extends JFrame {

private JButton b1,b2;
private JTextField t;
public frm(){
	
	super("frame");
	t = new JTextField(50);
	setLayout(new FlowLayout());
	
	b1 = new JButton("click ");
	
	

	//b1.setSize(50,50);
   add(b1);
   add(t);
 
   Icon b = new ImageIcon(getClass().getResource("Untitled.png"));
   
   Icon a = new ImageIcon(getClass().getResource("b2.png"));
   
   handler h = new handler();
   b2=new JButton("second button",b);
   b2.addActionListener(h);
   add(b2);
   b2.setRolloverIcon(a);
   b1.addActionListener(h);
}
public class handler implements ActionListener{
	public void actionPerformed(ActionEvent e ){
		JOptionPane.showMessageDialog(null,String.format("%s", e.getActionCommand()));
		
		
		
		
	}

	
	
	
	
}
}
