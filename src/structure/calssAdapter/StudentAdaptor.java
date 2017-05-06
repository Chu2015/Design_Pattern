package structure.calssAdapter;

public class StudentAdaptor extends Student implements Target{


	public void race() {
		System.out.println(getName()+" is racing");
		
	}

	public void volunteer() {
		System.out.println(getName()+" is volunteering");
	}
	
	
}
