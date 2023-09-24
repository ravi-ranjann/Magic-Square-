

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JSplitPane;
import javax.swing.JInternalFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class MazeFrame extends JFrame {

	private JPanel p1 = new Board(), p2 = new JPanel();
    private JSplitPane jsp;
    private final JButton btnNewGame = new JButton("New Game");
    private final JButton btnexit = new JButton("Exit");
    
    public MazeFrame() {
        super("SplitPane example");
        setTitle("Maze");
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        p1.setBackground(Color.cyan);

        p2.setBackground(new Color(189, 183, 107));

        jsp = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, true, p1, p2);
        p2.setLayout(null);
        btnNewGame.setForeground(new Color(255, 99, 71));
        btnNewGame.setFont(new Font("Viner Hand ITC", Font.BOLD | Font.ITALIC, 20));
        btnNewGame.setBackground(new Color(0, 0, 0));
        btnNewGame.setBounds(10, 120, 168, 50);
        
        p2.add(btnNewGame);
        btnexit.setForeground(new Color(255, 99, 71));
        btnexit.setFont(new Font("Viner Hand ITC", Font.BOLD | Font.ITALIC, 20));
        btnexit.setBackground(new Color(0, 0, 0));
        btnexit.setBounds(10, 303, 168, 50);
        
        p2.add(btnexit);
        
        JButton btnMainMenu = new JButton("Main Menu");
        btnMainMenu.setFont(new Font("Viner Hand ITC", Font.BOLD | Font.ITALIC, 20));
        btnMainMenu.setForeground(new Color(255, 99, 71));
        btnMainMenu.setBackground(new Color(0, 0, 0));
        btnMainMenu.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent arg0) {
        		
        		MainPage.main(null);
        		dispose();
        	}
        });
        btnMainMenu.setBounds(10, 210, 168, 50);
        p2.add(btnMainMenu);
        jsp.setDividerLocation(640);
        setContentPane(jsp);

        setSize(850, 680);

        setLocationRelativeTo(null);

        setVisible(true);
        btnNewGame.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent arg0) {
        		dispose();
        		setVisible(false);
        		new MazeFrame();
        	}
        });
              
        btnexit.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent arg0) {
        		dispose();
        		
        	}
        });
        
        
        
    }

    public static void main(String[] args) {
        new MazeFrame();
    }
}
