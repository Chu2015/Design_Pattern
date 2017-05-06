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
		System.out.println("³Ô·¹");
	}
	private void after() {
		// TODO Auto-generated method stub
		System.out.println("ÐÝÏ¢");
	}

	
	
}
