package structure.decorator.breakfast;


public class Test {
	
	public static void main(String[] args){
		Toast toast = new Toast();
		BreakfastDecorator bd = new Ham(toast);
		System.out.println("这是一个"+bd.getDescription()+","+"共消费"+bd.cost()+"元");
	}
	
}
