package structure.objectAdapter;

public class Test {

	public static void main(String[] args){
		Target target = new StudentAdaptor(new Student());
		target.exam();
		target.race();
	}
}
