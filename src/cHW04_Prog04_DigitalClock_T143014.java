import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.Timer;

/**
 * 
 */

/**
 * @author Thinh Phan T143014
 *
 */
public class cHW04_Prog04_DigitalClock_T143014 extends JFrame {
	JLabel lblgiay = new JLabel(), lblphut = new JLabel(), lblgio = new JLabel();
	Timer tim = null;
	int a = 8, b = 12, c = 13;

	public cHW04_Prog04_DigitalClock_T143014() {
		setTitle("T143014 - Digital Clock");
		setSize(160, 90);
		setLayout(null);
		add(lblgiay);
		add(lblgio);
		add(lblphut);
		lblgio.setBounds(30, 20, 30, 25);
		lblphut.setBounds(60, 20, 30, 25);
		lblgiay.setBounds(90, 20, 30, 25);
		tim = new Timer(1000, new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				c++;
				if (c == 60) {
					c = 0;
					b++;
				}
				if (b == 60) {
					b = 0;
					a++;
				}
				if (a == 23) {
					a = 0;
				}
				lblgiay.setText(": " + c);
				lblphut.setText(": " + b);
				lblgio.setText("" + a);
			}
		});
		tim.start();

	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		cHW04_Prog04_DigitalClock_T143014 mainWindow = new cHW04_Prog04_DigitalClock_T143014();
		// the application will be turn off after close the main window.
		mainWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// show the main window
		mainWindow.setVisible(true);
	}

}
