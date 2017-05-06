package structure.decorator.student;

public class CollgeStudent implements Study{

	public Student s;
	public CollgeStudent(Student s){
		this.s = s;
	}
	public void study() {
		s.study();
		System.out.println("Ñ§Ï°Î¢»ý·Ö");
	}

}
