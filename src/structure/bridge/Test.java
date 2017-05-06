package structure.bridge;

public class Test {

	public static void main(String[] main){
		TV tv = new SonyTV();
		SwithRemoteControl abc= new SwithRemoteControl(tv);
		abc.turnonTV();
		abc.switchChannel(5);
	}
	
}
