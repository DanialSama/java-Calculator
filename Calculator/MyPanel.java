package Calculator;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class MyPanel extends JPanel {

	public void set_buttonPanel() {
		this.setLayout(new GridLayout(4,4,2,2));
		this.setOpaque(false);
	}
	
	public void set_labelPanel() {
		this.setPreferredSize(new Dimension(0,200));
		this.setLayout(new BorderLayout());
		this.setOpaque(false);
	}
	
}
