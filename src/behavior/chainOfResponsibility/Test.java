package behavior.chainOfResponsibility;

public class Test {
	public static void main(String[] args){
		Handler handler1 = new ProjectManager();
		Handler handler2 = new DepartManager();
		Handler handler3 = new GeneralManager();
		
		handler1.setSuccessor(handler2);
		handler2.setSuccessor(handler3);
		
		System.out.println(handler1.handlerFeeRequest("√¿≈Æ", 100000));
		
	}
}
