package behavior.memento;

import java.beans.BeanInfo;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

public class Original {

	private int value;
	private int value1;
	private int value2;

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public int getValue2() {
		return value2;
	}

	public void setValue2(int value2) {
		this.value2 = value2;
	}

	public int getValue1() {
		return value1;
	}

	public void setValue1(int value1) {
		this.value1 = value1;
	}
	
    public Memento createMemento(){  
        return new Memento(BeanUtils.backupProp(this));  
    }  
    
    public void restoreMemento(Memento memento){  
        BeanUtils.restoreProp(this, memento.getStateMap());  
    }  
    public String toString(){  
        return "value="+value+"value1="+value1+"value2="+value1;  
    } 
}
class BeanUtils {  
    public static Map<String, Object> backupProp(Object bean){  
        Map<String, Object> result = new HashMap<String, Object>();  
        try{  
            BeanInfo beanInfo = Introspector.getBeanInfo(bean.getClass());  
            PropertyDescriptor[] descriptors = beanInfo.getPropertyDescriptors();  
            for(PropertyDescriptor des: descriptors){  
                String fieldName = des.getName();  
                Method getter = des.getReadMethod();  
                Object fieldValue = getter.invoke(bean, new Object[]{});  
                if(!fieldName.equalsIgnoreCase("class")){  
                    result.put(fieldName, fieldValue);  
                }  
            }  
              
        }catch(Exception e){  
            e.printStackTrace();  
        }  
        return result;  
    }  
      
    public static void restoreProp(Object bean, Map<String, Object> propMap){  
        try {  
            BeanInfo beanInfo = Introspector.getBeanInfo(bean.getClass());  
            PropertyDescriptor[] descriptors = beanInfo.getPropertyDescriptors();  
            for(PropertyDescriptor des: descriptors){  
                String fieldName = des.getName();  
                if(propMap.containsKey(fieldName)){  
                    Method setter = des.getWriteMethod();  
                    setter.invoke(bean, new Object[]{propMap.get(fieldName)});  
                }  
            }  
        } catch (Exception e) {  
            e.printStackTrace();  
        }  
    }  
}  
