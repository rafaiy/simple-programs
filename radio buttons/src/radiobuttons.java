import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.io.ObjectInputStream.GetField;

import javax.swing.*;
public class radiobuttons extends JFrame{
private JRadioButton pr;
private JRadioButton ir;
private JRadioButton ibr;
private JRadioButton br;
private ButtonGroup bg;
private JTextField tf;
private Font p,i,b,ib;

public radiobuttons(){
	
	super("radiobutton");
	setLayout(new FlowLayout());
	tf = new JTextField("welcome santa ",20);
	 p = new Font("serif", Font.PLAIN, 20);
	 i = new Font("serif", Font.ITALIC, 20);
	 b = new Font("serif", Font.BOLD, 20);
	 ib = new Font("serif", Font.BOLD+Font.ITALIC, 20);
	pr = new JRadioButton("plain",true);
	ir = new JRadioButton("Italic",false);
	br = new JRadioButton("bold",false);
	ibr = new JRadioButton("italic & bold",false);
	bg = new ButtonGroup();
	bg.add(pr);
	bg.add(ir);
	bg.add(br);
	bg.add(ibr);
	
	add(pr);
	add(ir);
	add(br);
	add(ibr);
	add(tf);
	handler h = new handler();
	pr.addItemListener(h);
	ir.addItemListener(h);
	br.addItemListener(h);
	ibr.addItemListener(h);
	
	
}
public class  handler implements ItemListener{
	public void itemStateChanged(ItemEvent event ){
		if(pr.isSelected())
			tf.setFont(p);
		else if(ir.isSelected())
		tf.setFont(i);
		
		
	}
}
}
