import java.awt.FlowLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class combo extends JFrame  {
private JComboBox box;
private JLabel p1;



	private static String[] name = {"b2.png","Untitled.png"};
	private Icon[] icon ={new ImageIcon(getClass().getResource(name[0])),new ImageIcon(getClass().getResource(name[1])) };
	public combo(){
		
		super("mycombo1box");
		setLayout(new FlowLayout());
		box = new JComboBox(name);
		
		p1 = new JLabel();
		
		box.addItemListener( new ItemListener() {
			
			public void itemStateChanged(ItemEvent e) {
				if(e.getStateChange()==ItemEvent.SELECTED)
					p1.setIcon(icon[box.getSelectedIndex() ]);
				
			}});
	add(box);
	
	add(p1);
				
		
	
}
	
	
}
