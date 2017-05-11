package behavior.visitor;

public interface Element {
	
	public void accept(Visitor visitor);
	
	public void method1();
	
}
