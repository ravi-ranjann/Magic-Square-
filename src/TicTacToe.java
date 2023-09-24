

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import javax.swing.*;
/**
 *
 * @author Puja Upadhyay
 */
public class TicTacToe {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        JFrame tictactoe=new TicTacToeFrame();
        tictactoe.setTitle("Tic Tac Toe Game!");
        tictactoe.setSize(600,600);
        tictactoe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        tictactoe.setLocationRelativeTo(null);
        tictactoe.setVisible(true);
        
        
    }
    
}
