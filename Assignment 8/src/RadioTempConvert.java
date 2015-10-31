import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class RadioTempConvert extends JFrame{
	
	double input;
	String in;
	String output = "";
	JRadioButton fahrenButton;
	JRadioButton celciButton;
	JTextField inputField;
	JTextField outputField;
	
	public RadioTempConvert(){
		
		super("Temperature converter");
		setLocationRelativeTo(null);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		add(panel);
		
		JLabel prompt = new JLabel("Enter a value in Celcius or Fahrenheit");
		panel.add(prompt);
		
		inputField = new JTextField();
		inputField.setPreferredSize(new Dimension(70,25));
		panel.add(inputField);
		
		fahrenButton = new JRadioButton("Convert to fahrenheit");
		celciButton = new JRadioButton("Convert to celcius");
		ButtonGroup group = new ButtonGroup();
		group.add(fahrenButton);
		group.add(celciButton);
		panel.add(fahrenButton);
		panel.add(celciButton);
		fahrenButton.addActionListener(new Listener1());
		celciButton.addActionListener(new Listener1());
		
		outputField = new JTextField(output);
		outputField.setPreferredSize(new Dimension(70,25));
		outputField.setEditable(false);
		panel.add(outputField);
		
		pack();
		
	}
	
	public class Listener1 implements ActionListener{
		
		public void actionPerformed(ActionEvent e) {
			
			double result;
			
			if(e.getSource() == celciButton){
				in = inputField.getText();
				input = Double.parseDouble(in);
				
				result = ((input - 32) * 5) / 9;
				
				result = Math.round(result * 100) / 100.0;
				output = Double.toString(result);
				
				outputField.setText(output);
			}
			
			if(e.getSource() == fahrenButton){
				in = inputField.getText();
				input = Double.parseDouble(in);
				
				result = ((input * 9) / 5) + 32;
				
				result = Math.round(result * 100) / 100.0;
				output = Double.toString(result);
				
				outputField.setText(output);
			}
		}
		
	}

	public static void main(String[] args) {
		
		new RadioTempConvert();

	}

}
