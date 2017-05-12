package behavior.mediator;

abstract class AbstractPhone {  
	//本机电话
    private int phoneNumber;  
	//来电显示
    private int callNumber;  
    
    protected AbstractMediator abstractMediator;
    
	public int getCallNumber() {
		return callNumber;
	}
	public void setCallNumber(int callNumber) {
		this.callNumber = callNumber;
	}
	public int getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public AbstractMediator getAbstractMediator() {
		return abstractMediator;
	}
	public void setAbstractMediator(AbstractMediator abstractMediator) {
		this.abstractMediator = abstractMediator;
	} 
	
    
    public void ring(){
    	System.out.println("phone "+phoneNumber+" is ringing, the caller is"+callNumber);
    }
    

    public AbstractPhone(int number){
    	this.phoneNumber = number;
    }
 
}  
