package structure.decorator.student;


public class Test {
	
	public static void main(String[] args){
		Student s = new Student();
		Study cs = new CollgeStudent(s);
		cs.study();
	}
	
	
}
