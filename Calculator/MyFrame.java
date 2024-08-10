package Calculator;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Image;
import java.io.File;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class MyFrame extends JFrame {
	MyFrame (String title){
		this.setTitle(title);
		this.setResizable(false);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(340,540);
		this.getContentPane().setBackground(Color.BLACK);
		this.setLayout(new BorderLayout());
	}
	public void start() {
		this.setVisible(true);
	}
	
}
