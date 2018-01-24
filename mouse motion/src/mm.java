import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.color.ColorSpace;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class mm extends JFrame implements MouseMotionListener, MouseListener{
private JPanel mousepanel;
private JLabel status;
final Color[] co = {Color.BLACK, Color.BLUE, Color.CYAN, Color.GREEN, Color.green, Color.magenta};
Random[] r = new  Random[6];

public mm (){
	super("mouse motion");
	
	mousepanel = new JPanel();
	mousepanel.setBackground(Color.BLACK);
status = new JLabel("default");
add(status, BorderLayout.SOUTH);
add(mousepanel , BorderLayout.CENTER);
mousepanel.addMouseListener(this);

}

@Override
public void mouseClicked(MouseEvent event) {
	// TODO Auto-generated method stub
	status.setText(String.format("the x co is %s y is %s", event.getX(), event.getY()));

		mousepanel.setBackground(co[event.getClickCount()]);
}
@Override
public void mouseEntered(MouseEvent event) {
	// TODO Auto-generated method stub
	mousepanel.setBackground(Color.CYAN);
}
@Override
public void mouseExited(MouseEvent event) {
	// TODO Auto-generated method stub
	mousepanel.setBackground(Color.GREEN);
}
@Override
public void mousePressed(MouseEvent event) {
	// TODO Auto-generated method stub
	status.setText("you presssed the mouse ");
}
@Override
public void mouseReleased(MouseEvent event) {
	// TODO Auto-generated method stub
	
}
@Override
public void mouseDragged(MouseEvent event) {
	// TODO Auto-generated method stub
	
}
@Override
public void mouseMoved(MouseEvent event) {
	// TODO Auto-generated method stub
	
}
}
