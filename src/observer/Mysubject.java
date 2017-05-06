package observer;

import java.util.ArrayList;
import java.util.List;

public class Mysubject implements Subject{
	
	private String msg;
	
	//维护了一个用户列表
	List<Observer> observers = new ArrayList<Observer>(); 
	
	//添加用户
	public void add(Observer observer) {
		observers.add(observer);
	}
	//删除用户
	public void delete(Observer observer) {
		observers.remove(observer);
	}
	//通知所有用户
	public void notifyObservers() {
		for(Observer o : observers){
			o.update(msg);
		}
	}
	//开始更新并推送消息
	public void distributemsg(String s){
		this.msg = s;
		notifyObservers();
	}
}	
