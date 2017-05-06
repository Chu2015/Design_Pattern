package structure.decorator.breakfast;

public class Ham extends BreakfastDecorator{

	public Ham(Breakfast breakfast) {
		super(breakfast);
	}

	@Override
	public String getDescription() {
		return "����"+super.getDescription();
	}

	@Override
	public Double cost() {
		return super.cost()+5.00;
	}

}
