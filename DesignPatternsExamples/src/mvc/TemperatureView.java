package mvc;

import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 * view that displays temperature.
 *
 */
public class TemperatureView {

		JTextField field;
		
	
	public void display(double temperature) {
		JFrame frame = new JFrame("JFrame Example");
		JPanel panel = new JPanel();
		panel.setLayout(new FlowLayout());
		JLabel label = new JLabel("Temperature is : ");
		
		field = new JTextField();
		field.setText(temperature+"");
		panel.add(label);
		panel.add(field);
		frame.add(panel);
		frame.setSize(300, 300);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.repaint();
	}
	
	public void refresh(double temperature){
		field.setText(temperature+"");
	}
	
}
