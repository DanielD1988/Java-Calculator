package calc;
import java.awt.*;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class CalculatorGui extends JFrame{
	//array for holding operators and operands
	private String [] stack = new String[50];//stack used for holding symbols and numbers
	private static int stackFilled = 0;//keep track of the next available position in stack
	//Panels for holding different components
	private JPanel outerPanel,flowPanel,outerFlowPanel;
	private JPanel gridPanel;
	//buttons for calculator
	private JButton on = new JButton("ON");
	private JButton off = new JButton("OFF");
	private JButton clear = new JButton("Clear");
	private JButton divide = new JButton("/");
	private JButton multiply = new JButton("X");
	private JButton add = new JButton("+");
	private JButton subtract = new JButton("-");
	private JButton one = new JButton("1");
	private JButton two = new JButton("2");
	private JButton three = new JButton("3");
	private JButton four = new JButton("4");
	private JButton five = new JButton("5");
	private JButton six = new JButton("6");
	private JButton seven = new JButton("7");
	private JButton eight = new JButton("8");
	private JButton nine = new JButton("9");
	private JButton zero = new JButton("0");
	private JButton equal = new JButton("=");
	//text field for display
	private JTextField display;
	//holds and concats numbers together for insertion into stack
	private String holdNumber = "";
	//constructor
	public CalculatorGui() {
		super("Calculator");
		//add listener to buttons
		ButtonListener listener = new ButtonListener();
		zero.addActionListener(listener);
		one.addActionListener(listener);
		two.addActionListener(listener);
		three.addActionListener(listener);
		four.addActionListener(listener);
		five.addActionListener(listener);
		six.addActionListener(listener);
		seven.addActionListener(listener);
		eight.addActionListener(listener);
		nine.addActionListener(listener);
		divide.addActionListener(listener);
		multiply.addActionListener(listener);
		subtract.addActionListener(listener);
		add.addActionListener(listener);
		equal.addActionListener(listener);
		//put buttons on the grid panel
		seven.setPreferredSize(new Dimension(60, 40));//set size off all buttons
		gridPanel = new JPanel(new GridLayout(4,4,5,0));
		gridPanel.add(seven);
		gridPanel.add(eight);
		gridPanel.add(nine);
		gridPanel.add(divide);
		gridPanel.add(four);
		gridPanel.add(five);
		gridPanel.add(six);
		gridPanel.add(multiply);
		gridPanel.add(one);
		gridPanel.add(two);
		gridPanel.add(three);
		gridPanel.add(subtract);
		gridPanel.add(zero);
		gridPanel.add(equal);
		gridPanel.add(new JPanel());
		gridPanel.add(add);
		//on off and clear buttons in flow layput
		on.setPreferredSize(new Dimension(60, 30));
		off.setPreferredSize(new Dimension(60, 30));
		clear.setPreferredSize(new Dimension(80, 30));
		on.addActionListener(listener);
		off.addActionListener(listener);
		clear.addActionListener(listener);
		flowPanel = new JPanel(new FlowLayout());
		flowPanel.add(on);
		flowPanel.add(off);
		flowPanel.add(clear);
		//calculator display
		display = new JTextField("");
		display.setFont(new Font("",Font.BOLD, 30));//set size and font of text field
		display.setEditable(false);
		//assemble panels
		outerPanel = new JPanel(new BorderLayout());
		outerPanel.add(BorderLayout.NORTH,display);
		outerPanel.add(BorderLayout.CENTER,gridPanel);
		outerPanel.add(BorderLayout.SOUTH,flowPanel);
		//flow layout to shrink buttons down
		outerFlowPanel = new JPanel(new FlowLayout());
		outerFlowPanel.add(outerPanel);
		add(outerFlowPanel);
		//calculator set to off by default
		turnOn();
		//for GUI
		pack();//stops layout manager only with swing
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocation(500, 200);
		setResizable(false);//stops resizing of window
		setSize(400, 300);
		setVisible(true);
	}//end of constructor
public class ButtonListener implements ActionListener{

	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == zero) {
			if(display.getText() == "") {
				display.setText("0");
				holdNumber += "0";
			}
			else {
				display.setText(display.getText() + "0");
				holdNumber += "0";
			}
		}
		if(e.getSource() == one) {
			if(display.getText() == "") {
				display.setText("1");
				holdNumber += "1";
			}
			else {
				display.setText(display.getText() + "1");
				holdNumber += "1";
			}
		}
		if(e.getSource() == two) {
			if(display.getText() == "") {
				display.setText("2");
				holdNumber += "2";
			}
			else {
				display.setText(display.getText() + "2");
				holdNumber += "2";
			}
		}
		if(e.getSource() == three) {
			if(display.getText() == "") {
				display.setText("3");
				holdNumber += "3";
			}
			else {
				display.setText(display.getText() + "3");
				holdNumber += "3";
			}
		}
		if(e.getSource() == four) {
			if(display.getText() == "") {
				display.setText("4");
				holdNumber += "4";
			}
			else {
				display.setText(display.getText() + "4");
				holdNumber += "4";
			}
		}
		if(e.getSource() == five) {
			if(display.getText() == "") {
				display.setText("5");
				holdNumber += "5";
			}
			else {
				display.setText(display.getText() + "5");
				holdNumber += "5";
			}
		}
		if(e.getSource() == six) {
			if(display.getText() == "") {
				display.setText("6");
				holdNumber += "6";
			}
			else {
				display.setText(display.getText() + "6");
				holdNumber += "6";
			}
		}
		if(e.getSource() == seven) {
			if(display.getText() == "") {
				display.setText("7");
				holdNumber += "7";
			}
			else {
				display.setText(display.getText() + "7");
				holdNumber += "7";
			}
		}
		if(e.getSource() == eight) {
			if(display.getText() == "") {
				display.setText("8");
				holdNumber += "8";
			}
			else {
				display.setText(display.getText() + "8");
				holdNumber += "8";
			}
		}
		if(e.getSource() == nine) {
			if(display.getText() == "0") {
				display.setText("9");
				holdNumber += "9";
			}
			else {
				display.setText(display.getText() + "9");
				holdNumber += "9";
			}
		}
		if(e.getSource() == divide) {
			if(display.getText() == "") {
				push("0");//push zero number on stack
				holdNumber = "";
				push("/"); // push symbol onto stack
				display.setText(display.getText() + "/");
			}
			else {
				push(holdNumber);//push string number on stack
				holdNumber = "";
				if(checkLastEntered() == false) {//stop two symbols going on to stack after each other
					push("/"); // push symbol onto stack
					display.setText(display.getText() + "/");
				}
				else {
					display.setText("ERROR");
					emptyStack();
				}
				System.out.println(viewStack());
				
			}
		}
		if(e.getSource() == multiply) {
			if(display.getText() == "") {
				
				push("0");//push zero string onto stack
				holdNumber = "";
				push("X"); // push symbol onto stack
				display.setText(display.getText() + "X");
			}
			else {
				push(holdNumber);//push string number on stack
				holdNumber = "";
				if(checkLastEntered() == false) {//stop two symbols going on to stack after each other
					push("X"); // push symbol onto stack
					display.setText(display.getText() + "X");
				}
				else {
					display.setText("ERROR");
					emptyStack();
				}
				System.out.println(viewStack());
				
			}
		}
		if(e.getSource() == add) {
			if(display.getText() == "") {
				push("0");//push zero string onto stack
				holdNumber = "";
				push("+"); // push symbol onto stack
				display.setText(display.getText() + "+");
				
			}
			else {
				push(holdNumber);//push string number on stack
				holdNumber = "";
				if(checkLastEntered() == false) {//stop two symbols going on to stack after each other
					push("+"); // push symbol onto stack
					display.setText(display.getText() + "+");
				}
				else {
					display.setText("ERROR");
					emptyStack();
				}
				System.out.println(viewStack());
			}
		}
		if(e.getSource() == subtract) {
			if(display.getText() == "") {
				push("0");//push zero string onto stack
				holdNumber = "";
				push("-"); // push symbol onto stack
				display.setText(display.getText() + "-");
			}
			else {
				push(holdNumber);//push string number on stack
				holdNumber = "";
				if(checkLastEntered() == false) {//stop two symbols going on to stack after each other
					push("-"); // push symbol onto stack
					display.setText(display.getText() + "-");
				}
				else {
					display.setText("ERROR");
					emptyStack();
				}
				System.out.println(viewStack());
			}
		}
		if(e.getSource() == clear) {
			display.setText("");
			emptyStack();
		}
		if(e.getSource() == off) {
			display.setText("");
			zero.setEnabled(false);
			one.setEnabled(false);
			two.setEnabled(false);
			three.setEnabled(false);
			four.setEnabled(false);
			five.setEnabled(false);
			six.setEnabled(false);
			seven.setEnabled(false);
			eight.setEnabled(false);
			nine.setEnabled(false);
			divide.setEnabled(false);
			multiply.setEnabled(false);
			add.setEnabled(false);
			subtract.setEnabled(false);
			equal.setEnabled(false);
			clear.setEnabled(false);
			off.setEnabled(false);
			on.setEnabled(true);
		}
		if(e.getSource() == on) {
			display.setText("");
			zero.setEnabled(true);
			one.setEnabled(true);
			two.setEnabled(true);
			three.setEnabled(true);
			four.setEnabled(true);
			five.setEnabled(true);
			six.setEnabled(true);
			seven.setEnabled(true);
			eight.setEnabled(true);
			nine.setEnabled(true);
			divide.setEnabled(true);
			multiply.setEnabled(true);
			add.setEnabled(true);
			subtract.setEnabled(true);
			equal.setEnabled(true);
			clear.setEnabled(true);
			off.setEnabled(true);
			on.setEnabled(false);
		}
		if(e.getSource() == equal) {
			if(display.getText() == "") {
				push("0");
				display.setText("0");
			}
			else {
				push(holdNumber);//push string number on stack
				holdNumber = "";//set input number back to nothing
				int total = 0;
				total = totalInStack();
				if(total == -1) {
					display.setText("ERROR");
				}
				else {
					display.setText(""+total);
				}
			}
		}
		
	}//action performed method
}//end of buttonListenerClass
public void push(String input) {//push symbol or number on stack
	if(isFull() == false) {
		stack[stackFilled] = input;
		stackFilled++;
	}
	else {
		System.out.println("The stack is full");
	}
}
public boolean isFull() {//check if the stack is full
	if(stackFilled == stack.length) {
		return true;
	}
	return false;
}
public String viewStack() {//displays contents of stack
	String exp = "";
	for(int i = 0; i < stackFilled;i++) {
		exp += stack[i];
	}
	return exp;
}
public int totalInStack() {//used to add subtract multiply or divide numbers on stack when equals is pressed
	int total = 0;
	try {
		 total = Integer.parseInt(stack[0]);
	}
	catch(NumberFormatException err) {
		return -1;
	}
	int index = 1;
	while(index != stackFilled) {
		try {
			if(stack[index].equals("/")) {
				total = total / Integer.parseInt(stack[index+1]);
			}
		}
		catch(ArithmeticException e) {
			return -1;
		}	
			if(stack[index].equals("X")) {
				total = total * Integer.parseInt(stack[index+1]);
			}
			if(stack[index].equals("+")) {
				total = total + Integer.parseInt(stack[index+1]);
			}
			if(stack[index].equals("-")) {
				total = total - Integer.parseInt(stack[index+1]);
			}
			index++;
	}
	return total;
}
public void emptyStack() {//if error occurs or clear button is pressed clear stack
	for(int i = 0;i < stackFilled;i++) {
		stack[i] = "";
	}
	stackFilled = 0;
}
public boolean checkLastEntered() {//used to stop two symbols going on to the stack one after the other
	if(stackFilled >= 2) {//at least two things in stack
		if(stack[stackFilled-2].equals("/") || stack[stackFilled-2].equals("*") || stack[stackFilled-2].equals("+")|| stack[stackFilled-2].equals("-")) {
			return true;
		}
		return false;
	}
	else {
		return false;
	}
}
public void turnOn() {//starts the calculator in the off position
	display.setText("");
	zero.setEnabled(false);
	one.setEnabled(false);
	two.setEnabled(false);
	three.setEnabled(false);
	four.setEnabled(false);
	five.setEnabled(false);
	six.setEnabled(false);
	seven.setEnabled(false);
	eight.setEnabled(false);
	nine.setEnabled(false);
	divide.setEnabled(false);
	multiply.setEnabled(false);
	add.setEnabled(false);
	subtract.setEnabled(false);
	equal.setEnabled(false);
	clear.setEnabled(false);
	off.setEnabled(false);
	on.setEnabled(true);
}
}//end of GUI class

