package Calculator;

import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;

public class MyButton extends JButton implements ActionListener, MouseListener {
	private static boolean flag = true;
	private static String temp = "";
	private static String command = "";
	private static int num1 = 0;
	private static int num2 = 0;

	MyButton(String name){
		this.setName(name);
		this.setText(name);
		this.setFont(new Font ("Arial",Font.BOLD,16));
		this.setFocusable(false);
		this.setBackground(new Color(0x686D76));
		this.setForeground(Color.WHITE);
		this.setBorder(null);
		this.addMouseListener(this);
		this.addActionListener(this);
	}

	
//	------------------------------------------ Mouse Listeners ---------------------------------
	@Override
	public void mouseClicked(MouseEvent event) {
	}

	@Override
	public void mousePressed(MouseEvent e) {
		this.setFont(new Font ("Arial",Font.BOLD,28));
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		this.setFont(new Font ("Arial",Font.BOLD,16));
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		this.setBackground(new Color(0x222831));
	}

	@Override
	public void mouseExited(MouseEvent e) {
		this.setBackground(new Color(0x686D76));
		
	}

//	------------------------------------------ Action Listener ---------------------------------
	@Override
	public void actionPerformed(ActionEvent event) {
		if(event.getActionCommand() == "+" ||
           event.getActionCommand() == "-" ||
           event.getActionCommand() == "×" ||
           event.getActionCommand() == "÷") {
			if (flag) {
				command = event.getActionCommand();
				Calculator.secondarylbl.setText(temp +" "+command);
				flag = false;
				temp = "";				
			}else {
				temp = "";
				flag = true;
				switch(command) {
				case "+":
					Calculator.secondarylbl.setText(num1+" "+command+" "+num2+" "+"=");
					Calculator.primarylbl.setText(Integer.toString(Calculator.plus(num1, num2)));
					break;
				case "-":
					Calculator.secondarylbl.setText(num1+" "+command+" "+num2+" "+"=");
					Calculator.primarylbl.setText(Integer.toString(Calculator.minus(num1, num2)));
					break;
				case "÷":
					Calculator.secondarylbl.setText(num1+" "+command+" "+num2+" "+"=");
					Calculator.primarylbl.setText(Integer.toString(Calculator.division(num1, num2)));
					break;
				case "×":
					Calculator.secondarylbl.setText(num1+" "+command+" "+num2+" "+"=");
					Calculator.primarylbl.setText(Integer.toString(Calculator.multiplication(num1, num2)));
					break;
				}
			}
		}else if (event.getActionCommand() != "C" && event.getActionCommand() != "=") {
			if (flag) {
				temp += event.getActionCommand();
				num1 = Integer.parseInt(temp);
				Calculator.primarylbl.setText(temp);
			}else {
				temp += event.getActionCommand();
				num2 = Integer.parseInt(temp);				
				Calculator.primarylbl.setText(temp);
			}
		}else if (event.getActionCommand() == "=") {
			temp = "";
			flag = true;
			switch(command) {
			case "+":
				Calculator.secondarylbl.setText(num1+" "+command+" "+num2+" "+"=");
				Calculator.primarylbl.setText(Integer.toString(Calculator.plus(num1, num2)));
				break;
			case "-":
				Calculator.secondarylbl.setText(num1+" "+command+" "+num2+" "+"=");
				Calculator.primarylbl.setText(Integer.toString(Calculator.minus(num1, num2)));
				break;
			case "÷":
				Calculator.secondarylbl.setText(num1+" "+command+" "+num2+" "+"=");
				Calculator.primarylbl.setText(Integer.toString(Calculator.division(num1, num2)));
				break;
			case "×":
				Calculator.secondarylbl.setText(num1+" "+command+" "+num2+" "+"=");
				Calculator.primarylbl.setText(Integer.toString(Calculator.multiplication(num1, num2)));
				break;
			}
		}else {
			temp = "";
			flag = true;
			Calculator.primarylbl.setText("0");
			Calculator.secondarylbl.setText("");
			
		}

	}
}
