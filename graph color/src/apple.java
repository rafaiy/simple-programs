import javax.swing.JFrame;


public class apple extends JFrame {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		graph p = new graph();
JFrame f = new JFrame("mytitle");
f.setSize(500,500);
f.setVisible(true);
f.setDefaultCloseOperation(EXIT_ON_CLOSE);
f.add(p);
	}

}
