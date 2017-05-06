package structure.bridge;

public class SwithRemoteControl extends AbstractRemoteControl{

	public SwithRemoteControl(TV television) {
		super(television);
	}
	
	public void switchChannel(int channel){
		this.television.switchChannel(channel);
	}

}
