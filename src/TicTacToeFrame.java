
import java.awt.*;
import java.awt.event.*;

import javax.swing.*;
import javax.swing.border.LineBorder;


/**
 *
 * @author 
 */
public class TicTacToeFrame extends JFrame{
	
	
    
    private char whoseTurn='X';
    private boolean gameover=false;
    private Cell[][] cells=new Cell[3][3];
    public JLabel l1=new JLabel();
    public TicTacToeFrame()
    {
    	
    	this.setSize(800,500);
    	JMenuBar menuBar = new JMenuBar();
		JMenu file = new JMenu("Game");
		JMenuItem newGame = new JMenuItem("New Game");
		newGame.addActionListener(new newGameAction());
		JMenuItem mainMenu = new JMenuItem("Main Menu");
		mainMenu.addActionListener(new mainMenuAction());
		JMenuItem exit = new JMenuItem("Exit");
		exit.addActionListener(new exitAction());
		file.add(newGame);
		file.add(mainMenu);
		file.add(exit);
		menuBar.add(file);
		this.setJMenuBar(menuBar);
         JPanel panel=new JPanel(new GridLayout(3,3,0,0));
         panel.setBackground(new Color(189, 183, 107));
         for(int i=0;i<3;i++)
             for(int j=0;j<3;j++)
                 panel.add(cells[i][j]=new Cell());
              panel.setBorder(new LineBorder(Color.RED,1));
              l1.setBorder(new LineBorder(Color.yellow,1));
              
              getContentPane().add(panel,BorderLayout.CENTER);
             getContentPane().add(l1,BorderLayout.SOUTH);
                         
    }       
    
    class newGameAction implements ActionListener{
    	public void actionPerformed(ActionEvent e){
    		dispose();
       	 	setVisible(false);
       	 	TicTacToeFrame abc= new TicTacToeFrame();
       	 	abc.setVisible(true);
       	 	abc.setSize(600,600);
            abc.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            abc.setLocationRelativeTo(null);
    		
    	}
    }
    
    class mainMenuAction implements ActionListener{
    	public void actionPerformed(ActionEvent e){
    		MainPage.main(null);
       	 	dispose();
    		
    	}
    }
    
    class exitAction implements ActionListener{
    	public void actionPerformed(ActionEvent e){
    		System.exit(0);
    		
    	}
    }
              public boolean isFull()
              {
                    for(int i=0;i<3;i++)
             for(int j=0;j<3;j++)
                 if(cells[i][j].getToken()==' ')
                     return false;
                    
                   return true;
              }
              public boolean isWon(char token)
              {
                  int count=0,count1=0;
                  for(int i=0;i<3;i++)
                  {
                      if((cells[i][0].getToken()==token)
                              && (cells[i][1].getToken()==token)
                              && (cells[i][2].getToken()==token))
                      {
                          return true; 
                          
                      }
                  }
                  for(int i=0;i<3;i++)
                  {
                   if((cells[0][i].getToken()==token)
                              && (cells[1][i].getToken()==token)
                              && (cells[2][i].getToken()==token))
                  {    
                      return true;
                  }
                }
                  for(int i=0;i<3;i++)
                  {
                      
                          if(cells[i][i].getToken()==token)
                             count++;
                      }
                  
                   for(int i=0;i<3;i++)
                  {
                      for(int j=0;j<=3;j++)
                      {
                          if((i+j)==2)
                          {
                          if(cells[i][j].getToken()==token)
                              count1++;
                          }
                      }
                  }
                      if (count!=3 && count1!=3)
                             {                      } else {
                          return true;
        }
                     
              return false;
              }
                      
    
    

class Cell extends JPanel{
    
    private char token=' ';
    public Cell()
            
    {
         setBorder(new LineBorder(Color.black,1));
         
         addMouseListener(new MyMouseListener());
    }
    public char getToken()
    {
        return token;
    }
    public void setToken(char c)
    {
        token=c;
        repaint();
        
    }
    @Override
     public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        if(token == 'X')
        {   
           
            g.drawLine(10, 10, getWidth()-10, getHeight()-10);
            g.drawLine(getWidth() -10, 10, 10, getHeight() -10);
            
        }
        else if(token =='O')
        {
            g.drawOval(10, 10, getWidth() -10, getHeight()-10);
           
        }
              
    }

    
     private class MyMouseListener extends MouseAdapter
     {
         @Override
         public void mouseClicked(MouseEvent e)
         {
             if(gameover)
                 return;
             if(token ==' ' && whoseTurn!=' ')
             {
                 setToken(whoseTurn);
             }
             if(isWon(whoseTurn))
             {
                 JOptionPane.showMessageDialog(null,whoseTurn+" Won...Game Over!" );
            	 dispose();
            	 setVisible(false);
            	 TicTacToeFrame abc= new TicTacToeFrame();
            	 abc.setVisible(true);
            	 abc.setSize(600,600);
                 abc.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                 abc.setLocationRelativeTo(null);
            	 
                 whoseTurn=' ';
                 gameover=true;
             }
             else if(isFull())
             {
                 JOptionPane.showMessageDialog(null," Tie Game...Game Over!");
                 dispose();
            	 setVisible(false);
            	 TicTacToeFrame abc= new TicTacToeFrame();
            	 abc.setVisible(true);
            	 abc.setSize(600,600);
                 abc.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                 abc.setLocationRelativeTo(null);
                 whoseTurn=' ';
                 gameover=true;
             }
             else
             {
                 whoseTurn=(whoseTurn=='X')?'O':'X';
                 l1.setText(whoseTurn +"'s turn");
             
                   
             
             
             }
         }
     }
}

}
