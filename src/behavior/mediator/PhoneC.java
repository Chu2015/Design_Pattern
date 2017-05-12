package behavior.mediator;

class PhoneC extends AbstractPhone{

	public PhoneC (int number) {
		super(number);
	}
	public void callB(){
		abstractMediator.callB(getPhoneNumber());
	}
	public void callA(){
		abstractMediator.callA(getPhoneNumber());
	}
}  