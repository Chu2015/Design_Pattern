package singleton;

public class SingletonTest {

	public static void main(String[] args){
		Mythread mythread = new Mythread();
		for(int i=0;i<=100;i++){
			Thread t = new Thread(mythread,String.valueOf(i));
			t.start();
		}
	}
}
