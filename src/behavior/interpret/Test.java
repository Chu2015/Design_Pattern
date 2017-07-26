package behavior.interpret;

public class Test {
	//calculate 9+2-8
	public static void main(String[] args){
		int result = new Minus().interpret(new Context(new Plus().interpret(new Context(9,2)),8));
		System.out.println(result);
	}
}
