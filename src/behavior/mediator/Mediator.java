package behavior.mediator;

public class Mediator extends AbstractMediator{

	public Mediator(AbstractPhone a, AbstractPhone b, AbstractPhone c) {
		super(a, b, c);
	}

	@Override
	public void callB(int Phonenum) {
		B.setCallNumber(Phonenum);
		B.ring();
	}

	@Override
	public void callA(int Phonenum) {
		A.setCallNumber(Phonenum);
		A.ring();
	}

	@Override
	public void callC(int Phonenum) {
		C.setCallNumber(Phonenum);
		C.ring();
	}

}
