package structure.calssAdapter;

public class Student {
	private String name;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void study(){
		System.out.println(name+" is studying");
	}
	public void exam(){
		System.out.println(name+" is examing");
	}
}
