package behavior.visitor;

public class Test {

	public static void main(String[] args){
		Visitor visitor = new MyVisitor();
		Element element = new MyElement();
		element.accept(visitor);
	}
}
