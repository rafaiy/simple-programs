import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class game extends JFrame implements ActionListener{
	button[][] b;
	
	int[] random= new int[16];
	JPanel p;
	int i,j,k,r,flag=0,c=0,dix,diy,xmax,ymax;
	Random ran=new Random();
	
	public game(){
		super("puzzle v2.0");
		
		b = new button[4][4];
		p = new JPanel(new GridLayout(4,4));
String name[] = {"i1.png" ,"i2.png", "i3.png", "i4.png", "i5.png", "i6.png", "i7.png", "i8.png", "i9.png", "i10.png", "i11.png", "i12.png", "i13.png", "i14.png", "i15.png", "i16.png"};
Icon icon[]={new ImageIcon(getClass().getResource(name[0])),new ImageIcon(getClass().getResource(name[1])),new ImageIcon(getClass().getResource(name[2])),new ImageIcon(getClass().getResource(name[3])),new ImageIcon(getClass().getResource(name[4])),new ImageIcon(getClass().getResource(name[5])),new ImageIcon(getClass().getResource(name[6])),new ImageIcon(getClass().getResource(name[7])),new ImageIcon(getClass().getResource(name[8])),new ImageIcon(getClass().getResource(name[9])),new ImageIcon(getClass().getResource(name[10])),new ImageIcon(getClass().getResource(name[11])),new ImageIcon(getClass().getResource(name[12])),new ImageIcon(getClass().getResource(name[13])),new ImageIcon(getClass().getResource(name[14])),new ImageIcon(getClass().getResource(name[15]))};	
for(i=0;i<16;i++){
	while(flag==0){
		flag=1;
	r=ran.nextInt(16);
	System.out.println(r);
	for(j=0;j<i;j++){ if(random[j]==r){ flag=0; break;
		} 
		}
}
	random[i]= r;
	flag=0;
	}


for(i=0;i<4;i++)
	for(j=0;j<4;j++){
		b[i][j]=new button(" " , icon[random[c++]]);
		p.add(b[i][j]);
		b[i][j].addActionListener(this);
		b[i][j].x=i;
		b[i][j].y=j;
		
	}
b[3][3].setIcon(null);
add(p);
xmax=3;
ymax=3;
	}
	
	
	

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
	button bu = (button) e.getSource();
	dix=xmax-bu.x;
	diy=ymax-bu.y;
	if(Math.abs(dix)==1&&Math.abs(diy)==0||Math.abs(dix)==0&&Math.abs(diy)==1){
	Icon temp=bu.getIcon();
	bu.setIcon(null);
	b[xmax][ymax].setIcon(temp);
	xmax=bu.x;
	ymax=bu.y;
		
		
	}
		
	}

}
