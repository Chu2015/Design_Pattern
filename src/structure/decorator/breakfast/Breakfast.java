package structure.decorator.breakfast;

public abstract class Breakfast {

	public String description ="unknown";

	public String getDescription() {
		return description;
	}

	public abstract Double cost();
	
}
