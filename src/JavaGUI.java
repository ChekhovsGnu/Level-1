import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
public class JavaGUI implements ActionListener {
JFrame frame;
JPanel panel;
JLabel label;
JButton button;
	public static void main(String[] args) {
JavaGUI j = new JavaGUI();
	}
JavaGUI(){
	frame = new JFrame();
	frame.setVisible(true);
	frame.setSize(1000, 500);
	panel = new JPanel();
	frame.add(panel);
	label = new JLabel("yes");
	panel.add(label);
	button = new JButton();
	panel.add(button);
	button.addActionListener(this);
}
@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	
}
}
