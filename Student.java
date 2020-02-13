
public class Student {

	private String name;
	private Course course;

	public Student(String name) {
		this.name = name;
	}
	
	public void setCourse(Course aCourse){
		
		course=aCourse;
		
	}
	
	public void printInfo() {
		
		System.out.println("Name:"+name);
		System.out.println("Course:"+ course.getCname());
		System.out.println("------------");
	}
	
}
