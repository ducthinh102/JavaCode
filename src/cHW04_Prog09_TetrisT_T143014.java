import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextPane;

/**
 * 
 */

/**
 * @author Thinh Phan T143014
 *
 */
public class cHW04_Prog09_TetrisT_T143014 extends JFrame {
	int row = 20, col = 25, xo = 30, yo = 30, a = 20, c = 1, d = 1, c1 = 2, d1 = 2, d2 = 3;
	JTextPane txt = new JTextPane();

	JButton left = new JButton("LEFT"), right = new JButton("RIGHT"), down = new JButton("DOWN"),
			up = new JButton("UP");

	public cHW04_Prog09_TetrisT_T143014() {
		setTitle(" Tetris moving (T) -T143014");
		setSize(560, 550);

		setLayout(null);
		add(left);
		add(right);
		add(up);
		add(down);
		add(txt);
		txt.setBounds(230, 440, 100, 25);
		left.setBounds(20, 440, 90, 25);
		right.setBounds(120, 440, 90, 25);
		up.setBounds(65, 405, 90, 25);
		down.setBounds(65, 475, 90, 25);
		left.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				txt.setText(null);
				c--;
				if (c <= 0) {
					txt.setText("Don'n Move");
				}
				c1--;
				repaint();
			}
		});
		right.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				txt.setText(null);
				c++;
				if (c1 >= 23) {
					txt.setText("Don'n Move");
				}

				c1++;
				repaint();
			}
		});
		up.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				txt.setText(null);
				d--;
				if (d <= 0) {
					txt.setText("Don'n Move");
				}
				d1--;
				d2--;
				repaint();
			}
		});
		down.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				txt.setText(null);
				d++;
				if (d2 >= 18) {
					txt.setText("Don'n Move");
				}
				d1++;
				d2++;
				repaint();
			}
		});

	}

	public void paint(Graphics g) {
		int i;
		g.setColor(Color.cyan);
		for (i = 0; i <= row; i++) {
			g.drawLine(xo, yo + (i * a), xo + col * a, yo + i * a);
		}
		for (i = 0; i <= col; i++) {
			g.drawLine(xo + i * a, yo, xo + i * a, yo + row * a);

		}
		super.paint(g);
		g.fillRect(xo + c * a, yo + d * a, 20, 20);
		g.fillRect(xo + c * a, yo + d1 * a, 20, 20);
		g.fillRect(xo + c1 * a, yo + d1 * a, 20, 20);
		g.fillRect(xo + c * a, yo + d2 * a, 20, 20);
		g.setColor(Color.blue);
		g.drawRect(xo + c * a, yo + d * a, 20, 20);
		g.drawRect(xo + c * a, yo + d1 * a, 20, 20);
		g.drawRect(xo + c1 * a, yo + d1 * a, 20, 20);
		g.drawRect(xo + c * a, yo + d2 * a, 20, 20);

	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		cHW04_Prog09_TetrisT_T143014 mainWindow = new cHW04_Prog09_TetrisT_T143014();
		// the application will be turn off after close the main window.
		mainWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// show the main window
		mainWindow.setVisible(true);
	}

}
