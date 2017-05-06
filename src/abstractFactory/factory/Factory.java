package abstractFactory.factory;

import abstractFactory.product.Laptop;
import abstractFactory.product.Phone;

public interface Factory {
	public Phone producePhone();
	public Laptop produceLaptop();
}
