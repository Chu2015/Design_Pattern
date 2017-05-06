package structure.bridge;

public class SonyTV implements TV{
	private int channel;
	
	public void on(){
		System.out.println("sonyTv has been turned on");
	};
	
	public void off(){
		System.out.println("sonyTv has been turned off");
	};
	
	public void switchChannel(int channel){
		this.channel = channel;
		System.out.println("sonyTv's channel is "+channel+" now");
	};
}
