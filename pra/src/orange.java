import java.awt.FlowLayout;

import javax.swing.*;

public class orange extends JFrame{
	
	private JLabel l1;
	 orange(){
		 super("myframe");
		 setLayout(new FlowLayout());
	l1 = new JLabel("labe;");	 
		 
		 l1.setToolTipText("this posps up when u hover");
		 //l1.setBounds(100,100,25,25);
		add(l1); 
	 }

}
