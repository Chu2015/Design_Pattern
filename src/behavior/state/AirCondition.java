package behavior.state;

public class AirCondition {
	
	private State state;
	
	
	public State getState() {
		return state;
	}

	public void setState(State state) {
		this.state = state;
	}

	public void run(){
		state.handle(this);
	}
	
	public void warmWind(){
		System.out.println("吹暖风");
	}
	
	public void coldWind(){
		System.out.println("吹冷风");
	}
}
