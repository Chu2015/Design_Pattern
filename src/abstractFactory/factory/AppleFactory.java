package abstractFactory.factory;

import abstractFactory.product.AppleLaptop;
import abstractFactory.product.ApplePhone;
import abstractFactory.product.Laptop;
import abstractFactory.product.Phone;

public class AppleFactory implements Factory{

	public Phone producePhone() {
		return new ApplePhone();
	}

	public Laptop produceLaptop() {
		return new AppleLaptop();
	}
	
}
