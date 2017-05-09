package structure.flyweight;

public class Test {
	public static void main(String[] args){  
		FontFactory ff = new FontFactory();
		Font f1 = ff.getFont("a");
		Font f2=  ff.getFont("b");
		Font f3=  ff.getFont("a");
		Font f4=  ff.getFont("a");
		
		f1.operation();
		f2.operation();
		f3.operation();
		f4.operation();
		
		System.out.println(ff.getFontsSize());
	}  
}
