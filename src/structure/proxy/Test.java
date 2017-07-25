package structure.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class Test {

	public static void main(String[] args){
		Study s1 = new Student();
		s1.study();
		
		Study s = new StudentProxy();
		s.study();

		MyInvocationHandler mih = new MyInvocationHandler(s1);
		Study s1proxy = (Study) mih.getProxy();
		s1proxy.study();
		
	}
}
