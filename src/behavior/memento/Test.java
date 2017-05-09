package behavior.memento;

public class Test {

	public static void main(String[] args){
		Original original = new Original();
		
		original.setValue(4);
		original.setValue1(40);
		original.setValue2(400);
		System.out.println(original);
		Storage storage = new Storage("1",original.createMemento());
		
		original.setValue(5);
		original.setValue1(50);
		original.setValue2(500);
		System.out.println(original);
		original.restoreMemento(storage.getMemento("1"));
		System.out.println(original);
	}
}
