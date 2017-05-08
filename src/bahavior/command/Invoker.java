package bahavior.command;

public class Invoker {
	
	private AbstractCommand command = null;
	
	public void setCommand(AbstractCommand command){
		this.command = command;
	}
	
	public void action(){
		this.command.execute();
	}
}
