import java.awt.FlowLayout;

import javax.swing.*;

public class orange extends JFrame{
	
	private JLabel l1;
	 orange(){
		 super("myframe");
		 setLayout(new FlowLayout());
		 
	              l1 = new JLabel("label");	 
		 
		 l1.setToolTipText("this pops up when you hover over it");
		 //l1.setBounds(100,100,25,25);
		add(l1); 
	 }

}
