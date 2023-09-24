import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class mainpanel extends JPanel {
	public mainpanel() {
	}

	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		ImageIcon img=new ImageIcon("C://Users//r//workspace//Sudoku//image//image1.png");
		img.paintIcon(this, g, 0, 0);
	}
	public static void main(String[] args){
		initialize();
	}

	private static void initialize() {
		
		mainpanel m=new mainpanel();
		JFrame f=new JFrame();
		f.setTitle("Main Page");
		f.setSize(700,600);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		JButton btnSinglePlayer = new JButton("Single Player");
		btnSinglePlayer.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnSinglePlayer.setForeground(Color.BLACK);
		btnSinglePlayer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SinglePlayerFrame abc = new SinglePlayerFrame();
				f.dispose();
				abc.setVisible(true);
			}
		});
		btnSinglePlayer.setBounds(266, 149, 142, 51);
		m.add(btnSinglePlayer);
		
		JButton btnDoublePlayer = new JButton("Double Player");
		btnDoublePlayer.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnDoublePlayer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DoublePlayerFrame abc = new DoublePlayerFrame();
				f.dispose();
				abc.setVisible(true);
			}
		});
		btnDoublePlayer.setBounds(266, 222, 142, 51);
		m.add(btnDoublePlayer);
		
		JButton btnExit = new JButton("Exit");
		btnExit.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				f.dispose();
				
			}
		});
		btnExit.setBounds(266, 300, 142, 51);
		m.add(btnExit);
		f.getContentPane().add(m);
	}

}
