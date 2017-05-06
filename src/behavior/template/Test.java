package behavior.template;

public class Test {

	public static void main(String[] org){
		Template  t1 = new Plus();
		Template  t2 = new Minus();
		System.out.println(t1.calculateExpression("33+33"));
		System.out.println(t2.calculateExpression("455-1"));
	}
}
