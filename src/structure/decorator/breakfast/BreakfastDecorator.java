package structure.decorator.breakfast;

public abstract class BreakfastDecorator extends Breakfast{

	private Breakfast breakfast;
	
	public BreakfastDecorator(Breakfast breakfast){
		this.breakfast = breakfast;
	}

	@Override
	public String getDescription() {
		return breakfast.getDescription();
	}

	@Override
	public Double cost() {
		return breakfast.cost();
	}
	
}
