package bahavior.command;

public class Command01 extends AbstractCommand{
	private AbstractReceiver receiver = null;
	
	public Command01(AbstractReceiver receiver){
		this.receiver = receiver;
	}
	
	@Override
	public void execute() {
		System.out.println("√¸¡Ó1£∫»•Ω”»À");
		receiver.doJob();
	}

}
