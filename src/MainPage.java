import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import javax.swing.JPanel;
import javax.swing.JSeparator;


public class MainPage {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainPage window = new MainPage();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public MainPage() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		frame = new JFrame();
		frame.setTitle("Magic Square");
		frame.setResizable(false);
		frame.getContentPane().setBackground(new Color(189, 183, 107));
		frame.setBounds(100, 100, 801, 501);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnSinglePlayer = new JButton("Single Player");
		btnSinglePlayer.setBackground(new Color(0, 0, 0));
		btnSinglePlayer.setFont(new Font("Viner Hand ITC", Font.BOLD | Font.ITALIC, 20));
		btnSinglePlayer.setForeground(new Color(255, 99, 71));
		btnSinglePlayer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SinglePlayerFrame abc = new SinglePlayerFrame();
				frame.dispose();
				abc.setVisible(true);
			}
		});
		btnSinglePlayer.setBounds(274, 171, 209, 51);
		frame.getContentPane().add(btnSinglePlayer);
		
		JButton btnDoublePlayer = new JButton("Double Player");
		btnDoublePlayer.setBackground(new Color(0, 0, 0));
		btnDoublePlayer.setForeground(new Color(255, 99, 71));
		btnDoublePlayer.setFont(new Font("Viner Hand ITC", Font.BOLD | Font.ITALIC, 20));
		btnDoublePlayer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DoublePlayerFrame abc = new DoublePlayerFrame();
				frame.dispose();
				abc.setVisible(true);
			}
		});
		btnDoublePlayer.setBounds(274, 271, 209, 51);
		frame.getContentPane().add(btnDoublePlayer);
		
		JButton btnExit = new JButton("Exit");
		btnExit.setForeground(new Color(255, 99, 71));
		btnExit.setBackground(new Color(0, 0, 0));
		btnExit.setFont(new Font("Viner Hand ITC", Font.BOLD | Font.ITALIC, 20));
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				frame.dispose();
				
			}
		});
		btnExit.setBounds(274, 364, 209, 51);
		frame.getContentPane().add(btnExit);
		
		mainpanel m=new mainpanel();
		frame.getContentPane().add(m);
		
		JLabel lblMagicSquare = new JLabel("     MAGIC SQUARE");
		lblMagicSquare.setForeground(new Color(128, 0, 0));
		lblMagicSquare.setFont(new Font("Tahoma", Font.BOLD, 70));
		lblMagicSquare.setBounds(0, 0, 785, 118);
		frame.getContentPane().add(lblMagicSquare);
		
		JSeparator separator = new JSeparator();
		separator.setBackground(new Color(0, 0, 0));
		separator.setBounds(0, 113, 785, 21);
		frame.getContentPane().add(separator);
		
	
	}
}
