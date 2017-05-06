package structure.proxy;

public class Test {

	public static void main(String[] args){
		Study s1 = new Student();
		s1.study();
		
		Study s = new StudentProxy();
		s.study();
	}
}
