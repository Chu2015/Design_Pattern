package structure.proxy;

public class StudentProxy implements Study{

	Student s = new Student();
	@Override
	public void study() {
		before();
		s.study();
		after();
	}
	private void before() {
		// TODO Auto-generated method stub
		System.out.println("�Է�");
	}
	private void after() {
		// TODO Auto-generated method stub
		System.out.println("��Ϣ");
	}

	
	
}
