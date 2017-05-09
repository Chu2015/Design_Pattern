package behavior.observer;

import java.util.ArrayList;
import java.util.List;

public class Mysubject implements Subject{
	
	private String msg;
	
	//ά����һ���û��б�
	List<Observer> observers = new ArrayList<Observer>(); 
	
	//����û�
	public void add(Observer observer) {
		observers.add(observer);
	}
	//ɾ���û�
	public void delete(Observer observer) {
		observers.remove(observer);
	}
	//֪ͨ�����û�
	public void notifyObservers() {
		for(Observer o : observers){
			o.update(msg);
		}
	}
	//��ʼ���²�������Ϣ
	public void distributemsg(String s){
		this.msg = s;
		notifyObservers();
	}
}	
