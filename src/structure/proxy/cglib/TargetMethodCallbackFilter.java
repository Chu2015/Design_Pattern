package structure.proxy.cglib;

import java.lang.reflect.Method;  

import net.sf.cglib.proxy.CallbackFilter;  
/** 
 * �ص��������� 
 * @author zghw 
 * 
 */  
public class TargetMethodCallbackFilter implements CallbackFilter {  
  
    /** 
     * ���˷��� 
     * ���ص�ֵΪ���֣�������Callback�����е�����λ�ã�Ҫ���õ�Callback 
     */  
    @Override  
    public int accept(Method method) {  
        if(method.getName().equals("method1")){  
            System.out.println("filter method1 ==0");  
            return 0;  
        }  
        if(method.getName().equals("method2")){  
            System.out.println("filter method2 ==1");  
            return 1;  
        }  
        if(method.getName().equals("method3")){  
            System.out.println("filter method3 ==2");  
            return 2;  
        }  
        return 0;  
    }  
  
}  