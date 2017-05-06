package abstractFactory.product;

public class ApplePhone implements Phone{

	public void call() {
		System.out.println("Applephone is calling");
	}

	public void sendmessage() {
		System.out.println("Applephone is sendding");
	}

}
