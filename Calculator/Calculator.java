package Calculator;

import java.awt.BorderLayout;

public class Calculator {
	static MyFrame frame ;
	static MyPanel buttonPanel = new MyPanel();
	static MyPanel labelPanel = new MyPanel();
	static MyLabel primarylbl = new MyLabel();
	static MyLabel secondarylbl = new MyLabel();
	
	public static void main(String[] args) {
		String[] buttonNames = {
				"7","8","9","÷",
				"4","5","6","×",
				"1","2","3","-",
				"C","0","=","+"
				};
		frame = new MyFrame("Calculator");

		
		
		buttonPanel.set_buttonPanel();
		createButtons(buttonNames);
		
		labelPanel.set_labelPanel();
		labelPanel.add(primarylbl,BorderLayout.CENTER);
		
		primarylbl.set_primaryLabel();
		primarylbl.setText("0");
		
		labelPanel.add(secondarylbl,BorderLayout.NORTH);
		secondarylbl.set_secondaryLabel();		
		
		
		frame.add(labelPanel,BorderLayout.NORTH);
		frame.add(buttonPanel,BorderLayout.CENTER);
		frame.start();
		
	}

	public static int plus(int num1, int num2) {
		return num1 + num2;
	}
	public static int minus(int num1, int num2) {
		return num1 - num2;
	}
	public static int multiplication(int num1, int num2) {
		return num1 * num2;
	}
	public static int division(int num1, int num2) {
		return num1 / num2;
	}
	private static void createButtons(String[] buttonNames) {
		for(int counter = 0; counter < buttonNames.length; counter++) {
			buttonPanel.add(new MyButton(buttonNames[counter]));
		}
	}
}
