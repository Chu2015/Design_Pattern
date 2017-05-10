package behavior.state;

public class CoolState extends State{

	@Override
	public void handle(AirCondition ac) {
		ac.coldWind();
	}

}
