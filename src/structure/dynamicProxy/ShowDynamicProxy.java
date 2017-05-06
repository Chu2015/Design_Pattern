package structure.dynamicProxy;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

public class ShowDynamicProxy {
	public static void main(String[] args){
		Set s =new HashSet();
		s = (Set) ImpatientProxy.newInstance(s);
		s.add(new Date());
	}
}
