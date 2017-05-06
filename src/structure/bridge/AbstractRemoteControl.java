package structure.bridge;

//ֻ�ṩ���ع��ܵĻ���ң����
public abstract class AbstractRemoteControl {

	public TV television;
	
	public AbstractRemoteControl(TV television){
		this.television = television;
	}
	
	public void turnonTV(){
		television.on();
	}
	public void turnoffTV(){
		television.off();
	}
	
}
