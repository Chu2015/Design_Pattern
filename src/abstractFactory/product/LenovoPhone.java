package abstractFactory.product;

public class LenovoPhone implements Phone{

	public void call() {
		System.out.println("LenovoPhone is calling");
	}

	public void sendmessage() {
		System.out.println("LenovoPhone is sendding");
	}

}
