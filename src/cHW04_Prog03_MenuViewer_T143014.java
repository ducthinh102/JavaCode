import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;

/**
 * 
 */
/**
 * @author Thinh Phan T143014
 * 
 */
public class cHW04_Prog03_MenuViewer_T143014 extends JFrame {
	static String birdString = "Bird";
	// create the radio button
	String[] s = { "Bun bo Hue", "Banh canh ca loc", "Banh canh nam bo", "Bun bo Hue duoi bo", "Bun bo gio nac",
			"Bun cha cua", "Bun ngheu hen", "Bun hen", "Bun nem nuong", "Bun bap bo", "Bun bo gio gan",
			"Bun thit nuong" };
	JRadioButton[] Jradio = new JRadioButton[13];
	JLabel picture = new JLabel();
	int c = 10;
	ImageIcon iconRed = new ImageIcon("D:/images/traficlight/Red.png"),
			iconGreen = new ImageIcon("D:/images/traficlight/Green.png"),
			iconYellow = new ImageIcon("D:/images/traficlight/Yellow.png");

	/*
	 * constructor
	 */
	public cHW04_Prog03_MenuViewer_T143014() {
		// set title
		setTitle("Menu Viewer");
		// set size
		setSize(500, 500);
		// reset layout
		setLayout(null);
		// add component
		add(picture);
		for (int i = 0; i <= 13; i++) {
			Jradio[i] = new JRadioButton();
			Jradio[i].setText(s[i]);
			add(Jradio[i]);
		}
		// set location
		picture.setBounds(200, 50, 300, 300);
		for (int j = 0; j <= 13; j++) {

			Jradio[j].setBounds(10, c, 60, 15);
			c = c + 20;
		}
		ButtonGroup group = new ButtonGroup();
		for (int k = 0; k <= 13; k++) {
			group.add(Jradio[k]);
		}

		// set up the picture label

		ActionListener alButton = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				for (int l = 0; l <= 13; l++) {
					if (e.getSource() == Jradio[l]) {
						picture.setIcon(iconRed);
					}
				}
			}
		};
		for (int f = 0; f <= 13; f++) {
			Jradio[f].addActionListener(alButton);
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// new window
		cHW04_Prog03_MenuViewer_T143014 wMain = new cHW04_Prog03_MenuViewer_T143014();
		// end program as closing window
		wMain.setDefaultCloseOperation(EXIT_ON_CLOSE);
		// show the window
		wMain.setVisible(true);
	}
}