import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 * 
 */

/**
 * @author Thinh Phan T143014
 *
 */
public class cHW04_Prog02_SquareRoot_T143014 extends JFrame {
	JLabel lbl01 = new JLabel("Nhap cac gia tri INPUT theo radian"), lbl02 = new JLabel("Nhap So:"),
			lbl03 = new JLabel("Chon sai so");
	JTextField txtip = new JTextField();
	JButton bnt01 = new JButton("Tinh"), bnt02 = new JButton("Xoa"), bnt03 = new JButton("Xoa Het");
	JTextArea txtA = new JTextArea();
	double bound = 0.01;
	int n, count = 0;

	public cHW04_Prog02_SquareRoot_T143014() {
		String[] num = { "1", "2", "3", "4", "5", "6", "7", "8" };
		final JComboBox comboTypesList = new JComboBox(num);
		setTitle("T143014 - Square Root");
		setSize(430, 320);
		setLayout(null);
		add(comboTypesList);
		add(lbl01);
		add(lbl02);
		add(lbl03);
		add(txtip);
		add(txtA);
		add(bnt01);
		add(bnt02);
		add(bnt03);
		lbl01.setBounds(20, 10, 300, 25);
		lbl02.setBounds(5, 50, 60, 25);
		txtip.setBounds(75, 50, 300, 25);
		lbl03.setBounds(100, 90, 80, 25);
		comboTypesList.setBounds(190, 90, 200, 25);
		bnt01.setBounds(10, 130, 120, 25);
		bnt02.setBounds(140, 130, 120, 25);
		bnt03.setBounds(270, 130, 120, 25);
		txtA.setBounds(10, 160, 380, 100);
		comboTypesList.setSelectedIndex(1);
		n = 2;
		comboTypesList.addItemListener(new ItemListener() {

			@Override
			public void itemStateChanged(ItemEvent arg0) {
				// TODO Auto-generated method stub
				bound = 1;
				n = comboTypesList.getSelectedIndex() + 1;
				for (int k = 1; k <= n; k++) {
					bound = bound / 10;
				}
			}
		});
		bnt01.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				count++;
				if (txtip.getText().equals("0")) {
					String sTmp = "1.000000000";
					// tach chuoi bang ham changeChar,thay bang 1 khoang trong
					// ''
					sTmp = changeCharInPosition(n + 2, ' ', sTmp);
					// split
					String[] cmd = sTmp.split(" ");
					// ghi phan ket qua kem theo sai so chon trong combobox
					txtA.append(count + ".Sqrt(0)=" + cmd[0] + "\n");
				} else {
					// kiem tra neu so nhap vao la 0
					try {
						double number = Double.parseDouble(txtip.getText());
						double squareRoot = number / 2, g1;
						do {
							g1 = squareRoot;
							squareRoot = (g1 + (number / g1)) / 2;
						} while ((g1 - squareRoot) > bound);
						String sq = String.valueOf(g1).replace(".", ",");
						String[] cmd = sq.split(",");
						txtA.append(count + ".Sqrt(" + number + ")=" + cmd[0] + ".");
						cmd[1] = changeCharInPosition(n, ' ', cmd[1]);
						String[] cmd2 = cmd[1].split(" ");
						txtA.append(cmd2[0] + "\n");
					} catch (NumberFormatException e) {
						txtA.append("Invalid Input \n");
						count--;
					}
				}
			}
		});
		// nut xoa
		bnt02.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				txtip.setText("");
			}
		});
		// nut xoa het
		bnt03.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				txtip.setText("");
				txtA.setText("");
			}
		});
	}

	/**
	 * @param args
	 */
	public String changeCharInPosition(int position, char ch, String str) {
		char[] charArray = str.toCharArray();
		charArray[position] = ch;
		return new String(charArray);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		cHW04_Prog02_SquareRoot_T143014 mainWindow = new cHW04_Prog02_SquareRoot_T143014();
		// the application will be turn off after close the main window.
		mainWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// show the main window
		mainWindow.setVisible(true);
	}

}
