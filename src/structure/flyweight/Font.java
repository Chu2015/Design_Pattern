package structure.flyweight;

public class Font{
	private String string;  
	
	public Font(String str){  
		string = str;  
    }  

	public void operation() {
		System.out.println("Concrete---Flyweight : " + string);  
	}

}
