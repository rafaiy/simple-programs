import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.*;

public class check extends JFrame{
	private JTextField tf;
	private JCheckBox cb1;
	private JCheckBox cb2;
	
public check(){
	super("checkboxs");
	setLayout(new FlowLayout());
	tf = new JTextField("any sentence",20);
	tf.setFont(new Font("serif", Font.PLAIN, 16));
	add(tf);
	cb2= new JCheckBox("italic");
	cb1 = new JCheckBox("bold");
	add(cb1);
	add(cb2);
	handler h = new handler();
	cb1.addItemListener(h);
	cb2.addItemListener(h);
	
	
}
public class handler implements ItemListener{
	public void itemStateChanged(ItemEvent event){
		Font font= null;
		if(cb1.isSelected() && cb2.isSelected())
			font = new Font("seif",Font.BOLD + Font.ITALIC,20);
		else if(cb2.isSelected())
			font = new Font("seif",Font.ITALIC,20);
		else if(cb1.isSelected())
				font = new Font("serif",Font.BOLD,20);
		
		tf.setFont(font);
			
		
		
	}
	
	
}
}
