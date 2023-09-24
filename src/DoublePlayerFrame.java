import java.awt.EventQueue;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import java.awt.Font;
import java.awt.Color;
import javax.swing.JSeparator;


public class DoublePlayerFrame extends JFrame {

	private JPanel contentPane;
	private JButton btnStartGame;
	private JButton btnNewButton;
    private String player1;
    private String player2;
    private JSeparator separator;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DoublePlayerFrame frame = new DoublePlayerFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public DoublePlayerFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 500);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(189, 183, 107));
		contentPane.setForeground(new Color(218, 165, 32));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblEnterFirstPlayer = new JLabel("       TIC TAC TOE");
		lblEnterFirstPlayer.setForeground(new Color(128, 0, 0));
		lblEnterFirstPlayer.setFont(new Font("Tahoma", Font.BOLD, 70));
		lblEnterFirstPlayer.setBounds(0, 0, 784, 118);
		contentPane.add(lblEnterFirstPlayer);
		
		btnStartGame = new JButton("Start Game");
		btnStartGame.setBackground(new Color(0, 0, 0));
		btnStartGame.setForeground(new Color(255, 99, 71));
		btnStartGame.setFont(new Font("Viner Hand ITC", Font.BOLD | Font.ITALIC, 20));
		btnStartGame.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				
				TicTacToeFrame tframe=new TicTacToeFrame();
				dispose();
				tframe.setVisible(true);
				
			}
		});
		btnStartGame.setBounds(337, 231, 170, 50);
		contentPane.add(btnStartGame);
		
		btnNewButton = new JButton("Back");
		btnNewButton.setForeground(new Color(255, 99, 71));
		btnNewButton.setBackground(new Color(0, 0, 0));
		btnNewButton.setFont(new Font("Viner Hand ITC", Font.BOLD | Font.ITALIC, 20));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				
				MainPage.main(null);
				dispose();
		//		tframe.setVisible(true);
				
			}
		});
		btnNewButton.setBounds(337, 323, 170, 50);
		contentPane.add(btnNewButton);
		
		separator = new JSeparator();
		separator.setBackground(new Color(0, 0, 0));
		separator.setBounds(0, 129, 784, 23);
		contentPane.add(separator);
		Image img = new ImageIcon(this.getClass().getResource("/")).getImage();
	}
}
