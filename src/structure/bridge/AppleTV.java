package structure.bridge;

public class AppleTV implements TV{
	private int channel;
	
	public void on(){
		System.out.println("appleTv has been turned on");
	};
	
	public void off(){
		System.out.println("appleTv has been turned off");
	};
	
	public void switchChannel(int channel){
		this.channel = channel;
		System.out.println("appleTv's channel is "+channel+" now");
	};
	
}
