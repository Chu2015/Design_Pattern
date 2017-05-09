package behavior.memento;

import java.util.HashMap;
import java.util.Map;

public class Storage {
	private Map<String, Memento> memMap = new HashMap<String, Memento>();  
	
	public Storage(String index,Memento memento){
		memMap.put(index, memento);
	}

	public Memento getMemento(String index) {
		return memMap.get(index);
	}
	
	
}
