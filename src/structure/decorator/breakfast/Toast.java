package structure.decorator.breakfast;

public class Toast extends Breakfast{
	
	public Toast(){
		this.description = "ÍÂË¾";
	}
	
	@Override
	public Double cost() {
		return 10.00;
	}

}
