import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class MyFrame extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextField studentNameField,courseNameField;
	private JButton button,button2;
	private JPanel panel;
	private ArrayList<Course> courses=new ArrayList<Course>();
	private ArrayList<Student> students=new ArrayList<Student>();
	
	
	public MyFrame() {
		
		Course C1=new Course("Java");
		Course C2=new Course("Math");
		Course C3=new Course("Data Bases");
		
		courses.add(C1);
		courses.add(C2);
		courses.add(C3);
		
		
		panel=new JPanel();
		
		studentNameField=new JTextField("Student Name");
		courseNameField=new JTextField("Course Title");
		button=new JButton("Create Student");
		button2=new JButton("Print Students");
		
		panel.add(studentNameField);
		panel.add(button);
		panel.add(courseNameField);
		panel.add(button2);
		
		this.setContentPane(panel);
		//βήμα 3 - δημιουργία αντικειμένου ακροατή 
		ButtonListener listener=new ButtonListener();
		//Σύνδεση ακροατή και πηγής συμβάντων
		button.addActionListener(listener);
		button2.addActionListener(listener);
		
		this.setVisible(true);
		this.setSize(400, 400);
		this.setTitle("Event Handling Example");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
	}
	
	//βήμα 1-Δημιουργία κλάσης ακροατή
	class ButtonListener implements ActionListener{
		
		public void actionPerformed(ActionEvent e) {
			if(e.getSource()==button) {
			//βήμα 2 - Συγγραφή κώδικα για τη δημιουργία φοιτητών
				
				String studentName=studentNameField.getText();
				
				Student newStudent=new Student(studentName);
				
				String courseName=courseNameField.getText();
				
				Course selectedCourse=null;
				for(Course course:courses) {
					
					if(course.getCname().equals(courseName));
					selectedCourse=course;
					
				}
				
				newStudent.setCourse(selectedCourse);
				students.add(newStudent);
				
			
			}
			else 
				for(Student student:students) {
					student.printInfo();
				}
					
			
				
			
		}
		
	}
}
