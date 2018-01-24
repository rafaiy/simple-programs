import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

class game extends JFrame implements ActionListener{
 game(){





for(i=0;i<rr.length;i++)
	System.out.println("rr"+rr[i]);
f = new Frame();
f.setSize(500,500);
 p = new Panel(new GridLayout(4,4));
f.add(p);
l = new Label("Moves: " + moves+"");
f.add(l,"South");

for(s=0;s<4;s++){
	
for(t=0;t<4;t++){
b[s][t] = new Button1("" + rr[k++]);

p.add(b[s][t]);
b[s][t].i=s;
b[s][t].j=t;
}
}
b[3][3].setLabel(" hello");
si=3;
sj=3;
//f.add(p);
f.setVisible(true);
b[s][t].addActionListener(this);

}
@Override
public void actionPerformed(ActionEvent e){	    
Button1 b =(Button1) e.getSource();
int difi = b.i - si;
System.out.println("difia"+difi);
int difj = b.j - sj;
System.out.println("difj"+difj);
if((Math.abs(difi)==1&&Math.abs(difj)==0)||(Math.abs(difi)==0&&Math.abs(difj)==1))
{
String temp = b.getLabel();
System.out.print("temp"+temp);
this.b[b.i][b.j].setLabel("");
this.b[si][sj].setLabel(temp);
si = b.i; sj=b.j;
l.setText("Moves: " + ++moves + "");
//f.setVisible(true);
}
	}
	}