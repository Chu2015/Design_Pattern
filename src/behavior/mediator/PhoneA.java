package behavior.mediator;

class PhoneA extends AbstractPhone{

	public PhoneA (int number) {
		super(number);
	}

	public void callB(){
		abstractMediator.callB(getPhoneNumber());
	}
	public void callC(){
		abstractMediator.callC(getPhoneNumber());
	}
	
}  