import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class flowlayout extends JFrame implements ActionListener {
private JButton left;
private JButton center;
private JButton right;
private Container container;
private FlowLayout layout;
public flowlayout(){
	super("thetitle");
	layout = new FlowLayout();
	setLayout(layout);
    container = getContentPane();
	left = new JButton("left");
	center = new JButton("center");
	right = new JButton("right");
	add(left);
	add(center);
	add(right);
	left.addActionListener(this);
	right.addActionListener(this);
	center.addActionListener(this);
	
}
@Override
public void actionPerformed(ActionEvent e) {
	if(e.getSource()== left){
	layout.setAlignment(FlowLayout.LEFT);
	//layout.layoutContainer(container);
		
	}
	else if(e.getSource()== right){
		layout.setAlignment(FlowLayout.RIGHT);
		layout.layoutContainer(container);
			
		}
	else if(e.getSource()== center){
			layout.setAlignment(FlowLayout.CENTER);
			layout.layoutContainer(container);
				
			}
	
}

}
