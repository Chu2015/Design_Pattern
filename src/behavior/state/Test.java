package behavior.state;

public class Test {

	public static void main(String arg[]){
		AirCondition ac = new AirCondition();
		
		State cool = new CoolState();
		ac.setState(cool);
		ac.run();
		
		State warm = new HotState();
		ac.setState(warm);
		ac.run();
	}
	
}
