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
public class cHW04_Prog01_Sum_T143014 extends JFrame {
	JButton bntCal = new JButton("Cal"), bntClear = new JButton("Clear");
	JTextField txtip = new JTextField();
	JTextArea txtA = new JTextArea();
	int a = -1;

	public cHW04_Prog01_Sum_T143014() {
		setTitle("Sum - T143014");
		setSize(320, 300);
		setLayout(null);
		add(bntCal);
		add(bntClear);
		add(txtA);
		add(txtip);
		txtip.setBounds(10, 10, 200, 25);
		txtA.setBounds(10, 45, 200, 200);
		bntCal.setBounds(220, 10, 80, 25);
		bntClear.setBounds(220, 45, 80, 25);
		bntCal.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				String sTmp = txtip.getText();
				// kiem tra so
				try {
					int n = Integer.parseInt(sTmp);
					double b = 0;
					// kiem tra co phai so nguyen
					if (n <= 0) {
						txtA.setText("Invalid Input");
					} else {
						// thuc hien phep tinh tong
						for (int i = 1; i <= (3 * n + 1); i++) {
							a = a * (-1);
							b = b + a * ((double) i / (i + 1));
						}
						txtA.setText(String.valueOf(b));
					}
				} catch (NumberFormatException e) {
					txtA.setText("Invalid Input");
				}
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

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		cHW04_Prog01_Sum_T143014 mainWindow = new cHW04_Prog01_Sum_T143014();
		// the application will be turn off after close the main window.
		mainWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// show the main window
		mainWindow.setVisible(true);
	}

}
