package observer;

public interface Subject {
	//����û�
	void add(Observer observer);
	//ɾ���û�
	void delete(Observer observer);
	//֪ͨ�����û�
	void notifyObservers();
}
