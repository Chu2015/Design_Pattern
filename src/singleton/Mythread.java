package singleton;

public class Mythread implements Runnable{

	public void run() {
		Singleton instance = null;
		instance =	Singleton.getInstance3();
		System.out.println(instance+" : "+instance.hashCode());
	}

}
