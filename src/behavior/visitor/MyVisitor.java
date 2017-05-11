package behavior.visitor;

public class MyVisitor implements Visitor{

	@Override
	public void visit(Element element) {
		element.method1();
	}

}
