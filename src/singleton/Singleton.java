package singleton;

public class Singleton {
	
	private static Singleton instance;
	
	private Singleton(){}
	
	private static Object lock = new Object();
	//静态方法倍同步，线程安全但是效率低
	public synchronized static Singleton getInstance(){
		if(instance==null){
			instance = new Singleton();
		}
			return instance;
	}
	
	//只有再instance为null时才同步
	public static Singleton getInstance2(){
		if(instance==null){
			synchronized(lock){
				System.out.println("进入同步区");
				if(instance==null){
					instance = new Singleton();
				}
			}
		}
		return instance;
	}
	
	//书上的解法
	public static Singleton getInstance3(){
	
			synchronized(Singleton.class){
				System.out.println("进入同步区");
				if(instance==null){
					instance = new Singleton();
				}
			}

		return instance;
	}
}
