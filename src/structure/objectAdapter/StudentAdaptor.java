package structure.objectAdapter;

public class StudentAdaptor implements Target{

	Student student;

	public StudentAdaptor(Student student){
		this.student=student;
	}
	public void study() {
		student.study();
		
	}

	public void exam() {
		student.exam();
		
	}

	public void race() {
		System.out.println(student.getName()+" is racing");
		
	}

	public void volunteer() {
		System.out.println(student.getName()+" is volunteering");
	}
}
