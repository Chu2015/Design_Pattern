package bahavior.command;

public class Command02 extends AbstractCommand{
	private AbstractReceiver receiver = null;
	
	public Command02(AbstractReceiver receiver){
		this.receiver = receiver;
	}
	
	@Override
	public void execute() {
		System.out.println("ÃüÁî2£ºÈ¥ÂòÒÂ·ş");
		receiver.doJob();
	}

}
