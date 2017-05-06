package abstractFactory.factory;

import abstractFactory.product.Laptop;

public class Test {
	public static void main(String[] args){
		Factory factory1 = new AppleFactory();
		Laptop laptop1= factory1.produceLaptop();
		laptop1.email();
		
		Factory factory2 = new LenovoFactory();
		Laptop laptop2= factory2.produceLaptop();
		laptop2.email();
		
	}
	
	
}
