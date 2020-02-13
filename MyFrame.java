import javax.swing.*;

public class MyFrame extends JFrame {

	private JTextField inputField,outputField;
	private JButton button;
	private JPanel panel;
	
	public MyFrame() {
		
		panel=new JPanel();
		
		inputField=new JTextField("Enter your name");
		outputField=new JTextField(20);
		button=new JButton("Greeting");
		
		panel.add(inputField);
		panel.add(button);
		panel.add(outputField);
		
		this.setContentPane(panel);
		
		this.setVisible(true);
		this.setSize(400, 400);
		this.setTitle("Event Handling Example");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
	}
}
