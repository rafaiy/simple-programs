import javax.swing.*;
public class joptionpane {
	public static void main(String args[]){
		
	String s=	JOptionPane.showInputDialog("insert the number","enter the first no you can only enter numbers ");
	String s2 = JOptionPane.showInputDialog("enter second no","enter the second no you can only enter numbers ");
	JOptionPane.showMessageDialog(null,s+s2 , "the concat of both is ",JOptionPane.PLAIN_MESSAGE);
	int a = Integer.parseInt(s);
	int b = Integer.parseInt(s2);
	int c=a+b;
	JOptionPane.showMessageDialog(null,"the sum is " +c ,"sum",JOptionPane.PLAIN_MESSAGE);
		
	}

}
