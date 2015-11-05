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
public class cHW04_Prog06_Hex2Bin_T143014 extends JFrame {
	JButton bntConvert = new JButton("Convert"), bntClear = new JButton("Clear");
	JTextField txtip = new JTextField();
	JTextArea txtA = new JTextArea();
	boolean check = false;
	int i;

	public cHW04_Prog06_Hex2Bin_T143014() {
		setTitle("T143014 – Hex 2 Bin ");
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
				check = false;
				String sTmp = txtip.getText();
				String[] cmd = sTmp.split("");
				// vong lap check kiem tra tieu chuan cua so dong thoi bien doi
				for (i = 0; i < sTmp.length(); i++) {
					if (check) {

					} else {
						if (cmd[i].equals("0")) {
							cmd[i] = "0000";
							check = true;
						}
					}
					if (check) {

					} else {
						if (cmd[i].equals("1")) {
							cmd[i] = "0001";
							check = true;
						}
					}
					if (check) {

					} else {
						if (cmd[i].equals("2")) {
							cmd[i] = "0010";
							check = true;
						}
					}
					if (check) {

					} else {
						if (cmd[i].equals("3")) {
							cmd[i] = "0011";
							check = true;
						}
					}
					if (check) {

					} else {
						if (cmd[i].equals("4")) {
							cmd[i] = "0100";
							check = true;
						}

					}
					if (check) {

					} else {
						if (cmd[i].equals("5")) {
							cmd[i] = "0101";
							check = true;
						}
					}
					if (check) {

					} else {
						if (cmd[i].equals("6")) {
							cmd[i] = "0110";
							check = true;
						}
					}
					if (check) {

					} else {
						if (cmd[i].equals("7")) {
							cmd[i] = "0111";
							check = true;
						}
					}
					if (check) {
					} else {
						if (cmd[i].equals("8")) {
							cmd[i] = "1000";
							check = true;
						}
					}
					if (check) {
					} else {
						if (cmd[i].equals("9")) {
							cmd[i] = "1001";
							check = true;
						}
					}
					if (check) {
					} else {
						if (cmd[i].equals("A")) {
							cmd[i] = "1010";
							check = true;
						}
					}
					if (check) {
					} else {
						if (cmd[i].equals("B")) {
							cmd[i] = "1011";
							check = true;
						}
					}
					if (check) {
					} else {
						if (cmd[i].equals("C")) {
							cmd[i] = "1100";
							check = true;
						}
					}
					if (check) {
					} else {
						if (cmd[i].equals("D")) {
							cmd[i] = "1101";
							check = true;
						}
					}
					if (check) {
					} else {
						if (cmd[i].equals("E")) {
							cmd[i] = "1110";
							check = true;
						}
					}
					if (check) {
					} else {
						if (cmd[i].equals("F")) {
							cmd[i] = "1111";
							check = true;
						}
					}
					if (check) {
						check = false;
					} else {
						break;
					}
				}
				if (i == sTmp.length()) {
					// in ra so dau bo so 0 du thua
					int s = Integer.parseInt(cmd[0]);
					txtA.append(String.valueOf(s));
					// in cac so trong chuoi
					for (int j = 1; j < i; j++) {
						txtA.append(cmd[j]);
					}
					txtA.append("\n");
				} else {
					txtA.append("Invalid Input \n");
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
		cHW04_Prog06_Hex2Bin_T143014 mainWindow = new cHW04_Prog06_Hex2Bin_T143014();
		// the application will be turn off after close the main window.
		mainWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// show the main window
		mainWindow.setVisible(true);
	}

}
