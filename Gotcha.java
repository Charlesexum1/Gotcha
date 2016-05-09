import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Gotcha extends JApplet implements ActionListener {
	
	private Container con;
	private JButton winky;
	private JButton seeingRed;
	private JButton theBlues;
	private JButton gotYou;
	private JLabel welcome;
	
	public void init() {
		
		gotYou = new JButton("Better watch out!");
		gotYou.addActionListener(this);
		
		winky = new JButton("Commander Winky, and is dogs.");
		winky.addActionListener(this);
		
		
		seeingRed = new JButton("Mr. Strech-Arm-Strong.");
		seeingRed.addActionListener(this);
		
		theBlues = new JButton("Hey, you should click this.");
		theBlues.addActionListener(this);
		
		welcome = new JLabel("Welcome to the jungle.");
		welcome.setVisible(false);
		
						
		Container con = getContentPane();
		con.setLayout(new FlowLayout());
		con.add(theBlues);
		con.add(winky);
		con.add(seeingRed);
		con.add(gotYou);
		con.add(welcome);
		
		}
	
	public void actionPerformed(ActionEvent e) {
		
		Container con = getContentPane();
		
		if (e.getActionCommand().equals("Hey, you should click this.")) {
			con.setBackground(Color.blue);
			theBlues.setVisible(false);
			}
		if (e.getActionCommand().equals("Mr. Strech-Arm-Strong.")) {
			con.setBackground(Color.red);
			seeingRed.setVisible(false);
			}
		if (e.getActionCommand().equals("Commander Winky, and is dogs.")) {
			con.setBackground(Color.green);
			winky.setVisible(false);
			}
		if (e.getActionCommand().equals("Better watch out!")) {
			gotYou.setVisible(false);
			welcome.setVisible(true);
			}			
		
		}
	
	}
