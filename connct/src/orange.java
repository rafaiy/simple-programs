import java.awt.*;

import javax.*;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.Action;
import java.awt.Event;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class orange extends JFrame {
 private JTextField t1,t2;
	 private JPasswordField p1;
	private JButton b1;
	 
	public orange(){
		 super("ENTRY"); 
		 //setLayout(new FlowLayout());
		 b1=new JButton("click to add");
		 handel h = new handel();		
		b1.setToolTipText("click to add it to database");
		t1=new JTextField("enter the user name",50);
		t1.setBounds(100,100,200,20);
	    p1=new JPasswordField(50); 
		p1.setBounds(100,200,200,20);
		b1.setBounds(150, 300, 100, 20);
        t2=new JTextField(50);
		t2.setEditable(false);
		t2.setBounds(100, 400, 200, 20);
		 add(t1);
		 add(p1);
		 add(b1);
		 add(t2);
		 b1.addActionListener(h);
			//JFrame.setBackground(color.green);
		
		 
	}

private class handel implements ActionListener{
public void actionPerformed(ActionEvent event){
	
	if(event.getSource()==b1){
		JOptionPane.showMessageDialog(null,"mujahid");
		 
	

}
}
}
}
