package behavior.mediator;

public class Test {

	public static void main(String[] args){
		PhoneA pa = new PhoneA(111);
		PhoneB pb = new PhoneB(222);
		PhoneC pc = new PhoneC(333);
		
		AbstractMediator am = new Mediator(pa,pb,pc);
		
		pa.setAbstractMediator(am);
		pb.setAbstractMediator(am);
		pc.setAbstractMediator(am);
		
		pa.callB();
		pb.callA();
		pc.callB();
		
	}
}
