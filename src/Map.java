

import java.awt.*;
import java.io.*;
import java.util.*;

import javax.swing.ImageIcon;

public class Map {
	
	private Scanner m;
	
	private Image grass,wall,finish,winner,min;
	
	private String Map[]=new String[16];
	public Map(){
		ImageIcon img=new ImageIcon("C://Users//r//workspace//Sudoku//image//gg.jpg");
		grass = img.getImage();
		img=new ImageIcon("C://Users//r//workspace//Sudoku//image//walle.jpg");
		wall=img.getImage();
		img=new ImageIcon("C://Users//r//workspace//Sudoku//image//banana.jpg");
		finish=img.getImage();
		img=new ImageIcon("C://Users//r//workspace//Sudoku//image//congrats.gif");
		winner=img.getImage();
		img=new ImageIcon("C://Users//r//workspace//Sudoku//image//mini.png");
		min=img.getImage();
		openFile();
		readFile();
		closeFile();
	}
	
	public Image getGrass(){
		return grass;
	}
	
	public Image getWall(){
		return wall;
	}
	public Image getFinish(){
		return finish;
	}
	public Image getWinner(){
		return winner;
	}
	public Image getMin(){
		return min;
	}
	
	
	public String getMap(int x,int y){
		String index = Map[y].substring(x,x+1);
		return index;
	}
	public void openFile(){
		
		try{
			m=new Scanner(new File("C://Users//r//workspace//Sudoku//image//Map.txt"));
		}catch(Exception e){
			System.out.println("error loading file");
		}
	}
	
	public void readFile(){
		while(m.hasNext()){
			for(int i=0;i<16;i++){
				Map[i]=m.next();
			}
		}
		
	}
	
	public void closeFile(){
		m.close();
	}
}
