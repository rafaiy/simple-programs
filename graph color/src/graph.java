import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;




public class graph extends JPanel{
public void paintComponent(Graphics g){
	super.paintComponents(g);
	this.setBackground(Color.RED);
	
	g.setColor(Color.BLUE);
	g.fillRect(30,30, 200, 50);
	
	g.setColor(Color.BLACK);
	g.fill3DRect(30, 100, 200, 50, true);
	
	g.setColor(Color.CYAN);
	g.fillOval(20, 60, 200, 400);
	
	
}

}
