import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 * 
 */

/**
 * @author Thinh Phan T143014
 *
 */
public class cHW04_Prog07_Oct2Bin_T143014 extends JFrame {
	JButton bntConvert = new JButton("Convert"),
			bntClear = new JButton("Clear");
	JTextField txtip = new JTextField();
	JTextArea txtA = new JTextArea();
public cHW04_Prog07_Oct2Bin_T143014(){
	setTitle("T143014 – Oct 2 Bin ");
	setSize(320, 300);
	setLayout(null);
	add(bntConvert);
	add(bntClear);
	add(txtA);
	add(txtip);
	txtip.setBounds(10, 10, 200, 25);
	txtA.setBounds(10, 45, 200, 200);
	bntConvert.setBounds(220, 10, 80, 25);
	bntClear.setBounds(220, 45, 80, 25);
	bntConvert.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent arg0) {
			// TODO Auto-generated method stub
			String tmp = txtip.getText();
			int n = Integer.parseInt(tmp);
			txtA.append( " "+convert(n, 2));
		}
	});
	bntClear.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent arg0) {
			// TODO Auto-generated method stub
			txtip.setText(null);
			txtA.setText(null);
		}
	});
}
public static String convert(int num, int base) {
    String string = new String();
    while(num>0) {
        string = "0123456789ABCDEFGHIJKLMNOPQRSTVW".charAt(num%base) + string;
        num = num/base;
    }
    return string;
}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		cHW04_Prog07_Oct2Bin_T143014 mainWindow = new cHW04_Prog07_Oct2Bin_T143014();
		// the application will be turn off after close the main window.
		mainWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// show the main window
		mainWindow.setVisible(true);
	}

}
