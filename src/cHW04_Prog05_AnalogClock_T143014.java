import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.Timer;

/**
 * 
 */
/**
 * @author Thinh Phan T143014
 * 
 */
public class cHW04_Prog05_AnalogClock_T143014 extends JFrame {
	int R = 70;
	int x = 150, y = 150;
	int goc = 90, goc01 = 90, goc02 = 90;
	Timer TimeCounter02 = null;
	Timer timCounter = null;
	Timer timCounter03 = null;

	public cHW04_Prog05_AnalogClock_T143014() {
		// set title
		setTitle(" T143014 - Digital Clock ");
		// set size
		setSize(300, 300);
		// reset layout
		setLayout(null);
		// add component
		timCounter = new Timer(1000, new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				goc = goc - 6;
				repaint();
			}
		});
		timCounter03 = new Timer(3600000, new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				goc02 = goc02 - 6;
				repaint();
			}
		});
		TimeCounter02 = new Timer(60000, new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				goc01 = goc01 - 6;
				repaint();
			}
		});
		timCounter.start();
		TimeCounter02.start();
		timCounter03.start();
	}

	public void paint(Graphics g) {
		super.paint(g);
		int x1 = (int) (x + R * Math.cos(Math.PI * goc / 180.0)), y1 = (int) (y - R * Math.sin(Math.PI * goc / 180.0));
		g.drawLine(x, y, x1, y1);
		int x2 = (int) (x + R * Math.cos(Math.PI * goc01 / 180.0)),
				y2 = (int) (y - R * Math.sin(Math.PI * goc01 / 180.0));
		g.drawLine(x, y, x2, y2);
		int x3 = (int) (x + R * Math.cos(Math.PI * goc02 / 180.0)),
				y3 = (int) (y - R * Math.sin(Math.PI * goc02 / 180.0));
		g.drawLine(x, y, x3, y3);
		g.drawOval(80, 80, 140, 140);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		cHW04_Prog05_AnalogClock_T143014 wMain = new cHW04_Prog05_AnalogClock_T143014();
		// the application will be turn off after close the main window.
		wMain.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// show the main window
		wMain.setVisible(true);
	}
}