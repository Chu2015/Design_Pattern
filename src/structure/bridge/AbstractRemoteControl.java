package structure.bridge;

//只提供开关功能的基本遥控器
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
