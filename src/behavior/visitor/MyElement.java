package behavior.visitor;

public class MyElement implements Element{
	
	
	@Override
	public void accept(Visitor visitor) {
		visitor.visit(this);
	}

	public void method1(){
		System.out.println("MyElement method1");
	}
}
