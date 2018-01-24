import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;


public class gui extends JFrame{
private static String[] cars= {"fiesta","bmw", "farrari", "mercidies", "volks"};
private JList llist;
private JList rlist;
private JButton b;
public gui(){
	
	super("moveist");
	setLayout(new FlowLayout());
	llist = new JList(cars);
	llist.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
	llist.setVisibleRowCount(4);
	add(new JScrollPane(llist));
	b = new JButton("move -->");
	add(b);
	b.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent arg0) {
			// TODO Auto-generated method stub
		rlist.setListData(llist.getSelectedValues());
		}
	});
	rlist = new JList();
	rlist.setVisibleRowCount(3);
	add(new JScrollPane(rlist));
	//rlist.setFixedCellHeight(100);
	//rlist.setFixedCellWidth(100);
	
}

}
