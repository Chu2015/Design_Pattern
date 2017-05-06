package observer;

public interface Subject {
	//添加用户
	void add(Observer observer);
	//删除用户
	void delete(Observer observer);
	//通知所有用户
	void notifyObservers();
}
