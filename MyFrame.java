import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class MyFrame extends JFrame {

	private JTextField inputField,outputField;
	private JButton button,button2;
	private JPanel panel;
	
	public MyFrame() {
		
		panel=new JPanel();
		
		inputField=new JTextField("Enter your name");
		outputField=new JTextField(20);
		button=new JButton("Greeting");
		button2=new JButton("Greeting 2");
		
		panel.add(inputField);
		panel.add(button);
		panel.add(button2);
		panel.add(outputField);
		
		this.setContentPane(panel);
		//���� 3 - ���������� ������������ ������� 
		ButtonListener listener=new ButtonListener();
		//������� ������� ��� ����� ���������
		button.addActionListener(listener);
		button2.addActionListener(listener);
		
		this.setVisible(true);
		this.setSize(400, 400);
		this.setTitle("Event Handling Example");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
	}
	
	//���� 1-���������� ������ �������
	class ButtonListener implements ActionListener{
		
		public void actionPerformed(ActionEvent e) {
			if(e.getSource()==button) {
				
			
			//���� 2 - �������� ������
			String name=inputField.getText();
			outputField.setText("Hello my friend: "+name);
			}
			else 
				outputField.setText("What a funny name");
			
		}
		
	}
}
