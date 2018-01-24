import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

class puzzle extends JFrame implements ActionListener{
	buttons b[][];
	String temp;
	int moves=0;
	Label l;
	int randomno[];
	int flag=1;
	int si,sj,s,t,difi,difj,count=0;
	int i,j,rno,c=0;
	Random r;
	JPanel p;

public puzzle(){
	super("puzzle v1.1");
	b=new buttons[4][4];
	randomno = new int[16];
	r = new Random();
	
	for(i=0;i<15;i++){
		while(flag==1){
			flag=0;
	rno =r.nextInt(15)+1;
	for(j=0;j<i;j++)
		if(randomno[j]==rno){  flag=1;	
		break;
		}
	      	
	                }		   
		   flag=1;
	      randomno[i]= rno;	
	                }
	
	p = new JPanel(new GridLayout(4,4));
	
	for(s=0;s<4;s++){
		for(j=0;j<4;j++){
			
			
			
			b[s][j]= new buttons(" " + randomno[c++]);
			p.add(b[s][j]);
			b[s][j].x=s;
			b[s][j].y=j;	
			b[s][j].addActionListener(this);
						
		}
		l=new Label("moves: "+count);
		add(p);
		si=3;
		sj=3;
		
	} }	
	@Override
	public void actionPerformed(ActionEvent event) {
		// TODO Auto-generated method stub
		buttons obj = (buttons) event.getSource();
		System.out.println(obj.x+ "<--x y--> "+obj.y);
		difi=obj.x-si;
		difj=obj.y-sj;
		if(Math.abs(difi)==0&&Math.abs(difj)==1||Math.abs(difi)==1&&Math.abs(difj)==0){
			String temp = obj.getLabel();
			b[si][sj].setLabel(temp);
			obj.setLabel(" ");
			si=obj.x;
			sj=obj.y;			
		}
		
	}
	}