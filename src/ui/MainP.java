package ui;
import java.awt.Color;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MainP extends JPanel{
	Image image;
	JLabel label;
	ImageIcon icon3;
	Image image3;
	JFrame frame;
	MainP(){
		setBackground(new Color(0,0,0,0));
	ImageIcon icon = new ImageIcon(getClass().getResource("marisa.png"));

	icon3 = new ImageIcon(getClass().getResource("marisa3.png"));
	label = new JLabel(icon);
	add(label);
	}
	
	
	
	public static void main(String[] args){
		MainFrame m = new MainFrame();
	}


}
