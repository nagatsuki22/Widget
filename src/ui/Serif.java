package ui;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class Serif extends JPanel{
	JLabel label;
	Serif(){
		setLayout(new BorderLayout());
		setBackground(new Color(0,0,0,0));
		label = new JLabel();
		add(label,BorderLayout.CENTER);
		setVisible(false);
	}

}
