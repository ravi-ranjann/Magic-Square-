

import javax.swing.*;

public class Maze {
	public static void main(String[] args){
		new Maze();
	}
	
	public Maze(){
		JFrame f =new JFrame();
		f.setTitle("Maze Game");
		//f.add(new Board());
		f.setSize(620,482);
		f.setLocationRelativeTo(null);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 11, 481, 421);
		f.add(panel);
		panel.add(new Board());
	}
}
