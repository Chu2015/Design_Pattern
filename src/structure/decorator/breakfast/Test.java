package structure.decorator.breakfast;


public class Test {
	
	public static void main(String[] args){
		Toast toast = new Toast();
		BreakfastDecorator bd = new Ham(toast);
		System.out.println("����һ��"+bd.getDescription()+","+"������"+bd.cost()+"Ԫ");
	}
	
}
