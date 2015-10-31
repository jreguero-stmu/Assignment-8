import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Celcius2Fahrneheit extends JFrame{
	
	JButton convertButton;
	JTextField inputField;
	JTextField outputField;
	String output;
	
	public Celcius2Fahrneheit(){
		
		super("Temperature converter");
		setLocationRelativeTo(null);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		add(panel);
		
		JLabel celciusLabel = new JLabel("Celcius:");
		panel.add(celciusLabel);
		
		inputField = new JTextField();
		inputField.setPreferredSize(new Dimension(70,25));
		panel.add(inputField);
		
		JLabel fahrenheitLabel = new JLabel("Fahrenheit:");
		panel.add(fahrenheitLabel);
		
		outputField = new JTextField(output);
		outputField.setPreferredSize(new Dimension(70,25));
		outputField.setEditable(false);
		panel.add(outputField);
		
		convertButton = new JButton("Convert");
		convertButton.addActionListener(new Listener());
		panel.add(convertButton);
		
		pack();
	}
	
	public class Listener implements ActionListener{
		
		String in;
		double input;
		double result;

		public void actionPerformed(ActionEvent e) {
			
			if(e.getSource() == convertButton){
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
		
		new Celcius2Fahrneheit();
	}

}
