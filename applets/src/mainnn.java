import java.applet.*;
import java.awt.*;

public class mainnn extends Applet{

	
	public void paint(Graphics g) {
		
		g.setColor(Color.green);
		g.drawString("hello there", 50, 50);
		g.setColor(Color.red);
		for(int i =0;i<300;i++)
			for(int j=0;j<300;j++)
				
		{	
				for(int k =0;i<99999;i++)
					for(int l=0;j<999999;j++)
				{g.drawLine(i, j, j, i);}
		}

}
}
