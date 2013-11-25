package ui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JFrame;
import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;

public class MainFrame extends JFrame implements MouseListener,MouseMotionListener{
	int x = 200;
	int y = 200;
	private Point start = null;
	private Point point = null;
	JPopupMenu menu;
	int clickcount = 0;
	MainP p;
	JMenuItem menuitem;
	Serif serif;
	MainFrame(){
		p = new MainP();
		setPreferredSize(new Dimension(400,300));

		setLayout(new BorderLayout());
		add(p.label,BorderLayout.EAST);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setUndecorated(true);
		setBackground(new Color(0,0,0,0));
		pack();
		setVisible(true);
		addMouseMotionListener(this);
		addMouseListener(this);
		addMenu();
		serif = new Serif();
		add(serif,BorderLayout.WEST);
		}

	public void addMenu(){
		menu = new JPopupMenu();
		menuitem = new JMenuItem();
		menuitem.setText("EXIT");
		menuitem.addMouseListener(new MouseAdapter(){
			public void mousePressed(MouseEvent e){
				System.exit(0);
				}
			
		});
		menu.add(menuitem);
	}
	
	public void mouseClicked(MouseEvent e) {
		Component com = (Component)e.getComponent();
		switch (e.getButton()) {
		case MouseEvent.BUTTON1:
			clickcount += 1;
			serif.setVisible(true);
			if (clickcount == 1){
			serif.label.setText("ひぁ！？　＞");
			;}
			if (clickcount >= 5){
				serif.label.setText("や、やめろっ　＞");
				p.label.setIcon(p.icon3);
			}
			repaint();
			menu.setVisible(false);
			break;
		case MouseEvent.BUTTON3:
			menu.show(com, e.getX(), e.getY());
			break;
		default:
			menu.setVisible(false);
			break;
		}
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO �����������ꂽ���\�b�h�E�X�^�u
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO �����������ꂽ���\�b�h�E�X�^�u
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO �����������ꂽ���\�b�h�E�X�^�u
		start = e.getPoint();
		point = e.getPoint();

//		if (e.getClickCount() >= 2) {
//			System.exit(0);
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO �����������ꂽ���\�b�h�E�X�^�u
		Component c = (Component) e.getComponent();
		point = c.getLocation(point);
		int x = point.x - start.x + e.getX();
		int y = point.y - start.y + e.getY();
		c.setLocation(x, y);
	}

	public void mouseDragged(MouseEvent e) {
		Component c = (Component) e.getComponent();
		point = c.getLocation(point);
		int x = point.x - start.x + e.getX();
		int y = point.y - start.y + e.getY();
		c.setLocation(x, y);
		
//		System.out.println(x+","+y+"�ɂЂ��ς���");
	}

	@Override
	public void mouseMoved(MouseEvent e) {
	}
	

}
