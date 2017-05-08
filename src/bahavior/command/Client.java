package bahavior.command;

public class Client {
	
	public static void main(String[] args){
		  // ����������  
	    Invoker invoker = new Invoker();  
	
	    // ����һ�����������ָ�������ִ�еľ��������  
	    AbstractCommand command01 = new Command01(new Receiver01());  

	    // �������߷���һ����������  
	    invoker.setCommand(command01);  
	
	    // ������ִ�������ʵ�ǽ��䴫�͸�����Ľ����߲���������ִ��  
	    invoker.action();  
	    
        AbstractCommand command02 = new Command02(new Receiver02());  
        invoker.setCommand(command02);  
        invoker.action();  
	}
}
