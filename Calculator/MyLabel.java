package Calculator;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.border.EmptyBorder;

public class MyLabel extends JLabel{

	MyLabel(){
		this.setForeground(Color.WHITE);
		this.setHorizontalAlignment(RIGHT);
		this.setBorder(new EmptyBorder(5,5,5,25));
	}
	
	public void set_primaryLabel(){
		this.setFont(new Font ("b Biger Over",Font.PLAIN,20));
	}
	
	public void set_secondaryLabel(){
		this.setFont(new Font ("Arial",Font.BOLD,11));
		this.setPreferredSize(new Dimension(0,50));
		this.setForeground(Color.gray);
	}
	
}
