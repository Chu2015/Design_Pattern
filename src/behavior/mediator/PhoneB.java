package behavior.mediator;

class PhoneB extends AbstractPhone{

	public PhoneB(int number) {
		super(number);
	}

	public void callA(){
		abstractMediator.callA(getPhoneNumber());
	}
	public void callC(){
		abstractMediator.callC(getPhoneNumber());
	}
}  
