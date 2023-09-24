import java.awt.EventQueue;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.awt.Font;

import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.JSeparator;


public class SinglePlayerFrame extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SinglePlayerFrame frame = new SinglePlayerFrame();
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
	public SinglePlayerFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 500);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(189, 183, 107));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setTitle("Magic Square");
		
		JButton btnSudoku = new JButton("Sudoku ");
		btnSudoku.setForeground(new Color(255, 99, 71));
		btnSudoku.setBackground(new Color(0, 0, 0));
		btnSudoku.setFont(new Font("Viner Hand ITC", Font.BOLD | Font.ITALIC, 20));
		btnSudoku.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				SudokuFrame sframe=new SudokuFrame();
				dispose();
				sframe.setVisible(true);
				
				
			}
		});
		btnSudoku.setBounds(322, 162, 159, 57);
		contentPane.add(btnSudoku);
		
		JButton btnMaze = new JButton("Maze");
		btnMaze.setForeground(new Color(255, 99, 71));
		btnMaze.setBackground(new Color(0, 0, 0));
		btnMaze.setFont(new Font("Viner Hand ITC", Font.BOLD | Font.ITALIC, 20));
		btnMaze.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				MazeFrame mframe=new MazeFrame();
				dispose();
				mframe.setVisible(true);
				
				
			}
		});
		btnMaze.setBounds(322, 253, 159, 57);
		contentPane.add(btnMaze);
		
		JButton btnMainMenu = new JButton("Main Menu");
		btnMainMenu.setForeground(new Color(255, 99, 71));
		btnMainMenu.setBackground(new Color(0, 0, 0));
		btnMainMenu.setFont(new Font("Viner Hand ITC", Font.BOLD | Font.ITALIC, 20));
		btnMainMenu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				MainPage.main(null);
				dispose();
			//	mainframe.setVisible(true);
				
				
			}
		});
		btnMainMenu.setBounds(322, 342, 159, 57);
		contentPane.add(btnMainMenu);
		Image img = new ImageIcon(this.getClass().getResource("/")).getImage();
		
		JLabel lblNewLabel = new JLabel("      MAGIC SQUARE");
		lblNewLabel.setForeground(new Color(128, 0, 0));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 70));
		lblNewLabel.setBounds(0, 0, 784, 120);
		contentPane.add(lblNewLabel);
		
		JSeparator separator = new JSeparator();
		separator.setBackground(new Color(0, 0, 0));
		separator.setBounds(0, 117, 784, 23);
		contentPane.add(separator);
	}

}
