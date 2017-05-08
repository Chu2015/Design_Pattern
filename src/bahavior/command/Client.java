package bahavior.command;

public class Client {
	
	public static void main(String[] args){
		  // 创建调用者  
	    Invoker invoker = new Invoker();  
	
	    // 创建一个具体命令，并指定该命令被执行的具体接收者  
	    AbstractCommand command01 = new Command01(new Receiver01());  

	    // 给调用者发布一个具体命令  
	    invoker.setCommand(command01);  
	
	    // 调用者执行命令，其实是将其传送给具体的接收者并让其真正执行  
	    invoker.action();  
	    
        AbstractCommand command02 = new Command02(new Receiver02());  
        invoker.setCommand(command02);  
        invoker.action();  
	}
}
