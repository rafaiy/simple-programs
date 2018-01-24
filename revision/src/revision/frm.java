package revision;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;


public class frm extends JFrame{
	
	private JTextField t1;
	private JTextField t2;
	private JPasswordField pf;
	private String s1;
	
	
	frm(){
		super("myframe");
		t1 = new JTextField(10);
		t2 = new JTextField("second text field");
		setLayout(new FlowLayout());
		pf = new JPasswordField("password");
		
		add(t1);
		add(t2);
		add(pf);
		actn o = new actn();
		t1.addActionListener(o);
		t2.addActionListener(o);
		pf.addActionListener(o);
		
		
	}
	
	class actn implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			s1="pressed nothing";
			if(e.getSource()==t1){
				s1 = "you pressed "+ e.getActionCommand();				
			}
			else if(e.getSource()==t2){
				s1="you pressed " + e.getActionCommand();
			}
			
			else if(e.getSource()==pf){
				s1="you pressed " + e.getActionCommand();
			}
			JOptionPane.showMessageDialog(null,s1+" hello" );
		}
		
		
		
		
		
	}
	
	

}
