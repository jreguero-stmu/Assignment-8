import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Beeper extends JFrame{
	
	JButton button;
	
	public Beeper(){
		
		setTitle("Beeper");
		setPreferredSize(new Dimension(200, 80));
		setLocationRelativeTo(null);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		add(panel);
		
		button = new JButton("Press Me!");
		button.setPreferredSize(new Dimension(100,30));
		button.addActionListener(new Listener());
		panel.add(button);
		
		pack();
	}
	
	public class Listener implements ActionListener{
		
		int i = 0;
		
		public void actionPerformed(ActionEvent e) {
			
			if(e.getSource() == button){
				Toolkit.getDefaultToolkit().beep();
				i++;
				button.setText(Integer.toString(i));
			}
			
		}
	}

	public static void main(String[] args) {
		
		new Beeper();

	}

}
