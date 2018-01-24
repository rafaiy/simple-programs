import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;


public class gui extends JFrame {

	private static String[] colornames= {"red","blue","green", "black","yellow"};
private static	Color[]  col= {Color.RED, Color.blue, Color.green, Color.BLACK, Color.YELLOW };
	private JList list;
	public gui(){
		super("color changer ");
		setLayout(new FlowLayout());
		list = new JList(colornames);
		list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		list.setVisibleRowCount(4);
		add(new JScrollPane(list));
		list.addListSelectionListener(new ListSelectionListener() {
			
			@Override
			public void valueChanged(ListSelectionEvent e) {
				getContentPane().setBackground(col[list.getSelectedIndex()]);
				
			}
		});
		
		
	}

	
}
