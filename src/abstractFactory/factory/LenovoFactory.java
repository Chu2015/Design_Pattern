package abstractFactory.factory;

import abstractFactory.product.Laptop;
import abstractFactory.product.LenovoLaptop;
import abstractFactory.product.LenovoPhone;
import abstractFactory.product.Phone;

public class LenovoFactory implements Factory{

	public Phone producePhone() {
		return new LenovoPhone();
	}

	public Laptop produceLaptop() {
		return new LenovoLaptop();
	}

}
