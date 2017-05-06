package observer;

public class User2 implements Observer{

	public void update(String msg) {
		System.out.println("msg for user2(富豪):"+msg+"与我无关");
	}

}
