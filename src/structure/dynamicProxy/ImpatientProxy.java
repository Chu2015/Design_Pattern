package structure.dynamicProxy;

import java.lang.reflect.*;

public class ImpatientProxy implements InvocationHandler{

	private Object obj;
	private ImpatientProxy(Object obj){
		this.obj = obj;
	}
	@Override
	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable {
		 Object result;
		 long t1 = System.currentTimeMillis();
		 result = method.invoke(obj, args);
		 long t2 = System.currentTimeMillis();
		 System.out.println("it takes " + (t2-t1));
		return result;
	}
	
	public static Object newInstance(Object obj){
		ClassLoader loader = obj.getClass().getClassLoader();
		Class[] classes = obj.getClass().getInterfaces();
		return Proxy.newProxyInstance(loader, classes, new ImpatientProxy(obj));
	}
	
}
