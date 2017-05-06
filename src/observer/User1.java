package observer;

public class User1 implements Observer{

	public void update(String msg) {
		System.out.println("msg for user1(普通用户):"+msg+"重要消息");
	}

}
