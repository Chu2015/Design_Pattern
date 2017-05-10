package behavior.state;

public class HotState extends State{

	@Override
	public void handle(AirCondition ac) {
		ac.warmWind();
	}

}
