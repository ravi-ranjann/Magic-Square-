

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class Board extends JPanel implements ActionListener{
	
	private Timer timer;
	
	private Map m;
	private Player p;
	public boolean win=false;
	private String message="";
	private Font font =new Font("Serif",Font.BOLD,48);
	
	public Board()
	{
		m=new Map();
		p=new Player();
		addKeyListener(new Al());
		setFocusable(true);
		timer=new Timer(25,this);
		setLayout(null);
		
		
		timer.start();
	}
	public void actionPerformed(ActionEvent e){
		if(m.getMap(p.getTileX(), p.getTileY()).equals("f")){
			message="Winner";
			win=true;
		}
		repaint();
	}
	
	public void paint(Graphics g){
		super.paint(g);
		if (!win) {
			for (int y = 0; y < 16; y++) {
				for (int x = 0; x < 16; x++) {
					if (m.getMap(x, y).equals("f")) {
						g.drawImage(m.getFinish(), x * 40, y * 40, null);
					}
					if (m.getMap(x, y).equals("g")) {
						g.drawImage(m.getGrass(), x * 40, y * 40, null);
					}
					if (m.getMap(x, y).equals("w")) {
						g.drawImage(m.getWall(), x * 40, y * 40, null);
					}
				}
			}
			g.drawImage(p.getPlayer(), p.getTileX()*40, p.getTileY()*40, null);
		}
		if (win) {
			g.drawImage(m.getWinner(), 90, 60,null);
			g.drawImage(m.getMin(), 150, 250,null);
		
		}		
	}
	
	public class Al extends KeyAdapter{
		
		public void keyPressed(KeyEvent e){
			int keycode=e.getKeyCode();
			if (keycode == KeyEvent.VK_UP) {
				if (!m.getMap(p.getTileX(), p.getTileY()-1).equals("w")) {
					p.move(0, -1);
				}
			}
			if (keycode == KeyEvent.VK_DOWN) {
				if (!m.getMap(p.getTileX(), p.getTileY()+1).equals("w")) {
					p.move(0, 1);
				}
			}
			if (keycode == KeyEvent.VK_LEFT) {
				if (!m.getMap(p.getTileX()-1, p.getTileY()).equals("w")) {
					p.move(-1, 0);
				}
			}
			if (keycode == KeyEvent.VK_RIGHT) {
				if (!m.getMap(p.getTileX()+1, p.getTileY()).equals("w")) {
					p.move(1, 0);
				}
			}
		}
	}
}
